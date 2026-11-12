package aw;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gfdi.framework.DeviceManager;
import da2.e;
import java.util.UUID;
import ma2.f;
import p005kotlin.Metadata;
import pj2.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Law/a;", "Lma2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpj2/k;", "gatt", "<init>", "(Landroid/content/Context;Lpj2/k;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f13312b;

    /* JADX INFO: renamed from: aw.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Law/a$a;", "Lma2/f$a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0186a implements f.a {
        @Override // ma2.f.a
        public final f create(Context context, e eVar, k kVar) {
            context.getClass();
            eVar.getClass();
            kVar.getClass();
            return new a(context, kVar);
        }
    }

    public a(Context context, k kVar) {
        context.getClass();
        kVar.getClass();
        this.f13311a = context;
        this.f13312b = kVar;
    }

    @Override // ma2.f
    public final boolean initialize(UUID uuid, UUID[] uuidArr) {
        k kVar = this.f13312b;
        DeviceManager.register(this.f13311a, kVar.getMacAddress(), 1).setGenericCapability(k.class, kVar);
        return true;
    }

    @Override // ma2.f
    public final void onDeviceDisconnect() {
    }
}
