package real.com.rcsplugin.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by bkoruznjak on 16/01/2018.
 */

public class PluginService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("žžž", "plugin service started");
        return Service.START_NOT_STICKY;
    }
}
