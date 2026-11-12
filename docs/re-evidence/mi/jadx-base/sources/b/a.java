package b;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.xiaomi.onetrack.api.b;

/* JADX INFO: loaded from: classes.dex */
public class a extends ContentProvider {
    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (b.n.equals(str)) {
            bundle2.putInt("feature_value", (EnvironmentConfig.isSupportNfc(getContext()) ? 2 : 0) + 257 + (DeviceUtils.getAppVersionCode(getContext(), Constants.PACKAGE_NAME_NEXTPAY) >= 120 ? 512 : 0) + (EnvironmentConfig.isSupportNfc(getContext()) ? 1024 : 0) + (EnvironmentConfig.isSupportNfc(getContext()) ? 2048 : 0));
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
