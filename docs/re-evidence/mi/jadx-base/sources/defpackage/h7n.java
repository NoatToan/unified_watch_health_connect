package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h7n {
    public static h7n j(Bundle bundle) {
        return new qht(bundle.getInt(OneTrack.Param.SESSION_ID), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int b();

    @Deprecated
    public abstract PendingIntent c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    public abstract List g();

    public abstract List h();

    public abstract List i();
}
