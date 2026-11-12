package wc0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.connectiq.l;
import hk0.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd2.f;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwc0/a;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3412a f184266a = new C3412a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f184267b;

    static {
        int i14 = gt2.c.f79010a;
        f184267b = gt2.b.f79005a.h("DSL-RedirectExternalIntent");
    }

    /* JADX INFO: renamed from: wc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwc0/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3412a {

        /* JADX INFO: renamed from: wc0.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3413a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f184268a;

            static {
                int[] iArr = new int[u0.values().length];
                try {
                    iArr[u0.M1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f184268a = iArr;
            }
        }

        public /* synthetic */ C3412a(j jVar) {
            this();
        }

        public static boolean a(Context context, long j8) {
            boolean zK = p.k(j8);
            if (!zK) {
                new e.a(context).setTitle(R.string.connect_iq_device_not_connected_title).setMessage(R.string.connect_iq_device_not_connected_msg).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).create().show();
            }
            return zK;
        }

        public static Intent b(Context context, f fVar, l lVar) {
            if (!a(context, fVar.getUnitID())) {
                return null;
            }
            Intent intent = new Intent(context, (Class<?>) ConnectIQDownloadListActivity.class);
            intent.putExtra("CONNECT_IQ_CATEGORY", lVar);
            intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", fVar.getUnitID());
            return intent;
        }

        private C3412a() {
        }
    }
}
