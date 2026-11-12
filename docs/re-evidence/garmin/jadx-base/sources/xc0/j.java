package xc0;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxc0/j;", "Lzw2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends zw2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f189929c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189930b;

    static {
        new a(null);
        Parcelable.Creator<xw2.b> creator = xw2.b.CREATOR;
        int i14 = gt2.c.f79010a;
        f189929c = gt2.b.f79005a.h("RTS-HandAlignmentTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189930b = bVar;
    }

    @Override // zw2.h
    public final void l(Fragment fragment, ax2.a aVar) {
        fragment.getClass();
        f189929c.debug("HandAlignment clicked.");
        com.garmin.android.apps.connectmobile.handalignment.e eVar = new com.garmin.android.apps.connectmobile.handalignment.e();
        fragment.getF158016a().a(eVar);
        androidx.fragment.app.m mVarRequireActivity = fragment.requireActivity();
        xw2.b bVar = this.f189930b;
        eVar.a(mVarRequireActivity, bVar.f192449a, bVar.f192451c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxc0/j$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
