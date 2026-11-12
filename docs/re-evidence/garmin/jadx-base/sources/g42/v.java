package g42;

import android.content.Context;
import android.location.Location;
import androidx.lifecycle.t0;
import c22.z1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lo13/p;", "Landroid/location/Location;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionViewModel$getLocation$1", f = "WeatherLocationSelectionViewModel.kt", l = {113, 115, 119, 121}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<t0<o13.p<? extends Location, ? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f75839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f75840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, Context context, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f75839c = qVar;
        this.f75840d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f75839c, this.f75840d, dVar);
        vVar.f75838b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(t0<o13.p<? extends Location, ? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((v) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        if (r0.emit(r4, r10) == r1) goto L46;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o13.p pVar;
        Location location;
        Location locationZ4;
        t0 t0Var = (t0) this.f75838b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75837a;
        Context context = this.f75840d;
        q qVar = this.f75839c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (qVar.f75820d) {
                this.f75838b = t0Var;
                this.f75837a = 1;
                obj = q.x4(qVar, this);
                if (obj != aVar) {
                    location = (Location) obj;
                    if (location == null) {
                        pVar = new o13.p(location, Boolean.TRUE);
                    } else {
                        locationZ4 = q.z4(qVar, context);
                        if (locationZ4 != null) {
                            pVar = new o13.p(locationZ4, Boolean.FALSE);
                        } else {
                            this.f75838b = t0Var;
                            this.f75837a = 2;
                            obj = q.y4(qVar, this);
                        }
                    }
                    this.f75838b = null;
                    this.f75837a = 4;
                }
            } else {
                du2.g.f61293g.getClass();
                Location locationC = du2.g.a.c(context);
                Logger logger = q.f75816h;
                z1.f23762a.getClass();
                logger.debug("getStaticLocation: returning ".concat(z1.b(locationC)));
                if (locationC != null) {
                    pVar = new o13.p(locationC, Boolean.TRUE);
                } else {
                    Location locationZ5 = q.z4(qVar, context);
                    if (locationZ5 != null) {
                        pVar = new o13.p(locationZ5, Boolean.TRUE);
                    } else {
                        this.f75838b = t0Var;
                        this.f75837a = 3;
                        obj = q.y4(qVar, this);
                    }
                }
                this.f75838b = null;
                this.f75837a = 4;
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            location = (Location) obj;
            if (location == null) {
                locationZ4 = q.z4(qVar, context);
                if (locationZ4 != null) {
                    pVar = new o13.p(locationZ4, Boolean.FALSE);
                } else {
                    this.f75838b = t0Var;
                    this.f75837a = 2;
                    obj = q.y4(qVar, this);
                }
                return aVar;
            }
            pVar = new o13.p(location, Boolean.TRUE);
            this.f75838b = null;
            this.f75837a = 4;
        } else if (i14 == 2) {
            o13.r.b(obj);
            Location location2 = (Location) obj;
            if (location2 != null) {
                pVar = new o13.p(location2, Boolean.FALSE);
            } else {
                pVar = null;
            }
            this.f75838b = null;
            this.f75837a = 4;
        } else if (i14 == 3) {
            o13.r.b(obj);
            Location location3 = (Location) obj;
            if (location3 != null) {
                pVar = new o13.p(location3, Boolean.FALSE);
            } else {
                pVar = null;
            }
            this.f75838b = null;
            this.f75837a = 4;
        } else {
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
