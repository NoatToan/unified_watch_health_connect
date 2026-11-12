package m10;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import mo1.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f115759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115760c;

    public /* synthetic */ a(b bVar, String str, int i14) {
        this.f115758a = i14;
        this.f115759b = bVar;
        this.f115760c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        g3 g3Var = (g3) obj;
        switch (this.f115758a) {
            case 0:
                b.InterfaceC2201b interfaceC2201b = this.f115759b.f115761a;
                int i14 = b.a.f115764a[g3Var.f35300a.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2 && interfaceC2201b != null) {
                        Integer num = g3Var.f35304e;
                        interfaceC2201b.o(num != null ? num.intValue() : 0);
                        i2.f(a2.CONNECTIONS, "ActivityLiker", "Error liking activity with ID [" + this.f115760c + "].");
                    }
                    break;
                } else {
                    T t7 = g3Var.f35301b;
                    if (t7 != 0 && interfaceC2201b != null) {
                        f fVar = (f) t7;
                        interfaceC2201b.E5(1, fVar.getUuid(), fVar.getConversationLikePk());
                        break;
                    }
                }
                break;
            default:
                b.InterfaceC2201b interfaceC2201b2 = this.f115759b.f115761a;
                int i15 = b.a.f115764a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    if (interfaceC2201b2 != null) {
                        interfaceC2201b2.E5(2, null, 0L);
                    }
                } else if (i15 == 2 && interfaceC2201b2 != null) {
                    Integer num2 = g3Var.f35304e;
                    interfaceC2201b2.o(num2 != null ? num2.intValue() : 0);
                    i2.f(a2.CONNECTIONS, "ActivityLiker", "Error unliking activity with conversationUUID [" + this.f115760c + "].");
                }
                break;
        }
    }
}
