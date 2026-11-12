package aj1;

import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import c80.q;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.MobileNotificationSettingsFragment$configPreferenceList$2", f = "MobileNotificationSettingsFragment.kt", l = {338, 348, 350, 361}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1 f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z70.j f3437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.b f3441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.android.apps.connectmobile.settings.notifications.b bVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f3441f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f3441f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f8  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (r14 == r0) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z70.j jVar;
        j1 j1Var;
        boolean z14;
        z70.j jVar2;
        boolean zBooleanValue;
        SwitchPreferenceCompat switchPreferenceCompat;
        ArrayList arrayList;
        Object objB;
        boolean z15;
        boolean z16;
        j1 j1Var2;
        v2 v2Var;
        SwitchPreferenceCompat switchPreferenceCompat2;
        ArrayList arrayList2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3440e;
        com.garmin.android.apps.connectmobile.settings.notifications.b bVar = this.f3441f;
        if (i14 == 0) {
            r.b(obj);
            j1 j1Var3 = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            jVar = (z70.j) KoinJavaComponent.get$default(z70.j.class, null, null, 6, null);
            q qVar = q.LIVE_ACTIVITY;
            this.f3436a = j1Var3;
            this.f3437b = jVar;
            this.f3440e = 1;
            Object objL = j1Var3.l(qVar, this);
            if (objL != aVar) {
                j1Var = j1Var3;
                obj = objL;
            }
            return aVar;
        }
        if (i14 == 1) {
            jVar = this.f3437b;
            j1Var = this.f3436a;
            r.b(obj);
        } else {
            if (i14 == 2) {
                z14 = this.f3438c;
                jVar2 = this.f3437b;
                j1Var = this.f3436a;
                r.b(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    this.f3436a = j1Var;
                    this.f3437b = null;
                    this.f3438c = z14;
                    this.f3439d = zBooleanValue;
                    this.f3440e = 3;
                    objB = jVar2.b(this);
                    if (objB != aVar) {
                        boolean z17 = z14;
                        z15 = zBooleanValue;
                        obj = objB;
                        z16 = z17;
                        j1Var2 = j1Var;
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            switchPreferenceCompat2 = bVar.V0;
                            if (switchPreferenceCompat2 != null) {
                                switchPreferenceCompat2.A(false);
                            }
                            if (switchPreferenceCompat2 != null) {
                                arrayList2 = bVar.f43607l;
                                if (arrayList2 == null) {
                                    s.m("mPreferenceList");
                                    throw null;
                                }
                                arrayList2.remove(switchPreferenceCompat2);
                            }
                        } else {
                            switchPreferenceCompat2 = bVar.V0;
                            if (switchPreferenceCompat2 != null) {
                                switchPreferenceCompat2.A(false);
                            }
                            if (switchPreferenceCompat2 != null) {
                                arrayList2 = bVar.f43607l;
                                if (arrayList2 == null) {
                                    s.m("mPreferenceList");
                                    throw null;
                                }
                                arrayList2.remove(switchPreferenceCompat2);
                            }
                        }
                        zBooleanValue = z15;
                        z14 = z16;
                        j1Var = j1Var2;
                        this.f3436a = null;
                        this.f3437b = null;
                        this.f3438c = z14;
                        this.f3439d = zBooleanValue;
                        this.f3440e = 4;
                        obj = j1Var.i(this);
                    }
                } else {
                    switchPreferenceCompat = bVar.V0;
                    if (switchPreferenceCompat != null) {
                        switchPreferenceCompat.A(false);
                    }
                    if (switchPreferenceCompat != null) {
                        arrayList = bVar.f43607l;
                        if (arrayList != null) {
                            s.m("mPreferenceList");
                            throw null;
                        }
                        arrayList.remove(switchPreferenceCompat);
                    }
                    this.f3436a = null;
                    this.f3437b = null;
                    this.f3438c = z14;
                    this.f3439d = zBooleanValue;
                    this.f3440e = 4;
                    obj = j1Var.i(this);
                }
                return aVar;
            }
            if (i14 == 3) {
                z15 = this.f3439d;
                z16 = this.f3438c;
                j1Var2 = this.f3436a;
                r.b(obj);
                v2Var = (v2) obj;
                if ((v2Var instanceof v2.b) || !((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                    switchPreferenceCompat2 = bVar.V0;
                    if (switchPreferenceCompat2 != null) {
                        switchPreferenceCompat2.A(false);
                    }
                    if (switchPreferenceCompat2 != null) {
                        arrayList2 = bVar.f43607l;
                        if (arrayList2 == null) {
                            s.m("mPreferenceList");
                            throw null;
                        }
                        arrayList2.remove(switchPreferenceCompat2);
                    }
                }
                zBooleanValue = z15;
                z14 = z16;
                j1Var = j1Var2;
                this.f3436a = null;
                this.f3437b = null;
                this.f3438c = z14;
                this.f3439d = zBooleanValue;
                this.f3440e = 4;
                obj = j1Var.i(this);
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        if (!(obj instanceof c80.s.a)) {
            PreferenceCategory preferenceCategory = bVar.O0;
            if (preferenceCategory != null) {
                preferenceCategory.A(false);
            }
            PreferenceCategory preferenceCategory2 = bVar.O0;
            if (preferenceCategory2 != null) {
                ArrayList arrayList3 = bVar.f43607l;
                if (arrayList3 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList3.remove(preferenceCategory2);
            }
        }
        return Unit.INSTANCE;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        if (!zBooleanValue2) {
            SwitchPreferenceCompat switchPreferenceCompat3 = bVar.U0;
            if (switchPreferenceCompat3 != null) {
                switchPreferenceCompat3.A(false);
            }
            SwitchPreferenceCompat switchPreferenceCompat4 = bVar.U0;
            if (switchPreferenceCompat4 != null) {
                ArrayList arrayList4 = bVar.f43607l;
                if (arrayList4 == null) {
                    s.m("mPreferenceList");
                    throw null;
                }
                arrayList4.remove(switchPreferenceCompat4);
            }
        }
        q qVar2 = q.EXCLUSIVE_OFFERS;
        this.f3436a = j1Var;
        this.f3437b = jVar;
        this.f3438c = zBooleanValue2;
        this.f3440e = 2;
        Object objL2 = j1Var.l(qVar2, this);
        if (objL2 != aVar) {
            z70.j jVar3 = jVar;
            z14 = zBooleanValue2;
            obj = objL2;
            jVar2 = jVar3;
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                this.f3436a = j1Var;
                this.f3437b = null;
                this.f3438c = z14;
                this.f3439d = zBooleanValue;
                this.f3440e = 3;
                objB = jVar2.b(this);
                if (objB != aVar) {
                    boolean z18 = z14;
                    z15 = zBooleanValue;
                    obj = objB;
                    z16 = z18;
                    j1Var2 = j1Var;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        switchPreferenceCompat2 = bVar.V0;
                        if (switchPreferenceCompat2 != null) {
                            switchPreferenceCompat2.A(false);
                        }
                        if (switchPreferenceCompat2 != null) {
                            arrayList2 = bVar.f43607l;
                            if (arrayList2 == null) {
                                s.m("mPreferenceList");
                                throw null;
                            }
                            arrayList2.remove(switchPreferenceCompat2);
                        }
                    } else {
                        switchPreferenceCompat2 = bVar.V0;
                        if (switchPreferenceCompat2 != null) {
                            switchPreferenceCompat2.A(false);
                        }
                        if (switchPreferenceCompat2 != null) {
                            arrayList2 = bVar.f43607l;
                            if (arrayList2 == null) {
                                s.m("mPreferenceList");
                                throw null;
                            }
                            arrayList2.remove(switchPreferenceCompat2);
                        }
                    }
                    zBooleanValue = z15;
                    z14 = z16;
                    j1Var = j1Var2;
                    this.f3436a = null;
                    this.f3437b = null;
                    this.f3438c = z14;
                    this.f3439d = zBooleanValue;
                    this.f3440e = 4;
                    obj = j1Var.i(this);
                }
            } else {
                switchPreferenceCompat = bVar.V0;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.A(false);
                }
                if (switchPreferenceCompat != null) {
                    arrayList = bVar.f43607l;
                    if (arrayList != null) {
                        s.m("mPreferenceList");
                        throw null;
                    }
                    arrayList.remove(switchPreferenceCompat);
                }
                this.f3436a = null;
                this.f3437b = null;
                this.f3438c = z14;
                this.f3439d = zBooleanValue;
                this.f3440e = 4;
                obj = j1Var.i(this);
            }
        }
        return aVar;
    }
}
