package ug1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.p2;
import sg1.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.vm.DeviceBackupViewModel$getAllBackups$1", f = "DeviceBackupViewModel.kt", l = {60, 62, 72, 74, 83, 85, 86}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f170661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f170662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f170663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f170664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f170665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l22.b f170666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, l22.b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f170665e = cVar;
        this.f170666f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f170665e, this.f170666f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025a A[PHI: r2 r10 r12
      0x025a: PHI (r2v51 com.garmin.android.apps.connectmobile.v2$b) = (r2v18 com.garmin.android.apps.connectmobile.v2$b), (r2v54 com.garmin.android.apps.connectmobile.v2$b) binds: [B:99:0x0257, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r10v17 long) = (r10v12 long), (r10v19 long) binds: [B:99:0x0257, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r12v8 long) = (r12v4 long), (r12v9 long) binds: [B:99:0x0257, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f A[PHI: r2
      0x006f: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v15 java.lang.Object) binds: [B:16:0x006b, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x018d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01de  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x021b  */
    /* JADX WARN: Code duplicated, block: B:98:0x023d  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0273, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        v2 v2Var;
        long jLongValue;
        long jLongValue2;
        Object objD;
        long j8;
        long j14;
        gj1.d primaryTrainingDeviceDTO;
        List<gj1.a> listF;
        gj1.a aVarS;
        Long lF;
        Long deviceId;
        v2 v2Var2;
        v2.b bVar;
        l22.b bVar2;
        ArrayList arrayList;
        Iterator it;
        v2 v2Var3;
        v2.b bVar3;
        v2 v2Var4;
        Long deviceId2;
        boolean z14;
        Long deviceId3;
        boolean z15;
        DateTime date;
        String strA;
        String deviceName;
        DateTime date2;
        String imageUrl;
        String str;
        String deviceName2;
        String str2;
        Long deviceBackupId;
        long jLongValue3;
        Long deviceId4;
        long jLongValue4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170664d;
        c cVar = this.f170665e;
        switch (i14) {
            case 0:
                r.b(obj);
                p2 p2Var = cVar.f170648e;
                sg1.d dVar = new sg1.d(true, false, j0.f134944a, "");
                this.f170664d = 1;
                p2Var.k(null, dVar);
                if (Unit.INSTANCE != aVar) {
                    fj1.b bVar4 = cVar.f170645b;
                    this.f170664d = 2;
                    objA = bVar4.a(this);
                    if (objA != aVar) {
                        v2Var = (v2) objA;
                        if (v2Var instanceof v2.b) {
                            gj1.f fVar = (gj1.f) ((v2.b) v2Var).f47386a;
                            primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
                            if (primaryTrainingDeviceDTO != null || (deviceId = primaryTrainingDeviceDTO.getDeviceId()) == null) {
                                jLongValue = -1;
                            } else {
                                jLongValue = deviceId.longValue();
                            }
                            listF = fVar.f();
                            if (listF == null && (aVarS = gl.b.s(listF)) != null && (lF = aVarS.getDeviceId()) != null) {
                                jLongValue2 = lF.longValue();
                            }
                            rg1.a aVar2 = cVar.f170644a;
                            this.f170662b = jLongValue;
                            this.f170663c = jLongValue2;
                            this.f170664d = 3;
                            objD = aVar2.d(this);
                            if (objD != aVar) {
                                long j15 = jLongValue2;
                                j8 = jLongValue;
                                j14 = j15;
                                v2Var2 = (v2) objD;
                                if (v2Var2 instanceof v2.b) {
                                    bVar = null;
                                    p2 p2Var2 = cVar.f170648e;
                                    sg1.d dVar2 = new sg1.d(false, true, j0.f134944a, "");
                                    this.f170661a = null;
                                    this.f170662b = j8;
                                    this.f170663c = j14;
                                    this.f170664d = 6;
                                    p2Var2.k(null, dVar2);
                                    if (Unit.INSTANCE != aVar) {
                                        p2 p2Var3 = cVar.f170654k;
                                        a aVar3 = new a(j0.f134944a, "", -1L);
                                        this.f170661a = bVar;
                                        this.f170662b = j8;
                                        this.f170663c = j14;
                                        this.f170664d = 7;
                                        p2Var3.k(bVar, aVar3);
                                    }
                                } else {
                                    p2 p2Var4 = cVar.f170648e;
                                    g gVar = g.f159217a;
                                    v2.b bVar5 = (v2.b) v2Var2;
                                    List list = (List) bVar5.f47386a;
                                    gVar.getClass();
                                    bVar2 = this.f170666f;
                                    bVar2.getClass();
                                    list.getClass();
                                    ArrayList arrayListD1 = h0.d1(h0.N0(list, new sg1.f(j14, j8)));
                                    arrayList = new ArrayList(y.r(arrayListD1, 10));
                                    it = arrayListD1.iterator();
                                    while (it.hasNext()) {
                                        qg1.b bVar6 = (qg1.b) it.next();
                                        g gVar2 = g.f159217a;
                                        deviceId2 = bVar6.getDeviceId();
                                        if (deviceId2 == null && j14 == deviceId2.longValue()) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        deviceId3 = bVar6.getDeviceId();
                                        if (deviceId3 == null && j8 == deviceId3.longValue()) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        gVar2.getClass();
                                        date = bVar6.getDate();
                                        if (date == null) {
                                            date = DateTime.now();
                                        }
                                        v2 v2Var5 = v2Var2;
                                        DateTime dateTime = date;
                                        Iterator it3 = it;
                                        String string = dateTime.toString(DateTimeFormat.shortDate());
                                        string.getClass();
                                        strA = bVar2.a(R.string.lbl_device_migration_last_backup, string);
                                        if (z14) {
                                            strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                                        } else if (z15) {
                                            strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                                        }
                                        String str3 = strA;
                                        deviceName = bVar6.getDeviceName();
                                        if (deviceName == null) {
                                            deviceName = "";
                                        }
                                        date2 = bVar6.getDate();
                                        if (date2 == null) {
                                            date2 = DateTime.now();
                                        }
                                        String string2 = date2.toString(DateTimeFormat.shortDate());
                                        string2.getClass();
                                        String strA2 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string2));
                                        imageUrl = bVar6.getImageUrl();
                                        if (imageUrl == null) {
                                            str = "";
                                        } else {
                                            str = imageUrl;
                                        }
                                        deviceName2 = bVar6.getDeviceName();
                                        if (deviceName2 == null) {
                                            str2 = "";
                                        } else {
                                            str2 = deviceName2;
                                        }
                                        deviceBackupId = bVar6.getDeviceBackupId();
                                        if (deviceBackupId != null) {
                                            jLongValue3 = deviceBackupId.longValue();
                                        } else {
                                            jLongValue3 = -1;
                                        }
                                        deviceId4 = bVar6.getDeviceId();
                                        if (deviceId4 != null) {
                                            jLongValue4 = deviceId4.longValue();
                                        } else {
                                            jLongValue4 = -1;
                                        }
                                        arrayList.add(new sg1.c(str, str2, str3, jLongValue4, jLongValue3, false, strA2, false));
                                        v2Var2 = v2Var5;
                                        it = it3;
                                    }
                                    v2Var3 = v2Var2;
                                    sg1.d dVar3 = new sg1.d(false, false, arrayList, "");
                                    this.f170661a = bVar5;
                                    this.f170662b = j8;
                                    this.f170663c = j14;
                                    this.f170664d = 4;
                                    bVar3 = null;
                                    p2Var4.k(null, dVar3);
                                    if (Unit.INSTANCE != aVar) {
                                        v2Var4 = v2Var3;
                                        p2 p2Var5 = cVar.f170654k;
                                        a aVar4 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                                        this.f170661a = bVar3;
                                        this.f170662b = j8;
                                        this.f170663c = j14;
                                        this.f170664d = 5;
                                        p2Var5.k(bVar3, aVar4);
                                    }
                                }
                            }
                        } else {
                            jLongValue = -1;
                        }
                        jLongValue2 = -1;
                        rg1.a aVar5 = cVar.f170644a;
                        this.f170662b = jLongValue;
                        this.f170663c = jLongValue2;
                        this.f170664d = 3;
                        objD = aVar5.d(this);
                        if (objD != aVar) {
                            long j16 = jLongValue2;
                            j8 = jLongValue;
                            j14 = j16;
                            v2Var2 = (v2) objD;
                            if (v2Var2 instanceof v2.b) {
                                bVar = null;
                                p2 p2Var6 = cVar.f170648e;
                                sg1.d dVar4 = new sg1.d(false, true, j0.f134944a, "");
                                this.f170661a = null;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 6;
                                p2Var6.k(null, dVar4);
                                if (Unit.INSTANCE != aVar) {
                                    p2 p2Var7 = cVar.f170654k;
                                    a aVar6 = new a(j0.f134944a, "", -1L);
                                    this.f170661a = bVar;
                                    this.f170662b = j8;
                                    this.f170663c = j14;
                                    this.f170664d = 7;
                                    p2Var7.k(bVar, aVar6);
                                }
                            } else {
                                p2 p2Var8 = cVar.f170648e;
                                g gVar3 = g.f159217a;
                                v2.b bVar7 = (v2.b) v2Var2;
                                List list2 = (List) bVar7.f47386a;
                                gVar3.getClass();
                                bVar2 = this.f170666f;
                                bVar2.getClass();
                                list2.getClass();
                                ArrayList arrayListD2 = h0.d1(h0.N0(list2, new sg1.f(j14, j8)));
                                arrayList = new ArrayList(y.r(arrayListD2, 10));
                                it = arrayListD2.iterator();
                                while (it.hasNext()) {
                                    qg1.b bVar8 = (qg1.b) it.next();
                                    g gVar4 = g.f159217a;
                                    deviceId2 = bVar8.getDeviceId();
                                    if (deviceId2 == null) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    deviceId3 = bVar8.getDeviceId();
                                    if (deviceId3 == null) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    gVar4.getClass();
                                    date = bVar8.getDate();
                                    if (date == null) {
                                        date = DateTime.now();
                                    }
                                    v2 v2Var6 = v2Var2;
                                    DateTime dateTime2 = date;
                                    Iterator it4 = it;
                                    String string3 = dateTime2.toString(DateTimeFormat.shortDate());
                                    string3.getClass();
                                    strA = bVar2.a(R.string.lbl_device_migration_last_backup, string3);
                                    if (z14) {
                                        strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                                    } else if (z15) {
                                        strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                                    }
                                    String str4 = strA;
                                    deviceName = bVar8.getDeviceName();
                                    if (deviceName == null) {
                                        deviceName = "";
                                    }
                                    date2 = bVar8.getDate();
                                    if (date2 == null) {
                                        date2 = DateTime.now();
                                    }
                                    String string4 = date2.toString(DateTimeFormat.shortDate());
                                    string4.getClass();
                                    String strA3 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string4));
                                    imageUrl = bVar8.getImageUrl();
                                    if (imageUrl == null) {
                                        str = "";
                                    } else {
                                        str = imageUrl;
                                    }
                                    deviceName2 = bVar8.getDeviceName();
                                    if (deviceName2 == null) {
                                        str2 = "";
                                    } else {
                                        str2 = deviceName2;
                                    }
                                    deviceBackupId = bVar8.getDeviceBackupId();
                                    if (deviceBackupId != null) {
                                        jLongValue3 = deviceBackupId.longValue();
                                    } else {
                                        jLongValue3 = -1;
                                    }
                                    deviceId4 = bVar8.getDeviceId();
                                    if (deviceId4 != null) {
                                        jLongValue4 = deviceId4.longValue();
                                    } else {
                                        jLongValue4 = -1;
                                    }
                                    arrayList.add(new sg1.c(str, str2, str4, jLongValue4, jLongValue3, false, strA3, false));
                                    v2Var2 = v2Var6;
                                    it = it4;
                                }
                                v2Var3 = v2Var2;
                                sg1.d dVar5 = new sg1.d(false, false, arrayList, "");
                                this.f170661a = bVar7;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 4;
                                bVar3 = null;
                                p2Var8.k(null, dVar5);
                                if (Unit.INSTANCE != aVar) {
                                    v2Var4 = v2Var3;
                                    p2 p2Var9 = cVar.f170654k;
                                    a aVar7 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                                    this.f170661a = bVar3;
                                    this.f170662b = j8;
                                    this.f170663c = j14;
                                    this.f170664d = 5;
                                    p2Var9.k(bVar3, aVar7);
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                fj1.b bVar9 = cVar.f170645b;
                this.f170664d = 2;
                objA = bVar9.a(this);
                if (objA != aVar) {
                    v2Var = (v2) objA;
                    if (v2Var instanceof v2.b) {
                        gj1.f fVar2 = (gj1.f) ((v2.b) v2Var).f47386a;
                        primaryTrainingDeviceDTO = fVar2.getPrimaryTrainingDeviceDTO();
                        if (primaryTrainingDeviceDTO != null) {
                            jLongValue = -1;
                        } else {
                            jLongValue = -1;
                        }
                        listF = fVar2.f();
                        if (listF == null) {
                        }
                        rg1.a aVar8 = cVar.f170644a;
                        this.f170662b = jLongValue;
                        this.f170663c = jLongValue2;
                        this.f170664d = 3;
                        objD = aVar8.d(this);
                        if (objD != aVar) {
                            long j17 = jLongValue2;
                            j8 = jLongValue;
                            j14 = j17;
                            v2Var2 = (v2) objD;
                            if (v2Var2 instanceof v2.b) {
                                bVar = null;
                                p2 p2Var10 = cVar.f170648e;
                                sg1.d dVar6 = new sg1.d(false, true, j0.f134944a, "");
                                this.f170661a = null;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 6;
                                p2Var10.k(null, dVar6);
                                if (Unit.INSTANCE != aVar) {
                                    p2 p2Var11 = cVar.f170654k;
                                    a aVar9 = new a(j0.f134944a, "", -1L);
                                    this.f170661a = bVar;
                                    this.f170662b = j8;
                                    this.f170663c = j14;
                                    this.f170664d = 7;
                                    p2Var11.k(bVar, aVar9);
                                }
                            } else {
                                p2 p2Var12 = cVar.f170648e;
                                g gVar5 = g.f159217a;
                                v2.b bVar10 = (v2.b) v2Var2;
                                List list3 = (List) bVar10.f47386a;
                                gVar5.getClass();
                                bVar2 = this.f170666f;
                                bVar2.getClass();
                                list3.getClass();
                                ArrayList arrayListD3 = h0.d1(h0.N0(list3, new sg1.f(j14, j8)));
                                arrayList = new ArrayList(y.r(arrayListD3, 10));
                                it = arrayListD3.iterator();
                                while (it.hasNext()) {
                                    qg1.b bVar11 = (qg1.b) it.next();
                                    g gVar6 = g.f159217a;
                                    deviceId2 = bVar11.getDeviceId();
                                    if (deviceId2 == null) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    deviceId3 = bVar11.getDeviceId();
                                    if (deviceId3 == null) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    gVar6.getClass();
                                    date = bVar11.getDate();
                                    if (date == null) {
                                        date = DateTime.now();
                                    }
                                    v2 v2Var7 = v2Var2;
                                    DateTime dateTime3 = date;
                                    Iterator it5 = it;
                                    String string5 = dateTime3.toString(DateTimeFormat.shortDate());
                                    string5.getClass();
                                    strA = bVar2.a(R.string.lbl_device_migration_last_backup, string5);
                                    if (z14) {
                                        strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                                    } else if (z15) {
                                        strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                                    }
                                    String str5 = strA;
                                    deviceName = bVar11.getDeviceName();
                                    if (deviceName == null) {
                                        deviceName = "";
                                    }
                                    date2 = bVar11.getDate();
                                    if (date2 == null) {
                                        date2 = DateTime.now();
                                    }
                                    String string6 = date2.toString(DateTimeFormat.shortDate());
                                    string6.getClass();
                                    String strA4 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string6));
                                    imageUrl = bVar11.getImageUrl();
                                    if (imageUrl == null) {
                                        str = "";
                                    } else {
                                        str = imageUrl;
                                    }
                                    deviceName2 = bVar11.getDeviceName();
                                    if (deviceName2 == null) {
                                        str2 = "";
                                    } else {
                                        str2 = deviceName2;
                                    }
                                    deviceBackupId = bVar11.getDeviceBackupId();
                                    if (deviceBackupId != null) {
                                        jLongValue3 = deviceBackupId.longValue();
                                    } else {
                                        jLongValue3 = -1;
                                    }
                                    deviceId4 = bVar11.getDeviceId();
                                    if (deviceId4 != null) {
                                        jLongValue4 = deviceId4.longValue();
                                    } else {
                                        jLongValue4 = -1;
                                    }
                                    arrayList.add(new sg1.c(str, str2, str5, jLongValue4, jLongValue3, false, strA4, false));
                                    v2Var2 = v2Var7;
                                    it = it5;
                                }
                                v2Var3 = v2Var2;
                                sg1.d dVar7 = new sg1.d(false, false, arrayList, "");
                                this.f170661a = bVar10;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 4;
                                bVar3 = null;
                                p2Var12.k(null, dVar7);
                                if (Unit.INSTANCE != aVar) {
                                    v2Var4 = v2Var3;
                                    p2 p2Var13 = cVar.f170654k;
                                    a aVar10 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                                    this.f170661a = bVar3;
                                    this.f170662b = j8;
                                    this.f170663c = j14;
                                    this.f170664d = 5;
                                    p2Var13.k(bVar3, aVar10);
                                }
                            }
                        }
                    } else {
                        jLongValue = -1;
                    }
                    jLongValue2 = -1;
                    rg1.a aVar11 = cVar.f170644a;
                    this.f170662b = jLongValue;
                    this.f170663c = jLongValue2;
                    this.f170664d = 3;
                    objD = aVar11.d(this);
                    if (objD != aVar) {
                        long j18 = jLongValue2;
                        j8 = jLongValue;
                        j14 = j18;
                        v2Var2 = (v2) objD;
                        if (v2Var2 instanceof v2.b) {
                            bVar = null;
                            p2 p2Var14 = cVar.f170648e;
                            sg1.d dVar8 = new sg1.d(false, true, j0.f134944a, "");
                            this.f170661a = null;
                            this.f170662b = j8;
                            this.f170663c = j14;
                            this.f170664d = 6;
                            p2Var14.k(null, dVar8);
                            if (Unit.INSTANCE != aVar) {
                                p2 p2Var15 = cVar.f170654k;
                                a aVar12 = new a(j0.f134944a, "", -1L);
                                this.f170661a = bVar;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 7;
                                p2Var15.k(bVar, aVar12);
                            }
                        } else {
                            p2 p2Var16 = cVar.f170648e;
                            g gVar7 = g.f159217a;
                            v2.b bVar12 = (v2.b) v2Var2;
                            List list4 = (List) bVar12.f47386a;
                            gVar7.getClass();
                            bVar2 = this.f170666f;
                            bVar2.getClass();
                            list4.getClass();
                            ArrayList arrayListD4 = h0.d1(h0.N0(list4, new sg1.f(j14, j8)));
                            arrayList = new ArrayList(y.r(arrayListD4, 10));
                            it = arrayListD4.iterator();
                            while (it.hasNext()) {
                                qg1.b bVar13 = (qg1.b) it.next();
                                g gVar8 = g.f159217a;
                                deviceId2 = bVar13.getDeviceId();
                                if (deviceId2 == null) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                deviceId3 = bVar13.getDeviceId();
                                if (deviceId3 == null) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                gVar8.getClass();
                                date = bVar13.getDate();
                                if (date == null) {
                                    date = DateTime.now();
                                }
                                v2 v2Var8 = v2Var2;
                                DateTime dateTime4 = date;
                                Iterator it6 = it;
                                String string7 = dateTime4.toString(DateTimeFormat.shortDate());
                                string7.getClass();
                                strA = bVar2.a(R.string.lbl_device_migration_last_backup, string7);
                                if (z14) {
                                    strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                                } else if (z15) {
                                    strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                                }
                                String str6 = strA;
                                deviceName = bVar13.getDeviceName();
                                if (deviceName == null) {
                                    deviceName = "";
                                }
                                date2 = bVar13.getDate();
                                if (date2 == null) {
                                    date2 = DateTime.now();
                                }
                                String string8 = date2.toString(DateTimeFormat.shortDate());
                                string8.getClass();
                                String strA5 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string8));
                                imageUrl = bVar13.getImageUrl();
                                if (imageUrl == null) {
                                    str = "";
                                } else {
                                    str = imageUrl;
                                }
                                deviceName2 = bVar13.getDeviceName();
                                if (deviceName2 == null) {
                                    str2 = "";
                                } else {
                                    str2 = deviceName2;
                                }
                                deviceBackupId = bVar13.getDeviceBackupId();
                                if (deviceBackupId != null) {
                                    jLongValue3 = deviceBackupId.longValue();
                                } else {
                                    jLongValue3 = -1;
                                }
                                deviceId4 = bVar13.getDeviceId();
                                if (deviceId4 != null) {
                                    jLongValue4 = deviceId4.longValue();
                                } else {
                                    jLongValue4 = -1;
                                }
                                arrayList.add(new sg1.c(str, str2, str6, jLongValue4, jLongValue3, false, strA5, false));
                                v2Var2 = v2Var8;
                                it = it6;
                            }
                            v2Var3 = v2Var2;
                            sg1.d dVar9 = new sg1.d(false, false, arrayList, "");
                            this.f170661a = bVar12;
                            this.f170662b = j8;
                            this.f170663c = j14;
                            this.f170664d = 4;
                            bVar3 = null;
                            p2Var16.k(null, dVar9);
                            if (Unit.INSTANCE != aVar) {
                                v2Var4 = v2Var3;
                                p2 p2Var17 = cVar.f170654k;
                                a aVar13 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                                this.f170661a = bVar3;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 5;
                                p2Var17.k(bVar3, aVar13);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                objA = obj;
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    gj1.f fVar3 = (gj1.f) ((v2.b) v2Var).f47386a;
                    primaryTrainingDeviceDTO = fVar3.getPrimaryTrainingDeviceDTO();
                    if (primaryTrainingDeviceDTO != null) {
                        jLongValue = -1;
                    } else {
                        jLongValue = -1;
                    }
                    listF = fVar3.f();
                    if (listF == null) {
                        break;
                    }
                    rg1.a aVar14 = cVar.f170644a;
                    this.f170662b = jLongValue;
                    this.f170663c = jLongValue2;
                    this.f170664d = 3;
                    objD = aVar14.d(this);
                    if (objD != aVar) {
                        long j19 = jLongValue2;
                        j8 = jLongValue;
                        j14 = j19;
                        v2Var2 = (v2) objD;
                        if (v2Var2 instanceof v2.b) {
                            bVar = null;
                            p2 p2Var18 = cVar.f170648e;
                            sg1.d dVar10 = new sg1.d(false, true, j0.f134944a, "");
                            this.f170661a = null;
                            this.f170662b = j8;
                            this.f170663c = j14;
                            this.f170664d = 6;
                            p2Var18.k(null, dVar10);
                            if (Unit.INSTANCE != aVar) {
                                p2 p2Var19 = cVar.f170654k;
                                a aVar15 = new a(j0.f134944a, "", -1L);
                                this.f170661a = bVar;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 7;
                                p2Var19.k(bVar, aVar15);
                            }
                        } else {
                            p2 p2Var110 = cVar.f170648e;
                            g gVar9 = g.f159217a;
                            v2.b bVar14 = (v2.b) v2Var2;
                            List list5 = (List) bVar14.f47386a;
                            gVar9.getClass();
                            bVar2 = this.f170666f;
                            bVar2.getClass();
                            list5.getClass();
                            ArrayList arrayListD5 = h0.d1(h0.N0(list5, new sg1.f(j14, j8)));
                            arrayList = new ArrayList(y.r(arrayListD5, 10));
                            it = arrayListD5.iterator();
                            while (it.hasNext()) {
                                qg1.b bVar15 = (qg1.b) it.next();
                                g gVar10 = g.f159217a;
                                deviceId2 = bVar15.getDeviceId();
                                if (deviceId2 == null) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                deviceId3 = bVar15.getDeviceId();
                                if (deviceId3 == null) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                gVar10.getClass();
                                date = bVar15.getDate();
                                if (date == null) {
                                    date = DateTime.now();
                                }
                                v2 v2Var9 = v2Var2;
                                DateTime dateTime5 = date;
                                Iterator it7 = it;
                                String string9 = dateTime5.toString(DateTimeFormat.shortDate());
                                string9.getClass();
                                strA = bVar2.a(R.string.lbl_device_migration_last_backup, string9);
                                if (z14) {
                                    strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                                } else if (z15) {
                                    strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                                }
                                String str7 = strA;
                                deviceName = bVar15.getDeviceName();
                                if (deviceName == null) {
                                    deviceName = "";
                                }
                                date2 = bVar15.getDate();
                                if (date2 == null) {
                                    date2 = DateTime.now();
                                }
                                String string10 = date2.toString(DateTimeFormat.shortDate());
                                string10.getClass();
                                String strA6 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string10));
                                imageUrl = bVar15.getImageUrl();
                                if (imageUrl == null) {
                                    str = "";
                                } else {
                                    str = imageUrl;
                                }
                                deviceName2 = bVar15.getDeviceName();
                                if (deviceName2 == null) {
                                    str2 = "";
                                } else {
                                    str2 = deviceName2;
                                }
                                deviceBackupId = bVar15.getDeviceBackupId();
                                if (deviceBackupId != null) {
                                    jLongValue3 = deviceBackupId.longValue();
                                } else {
                                    jLongValue3 = -1;
                                }
                                deviceId4 = bVar15.getDeviceId();
                                if (deviceId4 != null) {
                                    jLongValue4 = deviceId4.longValue();
                                } else {
                                    jLongValue4 = -1;
                                }
                                arrayList.add(new sg1.c(str, str2, str7, jLongValue4, jLongValue3, false, strA6, false));
                                v2Var2 = v2Var9;
                                it = it7;
                            }
                            v2Var3 = v2Var2;
                            sg1.d dVar11 = new sg1.d(false, false, arrayList, "");
                            this.f170661a = bVar14;
                            this.f170662b = j8;
                            this.f170663c = j14;
                            this.f170664d = 4;
                            bVar3 = null;
                            p2Var110.k(null, dVar11);
                            if (Unit.INSTANCE != aVar) {
                                v2Var4 = v2Var3;
                                p2 p2Var111 = cVar.f170654k;
                                a aVar16 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                                this.f170661a = bVar3;
                                this.f170662b = j8;
                                this.f170663c = j14;
                                this.f170664d = 5;
                                p2Var111.k(bVar3, aVar16);
                            }
                        }
                        break;
                    }
                    return aVar;
                }
                jLongValue = -1;
                jLongValue2 = -1;
                rg1.a aVar17 = cVar.f170644a;
                this.f170662b = jLongValue;
                this.f170663c = jLongValue2;
                this.f170664d = 3;
                objD = aVar17.d(this);
                if (objD != aVar) {
                    long j110 = jLongValue2;
                    j8 = jLongValue;
                    j14 = j110;
                    v2Var2 = (v2) objD;
                    if (v2Var2 instanceof v2.b) {
                        bVar = null;
                        p2 p2Var112 = cVar.f170648e;
                        sg1.d dVar12 = new sg1.d(false, true, j0.f134944a, "");
                        this.f170661a = null;
                        this.f170662b = j8;
                        this.f170663c = j14;
                        this.f170664d = 6;
                        p2Var112.k(null, dVar12);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var113 = cVar.f170654k;
                            a aVar18 = new a(j0.f134944a, "", -1L);
                            this.f170661a = bVar;
                            this.f170662b = j8;
                            this.f170663c = j14;
                            this.f170664d = 7;
                            p2Var113.k(bVar, aVar18);
                        }
                    } else {
                        p2 p2Var114 = cVar.f170648e;
                        g gVar11 = g.f159217a;
                        v2.b bVar16 = (v2.b) v2Var2;
                        List list6 = (List) bVar16.f47386a;
                        gVar11.getClass();
                        bVar2 = this.f170666f;
                        bVar2.getClass();
                        list6.getClass();
                        ArrayList arrayListD6 = h0.d1(h0.N0(list6, new sg1.f(j14, j8)));
                        arrayList = new ArrayList(y.r(arrayListD6, 10));
                        it = arrayListD6.iterator();
                        while (it.hasNext()) {
                            qg1.b bVar17 = (qg1.b) it.next();
                            g gVar12 = g.f159217a;
                            deviceId2 = bVar17.getDeviceId();
                            if (deviceId2 == null) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            deviceId3 = bVar17.getDeviceId();
                            if (deviceId3 == null) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            gVar12.getClass();
                            date = bVar17.getDate();
                            if (date == null) {
                                date = DateTime.now();
                            }
                            v2 v2Var10 = v2Var2;
                            DateTime dateTime6 = date;
                            Iterator it8 = it;
                            String string11 = dateTime6.toString(DateTimeFormat.shortDate());
                            string11.getClass();
                            strA = bVar2.a(R.string.lbl_device_migration_last_backup, string11);
                            if (z14) {
                                strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                            } else if (z15) {
                                strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                            }
                            String str8 = strA;
                            deviceName = bVar17.getDeviceName();
                            if (deviceName == null) {
                                deviceName = "";
                            }
                            date2 = bVar17.getDate();
                            if (date2 == null) {
                                date2 = DateTime.now();
                            }
                            String string12 = date2.toString(DateTimeFormat.shortDate());
                            string12.getClass();
                            String strA7 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string12));
                            imageUrl = bVar17.getImageUrl();
                            if (imageUrl == null) {
                                str = "";
                            } else {
                                str = imageUrl;
                            }
                            deviceName2 = bVar17.getDeviceName();
                            if (deviceName2 == null) {
                                str2 = "";
                            } else {
                                str2 = deviceName2;
                            }
                            deviceBackupId = bVar17.getDeviceBackupId();
                            if (deviceBackupId != null) {
                                jLongValue3 = deviceBackupId.longValue();
                            } else {
                                jLongValue3 = -1;
                            }
                            deviceId4 = bVar17.getDeviceId();
                            if (deviceId4 != null) {
                                jLongValue4 = deviceId4.longValue();
                            } else {
                                jLongValue4 = -1;
                            }
                            arrayList.add(new sg1.c(str, str2, str8, jLongValue4, jLongValue3, false, strA7, false));
                            v2Var2 = v2Var10;
                            it = it8;
                        }
                        v2Var3 = v2Var2;
                        sg1.d dVar13 = new sg1.d(false, false, arrayList, "");
                        this.f170661a = bVar16;
                        this.f170662b = j8;
                        this.f170663c = j14;
                        this.f170664d = 4;
                        bVar3 = null;
                        p2Var114.k(null, dVar13);
                        if (Unit.INSTANCE != aVar) {
                            v2Var4 = v2Var3;
                            p2 p2Var115 = cVar.f170654k;
                            a aVar19 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                            this.f170661a = bVar3;
                            this.f170662b = j8;
                            this.f170663c = j14;
                            this.f170664d = 5;
                            p2Var115.k(bVar3, aVar19);
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                j14 = this.f170663c;
                j8 = this.f170662b;
                r.b(obj);
                objD = obj;
                v2Var2 = (v2) objD;
                if (v2Var2 instanceof v2.b) {
                    p2 p2Var116 = cVar.f170648e;
                    g gVar13 = g.f159217a;
                    v2.b bVar18 = (v2.b) v2Var2;
                    List list7 = (List) bVar18.f47386a;
                    gVar13.getClass();
                    bVar2 = this.f170666f;
                    bVar2.getClass();
                    list7.getClass();
                    ArrayList arrayListD7 = h0.d1(h0.N0(list7, new sg1.f(j14, j8)));
                    arrayList = new ArrayList(y.r(arrayListD7, 10));
                    it = arrayListD7.iterator();
                    while (it.hasNext()) {
                        qg1.b bVar19 = (qg1.b) it.next();
                        g gVar14 = g.f159217a;
                        deviceId2 = bVar19.getDeviceId();
                        if (deviceId2 == null) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        deviceId3 = bVar19.getDeviceId();
                        if (deviceId3 == null) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        gVar14.getClass();
                        date = bVar19.getDate();
                        if (date == null) {
                            date = DateTime.now();
                        }
                        v2 v2Var11 = v2Var2;
                        DateTime dateTime7 = date;
                        Iterator it9 = it;
                        String string13 = dateTime7.toString(DateTimeFormat.shortDate());
                        string13.getClass();
                        strA = bVar2.a(R.string.lbl_device_migration_last_backup, string13);
                        if (z14) {
                            strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_wearable), strA);
                        } else if (z15) {
                            strA = bVar2.a(R.string.string_space_dot_space_string_pattern, bVar2.getString(R.string.primary_training_device), strA);
                        }
                        String str9 = strA;
                        deviceName = bVar19.getDeviceName();
                        if (deviceName == null) {
                            deviceName = "";
                        }
                        date2 = bVar19.getDate();
                        if (date2 == null) {
                            date2 = DateTime.now();
                        }
                        String string14 = date2.toString(DateTimeFormat.shortDate());
                        string14.getClass();
                        String strA8 = bVar2.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar2.a(R.string.string_short_dash_line_string_pattern, deviceName, string14));
                        imageUrl = bVar19.getImageUrl();
                        if (imageUrl == null) {
                            str = "";
                        } else {
                            str = imageUrl;
                        }
                        deviceName2 = bVar19.getDeviceName();
                        if (deviceName2 == null) {
                            str2 = "";
                        } else {
                            str2 = deviceName2;
                        }
                        deviceBackupId = bVar19.getDeviceBackupId();
                        if (deviceBackupId != null) {
                            jLongValue3 = deviceBackupId.longValue();
                        } else {
                            jLongValue3 = -1;
                        }
                        deviceId4 = bVar19.getDeviceId();
                        if (deviceId4 != null) {
                            jLongValue4 = deviceId4.longValue();
                        } else {
                            jLongValue4 = -1;
                        }
                        arrayList.add(new sg1.c(str, str2, str9, jLongValue4, jLongValue3, false, strA8, false));
                        v2Var2 = v2Var11;
                        it = it9;
                    }
                    v2Var3 = v2Var2;
                    sg1.d dVar14 = new sg1.d(false, false, arrayList, "");
                    this.f170661a = bVar18;
                    this.f170662b = j8;
                    this.f170663c = j14;
                    this.f170664d = 4;
                    bVar3 = null;
                    p2Var116.k(null, dVar14);
                    if (Unit.INSTANCE != aVar) {
                        v2Var4 = v2Var3;
                        p2 p2Var117 = cVar.f170654k;
                        a aVar110 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                        this.f170661a = bVar3;
                        this.f170662b = j8;
                        this.f170663c = j14;
                        this.f170664d = 5;
                        p2Var117.k(bVar3, aVar110);
                    }
                    break;
                } else {
                    bVar = null;
                    p2 p2Var118 = cVar.f170648e;
                    sg1.d dVar15 = new sg1.d(false, true, j0.f134944a, "");
                    this.f170661a = null;
                    this.f170662b = j8;
                    this.f170663c = j14;
                    this.f170664d = 6;
                    p2Var118.k(null, dVar15);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var119 = cVar.f170654k;
                        a aVar111 = new a(j0.f134944a, "", -1L);
                        this.f170661a = bVar;
                        this.f170662b = j8;
                        this.f170663c = j14;
                        this.f170664d = 7;
                        p2Var119.k(bVar, aVar111);
                    }
                    break;
                }
                return aVar;
            case 4:
                long j24 = this.f170663c;
                long j25 = this.f170662b;
                v2Var4 = this.f170661a;
                r.b(obj);
                j8 = j25;
                j14 = j24;
                bVar3 = null;
                p2 p2Var1110 = cVar.f170654k;
                a aVar112 = new a((List) ((v2.b) v2Var4).f47386a, "", -1L);
                this.f170661a = bVar3;
                this.f170662b = j8;
                this.f170663c = j14;
                this.f170664d = 5;
                p2Var1110.k(bVar3, aVar112);
                break;
            case 5:
            case 7:
                r.b(obj);
                return Unit.INSTANCE;
            case 6:
                long j26 = this.f170663c;
                long j27 = this.f170662b;
                r.b(obj);
                j8 = j27;
                j14 = j26;
                bVar = null;
                p2 p2Var1111 = cVar.f170654k;
                a aVar113 = new a(j0.f134944a, "", -1L);
                this.f170661a = bVar;
                this.f170662b = j8;
                this.f170663c = j14;
                this.f170664d = 7;
                p2Var1111.k(bVar, aVar113);
                break;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
