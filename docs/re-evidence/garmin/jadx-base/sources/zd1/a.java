package zd1;

import android.content.Context;
import android.content.Intent;
import b63.o;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzd1/a;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f204221a = new a();

    /* JADX INFO: renamed from: zd1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzd1/a$a;", "", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3809a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f204222a;

        public C3809a(Intent intent) {
            intent.getClass();
            this.f204222a = intent;
        }

        public final void a(o oVar) {
            b.f204223a.getClass();
            this.f204222a.putExtra("EXTRA_INITIAL_DATE", oVar.f16206a.toEpochDay());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3809a) && this.f204222a.equals(((C3809a) obj).f204222a);
        }

        public final int hashCode() {
            return this.f204222a.hashCode();
        }

        public final String toString() {
            return "Extras(intent=" + this.f204222a + ")";
        }
    }

    private a() {
    }

    public static Intent a(Context context, l lVar) {
        context.getClass();
        lVar.getClass();
        Intent intent = new Intent(context, (Class<?>) LifestyleLoggingActivity.class);
        lVar.invoke(new C3809a(intent));
        return intent;
    }
}
