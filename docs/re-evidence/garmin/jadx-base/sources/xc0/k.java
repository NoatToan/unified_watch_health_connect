package xc0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lxc0/k;", "Lbx2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "Lgj1/c;", "primaryDevice", "<init>", "(Landroid/content/Context;Lxw2/b;Lgj1/c;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends bx2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj1.c f189931b;

    static {
        new a(null);
        Parcelable.Creator<xw2.b> creator = xw2.b.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, xw2.b bVar, gj1.c cVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189931b = cVar;
    }

    @Override // bx2.d, bx2.c
    public final boolean k(Map<String, ? extends Object> map) {
        gj1.c cVar = this.f189931b;
        return cVar != null && cVar.f77655d;
    }

    @Override // bx2.d
    public final void l() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
        Context context = this.f207282a;
        Intent intent = new Intent(context, (Class<?>) MoreActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxc0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(Context context, xw2.b bVar, gj1.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, bVar, (i14 & 4) != 0 ? null : cVar);
    }
}
