package idea.analyzesystem.bmob.demo;

import android.app.Application;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobConfig;

/**
 * Created by idea on 2018/5/25.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BmobConfig config =new BmobConfig.Builder(this)
                .setApplicationId("Your Application ID")
                .setConnectTimeout(15)
                .setUploadBlockSize(1024*1024)
                .setFileExpiration(2500)
                .build();
        Bmob.initialize(config);
    }
}
