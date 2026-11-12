package androidx.camera.camera2.internal.compat;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import androidx.camera.core.impl.c0;
import androidx.core.widget.NestedScrollView;
import androidx.media3.exoplayer.o0;
import androidx.recyclerview.widget.RecyclerView;
import bd0.a0;
import bd0.y;
import bd0.z;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.DeviceSetupProgressListViewFragment;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.SimpleSetupProtoManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.concurrent.CopyOnWriteArraySet;
import v.k2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5359d;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.settings.devices.common.c cVar, GDISmartProto.Smart smart, com.garmin.android.apps.connectmobile.settings.devices.common.c.C0799c c0799c, int i14) {
        this.f5356a = 15;
        this.f5358c = cVar;
        this.f5359d = smart;
        this.f5357b = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var;
        int i14 = this.f5356a;
        int i15 = this.f5357b;
        Object obj = this.f5359d;
        Object obj2 = this.f5358c;
        switch (i14) {
            case 0:
                ((k.a) obj2).f5361a.onError((CameraDevice) obj, i15);
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((o0.a) obj2).f9306b.f9300h.j(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair.second, i15);
                break;
            case 2:
                b.g.f fVar = (b.g.f) obj2;
                int i16 = b.g.f.f13805j;
                T t7 = ((g.a.C1502a) obj).f74066a;
                String str = (String) fVar.f67592a.get(Integer.valueOf(i15));
                if (str != null) {
                    f.e.a aVar = (f.e.a) fVar.f67596e.get(str);
                    if ((aVar != null ? aVar.f67599a : null) == null) {
                        fVar.f67598g.remove(str);
                        fVar.f67597f.put(str, t7);
                    } else {
                        f.b<O> bVar = aVar.f67599a;
                        if (fVar.f67595d.remove(str)) {
                            bVar.a(t7);
                        }
                    }
                    break;
                }
                break;
            case 3:
                int i17 = b.g.f.f13805j;
                ((b.g.f) obj2).a(i15, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 4:
                y yVar = (y) obj;
                int i18 = BLEDeviceSetupActivity.f34387q;
                DeviceSetupProgressListViewFragment deviceSetupProgressListViewFragmentJa = ((BLEDeviceSetupActivity) obj2).ja();
                if (deviceSetupProgressListViewFragmentJa != null && (a0Var = deviceSetupProgressListViewFragmentJa.f34439j) != null) {
                    for (int i19 = 0; i19 < a0Var.getCount(); i19++) {
                        z zVar = (z) a0Var.getItem(i19);
                        if (yVar == zVar.f17662b) {
                            zVar.f17667g = i15;
                            a0Var.notifyDataSetChanged();
                        }
                        break;
                    }
                    break;
                }
                break;
            case 5:
                SimpleSetupProtoManager.AnonymousClass1.onResponseFailed$lambda$1((SimpleSetupProtoManager) obj2, (SimpleSetupProtoManager.AnonymousClass1) obj, i15);
                break;
            case 6:
                ((DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionAcquired$0((DrmSessionEventListener) obj, i15);
                break;
            case 7:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) obj2, i15, (ListenerSet.Event) obj);
                break;
            case 8:
                fa.j.a aVar2 = (fa.j.a) obj;
                for (fa.j.c cVar : (CopyOnWriteArraySet) obj2) {
                    if (!cVar.f70030d) {
                        if (i15 != -1) {
                            cVar.f70028b.a(i15);
                        }
                        cVar.f70029c = true;
                        aVar2.invoke(cVar.f70027a);
                    }
                }
                break;
            case 9:
                ((androidx.profileinstaller.b) obj2).f10223c.b(i15, obj);
                break;
            case 10:
                androidx.media3.exoplayer.drm.b.a aVar3 = (androidx.media3.exoplayer.drm.b.a) obj2;
                ((androidx.media3.exoplayer.drm.b) obj).j(aVar3.f8894a, aVar3.f8895b, i15);
                break;
            case 11:
                RecyclerView recyclerView = (RecyclerView) obj;
                NestedScrollView nestedScrollView = ((u40.j) obj2).f168574f;
                if (nestedScrollView != null) {
                    nestedScrollView.scrollTo(0, (int) recyclerView.getChildAt(i15).getY());
                }
                break;
            case 12:
                ((androidx.camera.core.impl.s) obj2).c(i15, (androidx.camera.core.impl.u) obj);
                break;
            case 13:
                ((androidx.camera.core.impl.s) obj2).b(i15, (c0) obj);
                break;
            case 14:
                ((k2) obj2).a((androidx.concurrent.futures.b.a) obj, i15);
                break;
            default:
                GDISmartProto.Smart smart = (GDISmartProto.Smart) obj;
                com.garmin.android.apps.connectmobile.settings.devices.common.c.a aVar4 = ((com.garmin.android.apps.connectmobile.settings.devices.common.c) obj2).f42824b;
                if (aVar4 != null) {
                    aVar4.i5(com.garmin.android.apps.connectmobile.settings.devices.common.c.b.f42825a, smart);
                }
                a2 a2Var = a2.SETTINGS;
                String strH = am.j.h(i15, "on Response Received: ");
                i2.f36769a.getClass();
                i2.a.k(a2Var, "BikeAlarmProto", strH);
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i14, Object obj2, int i15) {
        this.f5356a = i15;
        this.f5358c = obj;
        this.f5357b = i14;
        this.f5359d = obj2;
    }

    public /* synthetic */ j(Object obj, Object obj2, int i14, int i15) {
        this.f5356a = i15;
        this.f5358c = obj;
        this.f5359d = obj2;
        this.f5357b = i14;
    }
}
