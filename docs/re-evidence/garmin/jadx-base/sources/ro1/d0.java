package ro1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lro1/d0;", "Landroidx/fragment/app/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends androidx.fragment.app.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153928a;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, androidx.fragment.app.v vVar) {
        super(vVar, 1);
        context.getClass();
        vVar.getClass();
        this.f153928a = context;
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return 2;
    }

    @Override // androidx.fragment.app.a0
    public final Fragment getItem(int i14) {
        return i14 == 0 ? new d() : new j0();
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        Context context = this.f153928a;
        return i14 == 0 ? context.getString(R.string.app_tour_stats_title) : context.getString(R.string.social_photo_sharing_stickers);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lro1/d0$a;", "", "<init>", "()V", "", "TABS_COUNT", "I", "TAB_DATA_OPTION", "TAB_STICKER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
