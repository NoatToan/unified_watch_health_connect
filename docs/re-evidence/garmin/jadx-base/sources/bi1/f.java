package bi1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbi1/f;", "Lh32/b;", "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroidx/fragment/app/v;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends h32.b {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.v vVar) {
        super(vVar);
        vVar.getClass();
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return 3;
    }

    @Override // androidx.fragment.app.a0
    public final Fragment getItem(int i14) {
        if (i14 == 0) {
            h.f18034b.getClass();
            return new h();
        }
        if (i14 == 1) {
            d.f18024j.getClass();
            return new d();
        }
        if (i14 != 2) {
            return new Fragment();
        }
        c.f18016c.getClass();
        return new c();
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        if (i14 == 0) {
            return contextC.getString(R.string.device_setting_watch_face_style);
        }
        if (i14 != 1) {
            return i14 != 2 ? "" : contextC.getString(R.string.device_setting_watch_face_color);
        }
        return contextC.getString(R.string.device_setting_watch_face_complications);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lbi1/f$a;", "", "<init>", "()V", "", "TABS_COUNT", "I", "TAB_POSITION_STYLE", "TAB_POSITION_COMPLICATIONS", "TAB_POSITION_COLOR", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
