package xc0;

import android.content.Context;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxc0/e;", "Lzw2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends zw2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f189913c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189914b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSFeatureSetupTransform", f = "RTSFeatureSetupTransform.kt", l = {25}, m = "shouldHideSetting", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f189915a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f189917c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f189915a = obj;
            this.f189917c |= Integer.MIN_VALUE;
            return e.this.l(this);
        }
    }

    static {
        Parcelable.Creator<xw2.b> creator = xw2.b.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189914b = bVar;
    }

    @Override // zw2.e
    public final Object k(bv2.l.a aVar) {
        return m(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zw2.e
    public final Object l(t13.d<? super Boolean> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f189917c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f189917c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objM = aVar.f189915a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f189917c;
        if (i15 == 0) {
            o13.r.b(objM);
            aVar.f189917c = 1;
            objM = m(aVar);
            if (objM == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        return Boolean.valueOf(((Number) objM).intValue() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f189912c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f189912c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.f189910a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f189912c;
        if (i15 == 0) {
            o13.r.b(objB);
            b31.a aVar2 = (b31.a) KoinJavaComponent.get$default(b31.a.class, null, null, 6, null);
            long j8 = this.f189914b.f192449a;
            d31.c cVar2 = d31.c.NOT_STARTED;
            dVar.f189912c = 1;
            objB = aVar2.b(j8, cVar2, dVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objB) {
            if (((d31.a) obj).f57326f != d31.d.DEVICE_WELCOME) {
                arrayList.add(obj);
            }
        }
        return new Integer(arrayList.size());
    }
}
