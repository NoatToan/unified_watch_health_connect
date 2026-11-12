package tg0;

import android.content.Context;
import androidx.appcompat.app.e;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltg0/a;", "", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3085a f164490a = new C3085a(null);

    /* JADX INFO: renamed from: tg0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltg0/a$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3085a {
        public /* synthetic */ C3085a(j jVar) {
            this();
        }

        public static e a(Context context) {
            context.getClass();
            String str = NumberFormat.getIntegerInstance().format(((ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null)).d().d());
            f fVar = f.f23050a;
            String string = context.getString(R.string.pregnancy_limit_reached);
            String string2 = context.getString(R.string.accounts_you_can_view_limit, str);
            String string3 = context.getString(R.string.lbl_ok);
            string3.getClass();
            return f.d(fVar, context, string, string2, new p(string3, new td0.a((byte) 0, 13)), null, null, false, 112);
        }

        public static e b(Context context) {
            context.getClass();
            String str = NumberFormat.getIntegerInstance().format(((ve0.b) KoinJavaComponent.get$default(ve0.b.class, null, null, 6, null)).d().e());
            f fVar = f.f23050a;
            String string = context.getString(R.string.pregnancy_limit_reached);
            String string2 = context.getString(R.string.authorized_viewer_limit, str);
            String string3 = context.getString(R.string.lbl_ok);
            string3.getClass();
            return f.d(fVar, context, string, string2, new p(string3, new td0.a((byte) 0, 12)), null, null, false, 112);
        }

        private C3085a() {
        }
    }
}
