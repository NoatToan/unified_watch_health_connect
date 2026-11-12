package vc0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lvc0/o;", "Lgi2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "Lgj1/c;", "primaryDevice", "<init>", "(Landroid/content/Context;Lsd2/f;Lgj1/c;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends gi2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gj1.c f177000d;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, sd2.f fVar, gj1.c cVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176999c = fVar;
        this.f177000d = cVar;
    }

    @Override // gi2.c
    public final boolean r(Map<String, ? extends Object> map) {
        gj1.c cVar = this.f177000d;
        return cVar != null && cVar.f77655d;
    }

    @Override // gi2.d
    public final void s() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
        Context context = this.f64388a;
        Intent intent = new Intent(context, (Class<?>) MoreActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvc0/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ o(Context context, sd2.f fVar, gj1.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, fVar, (i14 & 4) != 0 ? null : cVar);
    }
}
