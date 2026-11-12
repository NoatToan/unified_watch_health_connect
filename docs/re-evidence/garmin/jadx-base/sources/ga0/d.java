package ga0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.w;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;
import v13.e;
import v13.i;
import z80.f;
import zb0.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.DeviceCustomizationViewModel$initData$1", f = "DeviceCustomizationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f76617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f76617a = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f76617a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0 A[PHI: r3
      0x00c0: PHI (r3v9 zb0.s0) = (r3v7 zb0.s0), (r3v12 zb0.s0) binds: [B:39:0x0120, B:25:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        List<w> list;
        s0 s0Var;
        Object next;
        Object next2;
        s0 s0VarA;
        w wVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        a aVar2 = this.f76617a;
        List<j90.e> list2 = aVar2.f76592a.f143495c.f111531p.f58440f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            j90.e eVar = (j90.e) obj2;
            h90.d dVar = aVar2.f76595d;
            f fVar = aVar2.f76603l;
            dVar.getClass();
            eVar.getClass();
            if (h90.d.b.f82524a[eVar.ordinal()] == 1) {
                if (fVar != null && (list = fVar.f203043a) != null && !list.isEmpty()) {
                    Locale locale = Locale.getDefault();
                    String language = locale.getLanguage();
                    String country = locale.getCountry();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        s0Var = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        w wVar2 = (w) next;
                        Locale locale2 = new Locale(wVar2.f(), wVar2.d());
                        if (s.g(language, locale2.getLanguage()) && s.g(country, locale2.getCountry())) {
                            break;
                        }
                    }
                    w wVar3 = (w) next;
                    if (wVar3 != null) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICE_SETUP, "DeviceCustomizationWizardFilterUseCase", "getDeviceLanguageForUserDefaultLocale(): " + wVar3 + " matches user's default language and country.");
                        s0.a aVar3 = s0.f203651c;
                        Integer numValueOf = Integer.valueOf(wVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
                        aVar3.getClass();
                        s0VarA = s0.a.a(numValueOf, null);
                        if (s0VarA != s0.GCMDeviceLanguageInvalid) {
                            s0Var = s0VarA;
                        }
                    } else {
                        Iterator<T> it3 = list.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            wVar = (w) next2;
                        } while (!s.g(language, new Locale(wVar.f(), wVar.d()).getLanguage()));
                        w wVar4 = (w) next2;
                        if (wVar4 != null) {
                            i2.f36769a.getClass();
                            i2.a.b(a2.DEVICE_SETUP, "DeviceCustomizationWizardFilterUseCase", "getDeviceLanguageForUserDefaultLocale(): " + wVar4 + " matches user's default language only.");
                        }
                        if (wVar4 != null) {
                            s0.a aVar4 = s0.f203651c;
                            Integer numValueOf2 = Integer.valueOf(wVar4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
                            aVar4.getClass();
                            s0VarA = s0.a.a(numValueOf2, null);
                            if (s0VarA != s0.GCMDeviceLanguageInvalid) {
                                s0Var = s0VarA;
                            }
                        }
                    }
                    if (s0Var == null) {
                    }
                }
            }
            arrayList.add(obj2);
        }
        aVar2.f76602k = arrayList;
        p2 p2Var = aVar2.f76598g;
        do {
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
        return Unit.INSTANCE;
    }
}
