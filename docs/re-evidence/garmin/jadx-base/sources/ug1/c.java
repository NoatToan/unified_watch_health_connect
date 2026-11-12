package ug1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.Iterator;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.j0;
import r53.p2;
import r53.q2;
import sg1.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lug1/c;", "Landroidx/lifecycle/u1;", "Lrg1/a;", "backupRepo", "Lfj1/b;", "primaryDeviceRepo", "<init>", "(Lrg1/a;Lfj1/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1.a f170644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fj1.b f170645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f170646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f170647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f170648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f170649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f170650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f170651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f170652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f170653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f170654k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.vm.DeviceBackupViewModel$clearBackupOperationState$1", f = "DeviceBackupViewModel.kt", l = {118, 119}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170655a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170655a;
            c cVar = c.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            p2 p2Var = cVar.f170650g;
            sg1.a aVar2 = new sg1.a(false, false, false);
            this.f170655a = 1;
            p2Var.k(null, aVar2);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
            p2 p2Var2 = cVar.f170652i;
            sg1.a aVar3 = new sg1.a(false, false, false);
            this.f170655a = 2;
            p2Var2.k(null, aVar3);
        }
    }

    public c(rg1.a aVar, fj1.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f170644a = aVar;
        this.f170645b = bVar;
        j0 j0Var = j0.f134944a;
        boolean z14 = false;
        p2 p2VarA = q2.a(new sg1.d(false, z14, j0Var, null, 8, null));
        this.f170646c = p2VarA;
        this.f170647d = p2VarA;
        p2 p2VarA2 = q2.a(new sg1.d(z14, false, j0Var, null, 8, null));
        this.f170648e = p2VarA2;
        this.f170649f = p2VarA2;
        int i14 = 7;
        j jVar = null;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        p2 p2VarA3 = q2.a(new sg1.a(z15, z16, z17, i14, jVar));
        this.f170650g = p2VarA3;
        this.f170651h = p2VarA3;
        p2 p2VarA4 = q2.a(new sg1.a(z15, z16, z17, i14, jVar));
        this.f170652i = p2VarA4;
        this.f170653j = p2VarA4;
        this.f170654k = q2.a(new ug1.a(j0Var, "", -1L));
    }

    public final void x4() {
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    public final sg1.b y4(l22.a aVar, long j8) {
        Object next;
        String deviceName;
        String deviceName2;
        DateTime dateTimeNow;
        DateTime dateTimeNow2;
        String imageUrl;
        String deviceName3;
        Long deviceId;
        Long deviceBackupId;
        g gVar = g.f159217a;
        p2 p2Var = this.f170654k;
        Iterator<T> it = ((ug1.a) p2Var.getValue()).f170636a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Long deviceBackupId2 = ((qg1.b) next).getDeviceBackupId();
            if (deviceBackupId2 != null && deviceBackupId2.longValue() == j8) {
                break;
            }
        }
        qg1.b bVar = (qg1.b) next;
        String str = ((ug1.a) p2Var.getValue()).f170637b;
        long j14 = ((ug1.a) p2Var.getValue()).f170638c;
        gVar.getClass();
        if (bVar == null || (deviceName = bVar.getDeviceName()) == null) {
            deviceName = "";
        }
        String strA = aVar.a(R.string.lbl_device_migration_device_backup, deviceName);
        if (bVar == null || (deviceName2 = bVar.getDeviceName()) == null) {
            deviceName2 = "";
        }
        if (bVar == null || (dateTimeNow = bVar.getDate()) == null) {
            dateTimeNow = DateTime.now();
        }
        String string = dateTimeNow.toString(DateTimeFormat.shortDate());
        string.getClass();
        String strA2 = aVar.a(R.string.lbl_device_migration_remove_backup_dialog_message, aVar.a(R.string.string_short_dash_line_string_pattern, deviceName2, string));
        long jLongValue = -1;
        long jLongValue2 = (bVar == null || (deviceBackupId = bVar.getDeviceBackupId()) == null) ? -1L : deviceBackupId.longValue();
        if (bVar != null && (deviceId = bVar.getDeviceId()) != null) {
            jLongValue = deviceId.longValue();
        }
        String str2 = (bVar == null || (deviceName3 = bVar.getDeviceName()) == null) ? "" : deviceName3;
        String strA3 = aVar.a(R.string.lbl_device_migration_restore_device_message, str);
        if (bVar == null || (dateTimeNow2 = bVar.getDate()) == null) {
            dateTimeNow2 = DateTime.now();
        }
        String string2 = dateTimeNow2.toString(DateTimeFormat.shortDate());
        string2.getClass();
        return new sg1.b(jLongValue2, jLongValue, str2, j14, strA, strA3, str, aVar.a(R.string.lbl_device_migration_last_backup_with_date, string2), aVar.a(R.string.lbl_device_migration_restore_from_backup_dialog_message, str), aVar.a(R.string.lbl_device_migration_settings_applied, str), (bVar == null || (imageUrl = bVar.getImageUrl()) == null) ? "" : imageUrl, strA2);
    }
}
