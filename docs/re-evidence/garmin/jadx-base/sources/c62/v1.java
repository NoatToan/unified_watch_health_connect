package c62;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchWorkoutDetails$1", f = "WorkoutDetailsViewModel.kt", l = {392}, m = "invokeSuspend", v = 2)
public final class v1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f24915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f24916e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchWorkoutDetails$1$1", f = "WorkoutDetailsViewModel.kt", l = {394, 399, 399, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 420, 426, 437, 447, 451, 461, 468, 474, 488, 492}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WorkoutDetailsDTO f24917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m52.k f24918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f24922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f24924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Long f24925i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Long f24926j;

        /* JADX INFO: renamed from: c62.v1$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0359a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24927a;

            static {
                int[] iArr = new int[m52.k.values().length];
                try {
                    iArr[m52.k.f116755o.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[m52.k.f116754n.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[m52.k.f116758r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f24927a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, String str, Long l14, Long l15, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f24923g = fVar;
            this.f24924h = str;
            this.f24925i = l14;
            this.f24926j = l15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f24923g, this.f24924h, this.f24925i, this.f24926j, dVar);
            aVar.f24922f = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:101:0x0196 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:103:0x019a  */
        /* JADX WARN: Code duplicated, block: B:104:0x019c A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x01a6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:107:0x01a8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:108:0x01aa A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:109:0x01ac A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:111:0x01af A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:112:0x01b2 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x01b5 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:114:0x01b8 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x01bb A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:116:0x01be A[PHI: r4 r5
          0x01be: PHI (r4v31 int) = (r4v28 int), (r4v28 int), (r4v28 int), (r4v28 int), (r4v33 int), (r4v33 int) binds: [B:80:0x0160, B:82:0x0166, B:95:0x017f, B:85:0x016c, B:100:0x0194, B:110:0x01ae] A[DONT_GENERATE, DONT_INLINE]
          0x01be: PHI (r5v18 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
          (r5v16 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v16 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v16 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v16 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v20 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v20 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
         binds: [B:80:0x0160, B:82:0x0166, B:95:0x017f, B:85:0x016c, B:100:0x0194, B:110:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:120:0x01cb A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x01d5 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:123:0x01d7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:124:0x01d9 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:126:0x01ec A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x01f0 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:129:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:133:0x020d  */
        /* JADX WARN: Code duplicated, block: B:134:0x020f A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:136:0x0229  */
        /* JADX WARN: Code duplicated, block: B:137:0x022b  */
        /* JADX WARN: Code duplicated, block: B:140:0x0236 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:142:0x023a A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:143:0x023d  */
        /* JADX WARN: Code duplicated, block: B:147:0x0257  */
        /* JADX WARN: Code duplicated, block: B:148:0x0259 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:150:0x026b  */
        /* JADX WARN: Code duplicated, block: B:151:0x026d  */
        /* JADX WARN: Code duplicated, block: B:154:0x0294 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:156:0x0298 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:157:0x029b  */
        /* JADX WARN: Code duplicated, block: B:161:0x02b5  */
        /* JADX WARN: Code duplicated, block: B:162:0x02b7 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:164:0x02cb  */
        /* JADX WARN: Code duplicated, block: B:165:0x02cd A[Catch: all -> 0x002c, PHI: r2 r4 r5 r9
          0x02cd: PHI (r2v7 java.lang.Object) = (r2v4 java.lang.Object), (r2v17 java.lang.Object) binds: [B:163:0x02c9, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x02cd: PHI (r4v35 int) = (r4v32 int), (r4v37 int) binds: [B:163:0x02c9, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x02cd: PHI (r5v22 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
          (r5v19 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v23 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
         binds: [B:163:0x02c9, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x02cd: PHI (r9v15 m52.k) = (r9v8 m52.k), (r9v16 m52.k) binds: [B:163:0x02c9, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:167:0x02d3 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:168:0x02db A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:170:0x02df A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:173:0x0310  */
        /* JADX WARN: Code duplicated, block: B:174:0x0311 A[Catch: all -> 0x002c, PHI: r0 r2 r4 r5 r9
          0x0311: PHI (r0v22 java.lang.Object) = (r0v19 java.lang.Object), (r0v30 java.lang.Object) binds: [B:172:0x030e, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0311: PHI (r2v18 java.util.List<com.garmin.android.apps.connectmobile.workouts.data.model.v>) = 
          (r2v13 java.util.List<com.garmin.android.apps.connectmobile.workouts.data.model.v>)
          (r2v22 java.util.List<com.garmin.android.apps.connectmobile.workouts.data.model.v>)
         binds: [B:172:0x030e, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0311: PHI (r4v38 int) = (r4v35 int), (r4v40 int) binds: [B:172:0x030e, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0311: PHI (r5v24 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
          (r5v22 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v26 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
         binds: [B:172:0x030e, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0311: PHI (r9v17 m52.k) = (r9v15 m52.k), (r9v21 m52.k) binds: [B:172:0x030e, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:176:0x0337 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:178:0x033b A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:179:0x033e  */
        /* JADX WARN: Code duplicated, block: B:183:0x0358  */
        /* JADX WARN: Code duplicated, block: B:184:0x0359 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00cd A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00db  */
        /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:57:0x00ee A[Catch: all -> 0x002c, PHI: r4 r5
          0x00ee: PHI (r4v13 java.lang.Object) = (r4v10 java.lang.Object), (r4v16 java.lang.Object) binds: [B:55:0x00ea, B:39:0x00a5] A[DONT_GENERATE, DONT_INLINE]
          0x00ee: PHI (r5v8 int) = (r5v6 int), (r5v9 int) binds: [B:55:0x00ea, B:39:0x00a5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x00f6 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x010a  */
        /* JADX WARN: Code duplicated, block: B:62:0x010c  */
        /* JADX WARN: Code duplicated, block: B:65:0x011b  */
        /* JADX WARN: Code duplicated, block: B:66:0x011d A[Catch: all -> 0x002c, PHI: r4 r5
          0x011d: PHI (r4v24 java.lang.Object) = (r4v19 java.lang.Object), (r4v27 java.lang.Object) binds: [B:64:0x0119, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]
          0x011d: PHI (r5v14 int) = (r5v10 int), (r5v15 int) binds: [B:64:0x0119, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0126 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x012c A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0148  */
        /* JADX WARN: Code duplicated, block: B:74:0x014a A[Catch: all -> 0x002c, PHI: r4 r5
          0x014a: PHI (r4v28 int) = (r4v23 int), (r4v23 int), (r4v30 int) binds: [B:72:0x0146, B:70:0x012a, B:29:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x014a: PHI (r5v16 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
          (r5v13 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v13 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
          (r5v17 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
         binds: [B:72:0x0146, B:70:0x012a, B:29:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0150 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0162 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:12:0x0035, B:138:0x022c, B:140:0x0236, B:142:0x023a, B:144:0x023f, B:145:0x0241, B:16:0x0048, B:152:0x026e, B:154:0x0294, B:156:0x0298, B:158:0x029d, B:159:0x029f, B:20:0x0060, B:174:0x0311, B:176:0x0337, B:178:0x033b, B:180:0x0340, B:181:0x0342, B:23:0x006f, B:165:0x02cd, B:167:0x02d3, B:171:0x02fc, B:168:0x02db, B:170:0x02df, B:184:0x0359, B:185:0x035e, B:26:0x007c, B:99:0x0192, B:101:0x0196, B:111:0x01af, B:117:0x01bf, B:124:0x01d9, B:126:0x01ec, B:128:0x01f0, B:130:0x01f5, B:131:0x01f7, B:134:0x020f, B:148:0x0259, B:162:0x02b7, B:120:0x01cb, B:112:0x01b2, B:113:0x01b5, B:114:0x01b8, B:115:0x01bb, B:104:0x019c, B:29:0x0087, B:74:0x014a, B:76:0x0150, B:78:0x0154, B:81:0x0162, B:83:0x0168, B:86:0x016d, B:88:0x0171, B:90:0x0175, B:92:0x0179, B:94:0x017d, B:96:0x0181, B:32:0x008e, B:66:0x011d, B:67:0x0120, B:69:0x0126, B:71:0x012c, B:35:0x0098, B:63:0x010d, B:38:0x00a2, B:57:0x00ee, B:41:0x00ab, B:54:0x00de, B:42:0x00b2, B:48:0x00c9, B:50:0x00cd, B:59:0x00f6, B:45:0x00b9), top: B:191:0x0015 }] */
        /* JADX WARN: Code restructure failed: missing block: B:187:0x0376, code lost:
        
            if (r2.emit(r4, r19) == r3) goto L188;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:170:0x02df, please report this as an issue */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objQ;
            int i14;
            Object objN;
            Object objAwait;
            WorkoutDetailsDTO workoutDetailsDTO;
            Object objAwait2;
            WorkoutDetailsDTO workoutDetailsDTO2;
            int i15;
            String strA;
            qs.u uVar;
            Object objC4;
            Long l14;
            List<ww1.i0> list;
            Boolean bool;
            m52.k kVarR4;
            int i16;
            Object objY;
            Object objA4;
            m52.k kVar;
            Object objD4;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar;
            WorkoutDetailsDTO workoutDetailsDTO3;
            long j8;
            ww1.h0 h0Var;
            qs.u uVar2;
            int i17;
            v2 v2Var;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list2;
            Object objA5;
            WorkoutDetailsDTO workoutDetailsDTO4;
            long j14;
            WorkoutDetailsDTO workoutDetailsDTO5;
            long j15;
            WorkoutDetailsDTO workoutDetailsDTO6;
            long j16;
            o53.b0 b0Var = (o53.b0) this.f24922f;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = this.f24921e;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar2 = this.f24923g;
            try {
                switch (i18) {
                    case 0:
                        o13.r.b(obj);
                        r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = fVar2.Y;
                        v52.c.b bVar = v52.c.b.f175759a;
                        this.f24922f = b0Var;
                        this.f24921e = 1;
                        if (jVar.emit(bVar, this) != aVar) {
                            str = this.f24924h;
                            if (str != null) {
                                l52.y yVar = fVar2.f48588b;
                                this.f24922f = b0Var;
                                this.f24920d = 1;
                                this.f24921e = 2;
                                objN = yVar.n(str);
                                if (objN == aVar) {
                                    i14 = 1;
                                    this.f24922f = b0Var;
                                    this.f24920d = i14;
                                    this.f24921e = 3;
                                    objAwait = ((o53.i0) objN).await(this);
                                    if (objAwait != aVar) {
                                        workoutDetailsDTO = (WorkoutDetailsDTO) objAwait;
                                        int i19 = i14;
                                        workoutDetailsDTO2 = workoutDetailsDTO;
                                        i15 = i19;
                                        if (!workoutDetailsDTO2.H() || workoutDetailsDTO2.F()) {
                                            int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            Resources resourcesQ4 = fVar2.Q4();
                                            resourcesQ4.getClass();
                                            strA = i62.n.a(resourcesQ4);
                                            this.f24922f = b0Var;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24920d = i15;
                                            this.f24921e = 6;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                                if (!workoutDetailsDTO2.I() && (l14 = this.f24926j) != null) {
                                                    long jLongValue = l14.longValue();
                                                    int i25 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                                    fVar2.O4(jLongValue);
                                                    return Unit.INSTANCE;
                                                }
                                                if (i15 == 0 && workoutDetailsDTO2.f48044e == m52.k.f116756p && (uVar = workoutDetailsDTO2.M0) != null && (uVar == qs.u.AEROBIC_BASE || uVar == qs.u.LACTATE_THRESHOLD || uVar == qs.u.RECOVERY || uVar == qs.u.TEMPO || uVar == qs.u.VO2MAX)) {
                                                    this.f24922f = b0Var;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 7;
                                                    objC4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.C4(fVar2, this);
                                                    if (objC4 != aVar) {
                                                        h0Var = (ww1.h0) objC4;
                                                        if (h0Var == null) {
                                                            list = null;
                                                        } else {
                                                            uVar2 = workoutDetailsDTO2.M0;
                                                            if (uVar2 == null) {
                                                                i17 = -1;
                                                            } else {
                                                                i17 = ww1.h0.d.f187793a[uVar2.ordinal()];
                                                            }
                                                            if (i17 != 1) {
                                                                list = h0Var.f187787a;
                                                            } else if (i17 != 2) {
                                                                list = h0Var.f187788b;
                                                            } else if (i17 != 3) {
                                                                list = h0Var.f187789c;
                                                            } else if (i17 != 4) {
                                                                list = h0Var.f187790d;
                                                            } else if (i17 != 5) {
                                                                list = null;
                                                            } else {
                                                                list = h0Var.f187791e;
                                                            }
                                                        }
                                                        int i26 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                                        bool = Boolean.FALSE;
                                                        kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                                        if (kVarR4 == null) {
                                                            i16 = -1;
                                                        } else {
                                                            i16 = C0359a.f24927a[kVarR4.ordinal()];
                                                        }
                                                        if (i16 == 1) {
                                                            l52.y yVar2 = fVar2.f48588b;
                                                            this.f24922f = b0Var;
                                                            this.f24917a = workoutDetailsDTO2;
                                                            this.f24918b = kVarR4;
                                                            this.f24920d = i15;
                                                            this.f24921e = 8;
                                                            objY = yVar2.Y(this);
                                                            if (objY != aVar) {
                                                                v2Var = (v2) objY;
                                                                if (v2Var instanceof v2.b) {
                                                                    list2 = (List) ((v2.b) v2Var).f47386a;
                                                                } else {
                                                                    if (v2Var instanceof v2.a) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    String str2 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                                    com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                                    aVar2.getClass();
                                                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "WorkoutDetailsViewModel", str2);
                                                                    list2 = null;
                                                                }
                                                                this.f24922f = null;
                                                                this.f24917a = workoutDetailsDTO2;
                                                                this.f24918b = kVarR4;
                                                                this.f24919c = list2;
                                                                this.f24920d = i15;
                                                                this.f24921e = 9;
                                                                objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                                if (objA5 == aVar) {
                                                                    PowerZonesDTO powerZonesDTO = (PowerZonesDTO) objA5;
                                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                                    fVar2.f48608w = list2;
                                                                    x52.g.a aVar3 = x52.g.f189104d;
                                                                    Resources resourcesQ5 = fVar2.Q4();
                                                                    resourcesQ5.getClass();
                                                                    aVar3.getClass();
                                                                    x52.g.a.b(resourcesQ5, kVarR4, powerZonesDTO);
                                                                    fVar2.f48610y = powerZonesDTO;
                                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                                    if (!fVar2.Y4()) {
                                                                        workoutDetailsDTO4 = fVar2.f48605r;
                                                                        if (workoutDetailsDTO4 != null) {
                                                                            j14 = workoutDetailsDTO4.Y;
                                                                        } else {
                                                                            j14 = -1;
                                                                        }
                                                                        fVar2.C = j14;
                                                                    }
                                                                    fVar2.E = false;
                                                                    this.f24922f = null;
                                                                    this.f24917a = null;
                                                                    this.f24918b = null;
                                                                    this.f24919c = null;
                                                                    this.f24920d = i15;
                                                                    this.f24921e = 10;
                                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        } else if (i16 == 2) {
                                                            this.f24922f = null;
                                                            this.f24917a = workoutDetailsDTO2;
                                                            this.f24918b = kVarR4;
                                                            this.f24920d = i15;
                                                            this.f24921e = 11;
                                                            objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                            if (objA4 != aVar) {
                                                                kVar = kVarR4;
                                                                PowerZonesDTO powerZonesDTO2 = (PowerZonesDTO) objA4;
                                                                fVar2.f48605r = workoutDetailsDTO2;
                                                                fVar2.f48608w = null;
                                                                x52.g.a aVar4 = x52.g.f189104d;
                                                                Resources resourcesQ6 = fVar2.Q4();
                                                                resourcesQ6.getClass();
                                                                aVar4.getClass();
                                                                x52.g.a.b(resourcesQ6, kVar, powerZonesDTO2);
                                                                fVar2.f48610y = powerZonesDTO2;
                                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                                if (!fVar2.Y4()) {
                                                                    workoutDetailsDTO5 = fVar2.f48605r;
                                                                    if (workoutDetailsDTO5 != null) {
                                                                        j15 = workoutDetailsDTO5.Y;
                                                                    } else {
                                                                        j15 = -1;
                                                                    }
                                                                    fVar2.C = j15;
                                                                }
                                                                fVar2.E = false;
                                                                this.f24922f = null;
                                                                this.f24917a = null;
                                                                this.f24918b = null;
                                                                this.f24919c = null;
                                                                this.f24920d = i15;
                                                                this.f24921e = 12;
                                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        } else {
                                                            if (i16 != 3) {
                                                                fVar2.f48605r = workoutDetailsDTO2;
                                                                fVar2.f48608w = null;
                                                                fVar2.f48610y = null;
                                                                fVar2.f48602o = new o13.p<>(bool, null);
                                                                if (!fVar2.Y4()) {
                                                                    workoutDetailsDTO3 = fVar2.f48605r;
                                                                    if (workoutDetailsDTO3 != null) {
                                                                        j8 = workoutDetailsDTO3.Y;
                                                                    } else {
                                                                        j8 = -1;
                                                                    }
                                                                    fVar2.C = j8;
                                                                }
                                                                fVar2.E = false;
                                                                fVar2.f48603p = list;
                                                                this.f24922f = null;
                                                                this.f24917a = null;
                                                                this.f24918b = null;
                                                                this.f24920d = i15;
                                                                this.f24921e = 15;
                                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                            fVar2.f48605r = workoutDetailsDTO2;
                                                            fVar2.f48608w = null;
                                                            fVar2.f48610y = null;
                                                            this.f24922f = null;
                                                            this.f24917a = null;
                                                            this.f24918b = null;
                                                            this.f24919c = fVar2;
                                                            this.f24920d = i15;
                                                            this.f24921e = 13;
                                                            objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                            if (objD4 != aVar) {
                                                                fVar = fVar2;
                                                                fVar.f48602o = (o13.p) objD4;
                                                                if (!fVar2.Y4()) {
                                                                    workoutDetailsDTO6 = fVar2.f48605r;
                                                                    if (workoutDetailsDTO6 != null) {
                                                                        j16 = workoutDetailsDTO6.Y;
                                                                    } else {
                                                                        j16 = -1;
                                                                    }
                                                                    fVar2.C = j16;
                                                                }
                                                                fVar2.E = false;
                                                                this.f24922f = null;
                                                                this.f24917a = null;
                                                                this.f24918b = null;
                                                                this.f24919c = null;
                                                                this.f24920d = i15;
                                                                this.f24921e = 14;
                                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    list = null;
                                                    int i27 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                                    bool = Boolean.FALSE;
                                                    kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                                    if (kVarR4 == null) {
                                                        i16 = -1;
                                                    } else {
                                                        i16 = C0359a.f24927a[kVarR4.ordinal()];
                                                    }
                                                    if (i16 == 1) {
                                                        l52.y yVar3 = fVar2.f48588b;
                                                        this.f24922f = b0Var;
                                                        this.f24917a = workoutDetailsDTO2;
                                                        this.f24918b = kVarR4;
                                                        this.f24920d = i15;
                                                        this.f24921e = 8;
                                                        objY = yVar3.Y(this);
                                                        if (objY != aVar) {
                                                            v2Var = (v2) objY;
                                                            if (v2Var instanceof v2.b) {
                                                                list2 = (List) ((v2.b) v2Var).f47386a;
                                                            } else {
                                                                if (v2Var instanceof v2.a) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                String str3 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                                aVar5.getClass();
                                                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "WorkoutDetailsViewModel", str3);
                                                                list2 = null;
                                                            }
                                                            this.f24922f = null;
                                                            this.f24917a = workoutDetailsDTO2;
                                                            this.f24918b = kVarR4;
                                                            this.f24919c = list2;
                                                            this.f24920d = i15;
                                                            this.f24921e = 9;
                                                            objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                            if (objA5 == aVar) {
                                                                PowerZonesDTO powerZonesDTO3 = (PowerZonesDTO) objA5;
                                                                fVar2.f48605r = workoutDetailsDTO2;
                                                                fVar2.f48608w = list2;
                                                                x52.g.a aVar6 = x52.g.f189104d;
                                                                Resources resourcesQ7 = fVar2.Q4();
                                                                resourcesQ7.getClass();
                                                                aVar6.getClass();
                                                                x52.g.a.b(resourcesQ7, kVarR4, powerZonesDTO3);
                                                                fVar2.f48610y = powerZonesDTO3;
                                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                                if (!fVar2.Y4()) {
                                                                    workoutDetailsDTO4 = fVar2.f48605r;
                                                                    if (workoutDetailsDTO4 != null) {
                                                                        j14 = workoutDetailsDTO4.Y;
                                                                    } else {
                                                                        j14 = -1;
                                                                    }
                                                                    fVar2.C = j14;
                                                                }
                                                                fVar2.E = false;
                                                                this.f24922f = null;
                                                                this.f24917a = null;
                                                                this.f24918b = null;
                                                                this.f24919c = null;
                                                                this.f24920d = i15;
                                                                this.f24921e = 10;
                                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }
                                                    } else if (i16 == 2) {
                                                        this.f24922f = null;
                                                        this.f24917a = workoutDetailsDTO2;
                                                        this.f24918b = kVarR4;
                                                        this.f24920d = i15;
                                                        this.f24921e = 11;
                                                        objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                        if (objA4 != aVar) {
                                                            kVar = kVarR4;
                                                            PowerZonesDTO powerZonesDTO4 = (PowerZonesDTO) objA4;
                                                            fVar2.f48605r = workoutDetailsDTO2;
                                                            fVar2.f48608w = null;
                                                            x52.g.a aVar7 = x52.g.f189104d;
                                                            Resources resourcesQ8 = fVar2.Q4();
                                                            resourcesQ8.getClass();
                                                            aVar7.getClass();
                                                            x52.g.a.b(resourcesQ8, kVar, powerZonesDTO4);
                                                            fVar2.f48610y = powerZonesDTO4;
                                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                            if (!fVar2.Y4()) {
                                                                workoutDetailsDTO5 = fVar2.f48605r;
                                                                if (workoutDetailsDTO5 != null) {
                                                                    j15 = workoutDetailsDTO5.Y;
                                                                } else {
                                                                    j15 = -1;
                                                                }
                                                                fVar2.C = j15;
                                                            }
                                                            fVar2.E = false;
                                                            this.f24922f = null;
                                                            this.f24917a = null;
                                                            this.f24918b = null;
                                                            this.f24919c = null;
                                                            this.f24920d = i15;
                                                            this.f24921e = 12;
                                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    } else {
                                                        if (i16 != 3) {
                                                            fVar2.f48605r = workoutDetailsDTO2;
                                                            fVar2.f48608w = null;
                                                            fVar2.f48610y = null;
                                                            fVar2.f48602o = new o13.p<>(bool, null);
                                                            if (!fVar2.Y4()) {
                                                                workoutDetailsDTO3 = fVar2.f48605r;
                                                                if (workoutDetailsDTO3 != null) {
                                                                    j8 = workoutDetailsDTO3.Y;
                                                                } else {
                                                                    j8 = -1;
                                                                }
                                                                fVar2.C = j8;
                                                            }
                                                            fVar2.E = false;
                                                            fVar2.f48603p = list;
                                                            this.f24922f = null;
                                                            this.f24917a = null;
                                                            this.f24918b = null;
                                                            this.f24920d = i15;
                                                            this.f24921e = 15;
                                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = null;
                                                        fVar2.f48610y = null;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = fVar2;
                                                        this.f24920d = i15;
                                                        this.f24921e = 13;
                                                        objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                        if (objD4 != aVar) {
                                                            fVar = fVar2;
                                                            fVar.f48602o = (o13.p) objD4;
                                                            if (!fVar2.Y4()) {
                                                                workoutDetailsDTO6 = fVar2.f48605r;
                                                                if (workoutDetailsDTO6 != null) {
                                                                    j16 = workoutDetailsDTO6.Y;
                                                                } else {
                                                                    j16 = -1;
                                                                }
                                                                fVar2.C = j16;
                                                            }
                                                            fVar2.E = false;
                                                            this.f24922f = null;
                                                            this.f24917a = null;
                                                            this.f24918b = null;
                                                            this.f24919c = null;
                                                            this.f24920d = i15;
                                                            this.f24921e = 14;
                                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!workoutDetailsDTO2.I()) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            list = null;
                                            int i28 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                            if (kVarR4 == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = C0359a.f24927a[kVarR4.ordinal()];
                                            }
                                            if (i16 == 1) {
                                                l52.y yVar4 = fVar2.f48588b;
                                                this.f24922f = b0Var;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 8;
                                                objY = yVar4.Y(this);
                                                if (objY != aVar) {
                                                    v2Var = (v2) objY;
                                                    if (v2Var instanceof v2.b) {
                                                        list2 = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str4 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        com.garmin.android.apps.connectmobile.i2.a aVar8 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                        aVar8.getClass();
                                                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "WorkoutDetailsViewModel", str4);
                                                        list2 = null;
                                                    }
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24919c = list2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 9;
                                                    objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA5 == aVar) {
                                                        PowerZonesDTO powerZonesDTO5 = (PowerZonesDTO) objA5;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = list2;
                                                        x52.g.a aVar9 = x52.g.f189104d;
                                                        Resources resourcesQ9 = fVar2.Q4();
                                                        resourcesQ9.getClass();
                                                        aVar9.getClass();
                                                        x52.g.a.b(resourcesQ9, kVarR4, powerZonesDTO5);
                                                        fVar2.f48610y = powerZonesDTO5;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO4 = fVar2.f48605r;
                                                            if (workoutDetailsDTO4 != null) {
                                                                j14 = workoutDetailsDTO4.Y;
                                                            } else {
                                                                j14 = -1;
                                                            }
                                                            fVar2.C = j14;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 10;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i16 == 2) {
                                                this.f24922f = null;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 11;
                                                objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                if (objA4 != aVar) {
                                                    kVar = kVarR4;
                                                    PowerZonesDTO powerZonesDTO6 = (PowerZonesDTO) objA4;
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar10 = x52.g.f189104d;
                                                    Resources resourcesQ10 = fVar2.Q4();
                                                    resourcesQ10.getClass();
                                                    aVar10.getClass();
                                                    x52.g.a.b(resourcesQ10, kVar, powerZonesDTO6);
                                                    fVar2.f48610y = powerZonesDTO6;
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO5 = fVar2.f48605r;
                                                        if (workoutDetailsDTO5 != null) {
                                                            j15 = workoutDetailsDTO5.Y;
                                                        } else {
                                                            j15 = -1;
                                                        }
                                                        fVar2.C = j15;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 12;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i16 != 3) {
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO3 = fVar2.f48605r;
                                                        if (workoutDetailsDTO3 != null) {
                                                            j8 = workoutDetailsDTO3.Y;
                                                        } else {
                                                            j8 = -1;
                                                        }
                                                        fVar2.C = j8;
                                                    }
                                                    fVar2.E = false;
                                                    fVar2.f48603p = list;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 15;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = fVar2;
                                                this.f24920d = i15;
                                                this.f24921e = 13;
                                                objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                if (objD4 != aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) objD4;
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO6 = fVar2.f48605r;
                                                        if (workoutDetailsDTO6 != null) {
                                                            j16 = workoutDetailsDTO6.Y;
                                                        } else {
                                                            j16 = -1;
                                                        }
                                                        fVar2.C = j16;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 14;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                l52.y yVar5 = fVar2.f48588b;
                                String strValueOf = String.valueOf(this.f24925i);
                                this.f24922f = b0Var;
                                this.f24920d = 0;
                                this.f24921e = 4;
                                objQ = yVar5.q(strValueOf);
                                if (objQ == aVar) {
                                    i14 = 0;
                                    this.f24922f = b0Var;
                                    this.f24920d = i14;
                                    this.f24921e = 5;
                                    objAwait2 = ((o53.i0) objQ).await(this);
                                    if (objAwait2 != aVar) {
                                        workoutDetailsDTO = (WorkoutDetailsDTO) objAwait2;
                                        int i110 = i14;
                                        workoutDetailsDTO2 = workoutDetailsDTO;
                                        i15 = i110;
                                        if (workoutDetailsDTO2.H()) {
                                            int i29 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            Resources resourcesQ11 = fVar2.Q4();
                                            resourcesQ11.getClass();
                                            strA = i62.n.a(resourcesQ11);
                                            this.f24922f = b0Var;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24920d = i15;
                                            this.f24921e = 6;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                                if (!workoutDetailsDTO2.I()) {
                                                }
                                                if (i15 == 0) {
                                                }
                                                list = null;
                                                int i210 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                                bool = Boolean.FALSE;
                                                kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                                if (kVarR4 == null) {
                                                    i16 = -1;
                                                } else {
                                                    i16 = C0359a.f24927a[kVarR4.ordinal()];
                                                }
                                                if (i16 == 1) {
                                                    l52.y yVar6 = fVar2.f48588b;
                                                    this.f24922f = b0Var;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24920d = i15;
                                                    this.f24921e = 8;
                                                    objY = yVar6.Y(this);
                                                    if (objY != aVar) {
                                                        v2Var = (v2) objY;
                                                        if (v2Var instanceof v2.b) {
                                                            list2 = (List) ((v2.b) v2Var).f47386a;
                                                        } else {
                                                            if (v2Var instanceof v2.a) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            String str5 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                            com.garmin.android.apps.connectmobile.i2.a aVar11 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                            aVar11.getClass();
                                                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "WorkoutDetailsViewModel", str5);
                                                            list2 = null;
                                                        }
                                                        this.f24922f = null;
                                                        this.f24917a = workoutDetailsDTO2;
                                                        this.f24918b = kVarR4;
                                                        this.f24919c = list2;
                                                        this.f24920d = i15;
                                                        this.f24921e = 9;
                                                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                        if (objA5 == aVar) {
                                                            PowerZonesDTO powerZonesDTO7 = (PowerZonesDTO) objA5;
                                                            fVar2.f48605r = workoutDetailsDTO2;
                                                            fVar2.f48608w = list2;
                                                            x52.g.a aVar12 = x52.g.f189104d;
                                                            Resources resourcesQ12 = fVar2.Q4();
                                                            resourcesQ12.getClass();
                                                            aVar12.getClass();
                                                            x52.g.a.b(resourcesQ12, kVarR4, powerZonesDTO7);
                                                            fVar2.f48610y = powerZonesDTO7;
                                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                            if (!fVar2.Y4()) {
                                                                workoutDetailsDTO4 = fVar2.f48605r;
                                                                if (workoutDetailsDTO4 != null) {
                                                                    j14 = workoutDetailsDTO4.Y;
                                                                } else {
                                                                    j14 = -1;
                                                                }
                                                                fVar2.C = j14;
                                                            }
                                                            fVar2.E = false;
                                                            this.f24922f = null;
                                                            this.f24917a = null;
                                                            this.f24918b = null;
                                                            this.f24919c = null;
                                                            this.f24920d = i15;
                                                            this.f24921e = 10;
                                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                } else if (i16 == 2) {
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24920d = i15;
                                                    this.f24921e = 11;
                                                    objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA4 != aVar) {
                                                        kVar = kVarR4;
                                                        PowerZonesDTO powerZonesDTO8 = (PowerZonesDTO) objA4;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = null;
                                                        x52.g.a aVar13 = x52.g.f189104d;
                                                        Resources resourcesQ13 = fVar2.Q4();
                                                        resourcesQ13.getClass();
                                                        aVar13.getClass();
                                                        x52.g.a.b(resourcesQ13, kVar, powerZonesDTO8);
                                                        fVar2.f48610y = powerZonesDTO8;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO5 = fVar2.f48605r;
                                                            if (workoutDetailsDTO5 != null) {
                                                                j15 = workoutDetailsDTO5.Y;
                                                            } else {
                                                                j15 = -1;
                                                            }
                                                            fVar2.C = j15;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 12;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                } else {
                                                    if (i16 != 3) {
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = null;
                                                        fVar2.f48610y = null;
                                                        fVar2.f48602o = new o13.p<>(bool, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO3 = fVar2.f48605r;
                                                            if (workoutDetailsDTO3 != null) {
                                                                j8 = workoutDetailsDTO3.Y;
                                                            } else {
                                                                j8 = -1;
                                                            }
                                                            fVar2.C = j8;
                                                        }
                                                        fVar2.E = false;
                                                        fVar2.f48603p = list;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 15;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = fVar2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 13;
                                                    objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                    if (objD4 != aVar) {
                                                        fVar = fVar2;
                                                        fVar.f48602o = (o13.p) objD4;
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO6 = fVar2.f48605r;
                                                            if (workoutDetailsDTO6 != null) {
                                                                j16 = workoutDetailsDTO6.Y;
                                                            } else {
                                                                j16 = -1;
                                                            }
                                                            fVar2.C = j16;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 14;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i211 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            Resources resourcesQ14 = fVar2.Q4();
                                            resourcesQ14.getClass();
                                            strA = i62.n.a(resourcesQ14);
                                            this.f24922f = b0Var;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24920d = i15;
                                            this.f24921e = 6;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                                if (!workoutDetailsDTO2.I()) {
                                                }
                                                if (i15 == 0) {
                                                }
                                                list = null;
                                                int i212 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                                bool = Boolean.FALSE;
                                                kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                                if (kVarR4 == null) {
                                                    i16 = -1;
                                                } else {
                                                    i16 = C0359a.f24927a[kVarR4.ordinal()];
                                                }
                                                if (i16 == 1) {
                                                    l52.y yVar7 = fVar2.f48588b;
                                                    this.f24922f = b0Var;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24920d = i15;
                                                    this.f24921e = 8;
                                                    objY = yVar7.Y(this);
                                                    if (objY != aVar) {
                                                        v2Var = (v2) objY;
                                                        if (v2Var instanceof v2.b) {
                                                            list2 = (List) ((v2.b) v2Var).f47386a;
                                                        } else {
                                                            if (v2Var instanceof v2.a) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            String str6 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                            com.garmin.android.apps.connectmobile.i2.a aVar14 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                            com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                            aVar14.getClass();
                                                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var5, "WorkoutDetailsViewModel", str6);
                                                            list2 = null;
                                                        }
                                                        this.f24922f = null;
                                                        this.f24917a = workoutDetailsDTO2;
                                                        this.f24918b = kVarR4;
                                                        this.f24919c = list2;
                                                        this.f24920d = i15;
                                                        this.f24921e = 9;
                                                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                        if (objA5 == aVar) {
                                                            PowerZonesDTO powerZonesDTO9 = (PowerZonesDTO) objA5;
                                                            fVar2.f48605r = workoutDetailsDTO2;
                                                            fVar2.f48608w = list2;
                                                            x52.g.a aVar15 = x52.g.f189104d;
                                                            Resources resourcesQ15 = fVar2.Q4();
                                                            resourcesQ15.getClass();
                                                            aVar15.getClass();
                                                            x52.g.a.b(resourcesQ15, kVarR4, powerZonesDTO9);
                                                            fVar2.f48610y = powerZonesDTO9;
                                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                            if (!fVar2.Y4()) {
                                                                workoutDetailsDTO4 = fVar2.f48605r;
                                                                if (workoutDetailsDTO4 != null) {
                                                                    j14 = workoutDetailsDTO4.Y;
                                                                } else {
                                                                    j14 = -1;
                                                                }
                                                                fVar2.C = j14;
                                                            }
                                                            fVar2.E = false;
                                                            this.f24922f = null;
                                                            this.f24917a = null;
                                                            this.f24918b = null;
                                                            this.f24919c = null;
                                                            this.f24920d = i15;
                                                            this.f24921e = 10;
                                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                } else if (i16 == 2) {
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24920d = i15;
                                                    this.f24921e = 11;
                                                    objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA4 != aVar) {
                                                        kVar = kVarR4;
                                                        PowerZonesDTO powerZonesDTO10 = (PowerZonesDTO) objA4;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = null;
                                                        x52.g.a aVar16 = x52.g.f189104d;
                                                        Resources resourcesQ16 = fVar2.Q4();
                                                        resourcesQ16.getClass();
                                                        aVar16.getClass();
                                                        x52.g.a.b(resourcesQ16, kVar, powerZonesDTO10);
                                                        fVar2.f48610y = powerZonesDTO10;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO5 = fVar2.f48605r;
                                                            if (workoutDetailsDTO5 != null) {
                                                                j15 = workoutDetailsDTO5.Y;
                                                            } else {
                                                                j15 = -1;
                                                            }
                                                            fVar2.C = j15;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 12;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                } else {
                                                    if (i16 != 3) {
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = null;
                                                        fVar2.f48610y = null;
                                                        fVar2.f48602o = new o13.p<>(bool, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO3 = fVar2.f48605r;
                                                            if (workoutDetailsDTO3 != null) {
                                                                j8 = workoutDetailsDTO3.Y;
                                                            } else {
                                                                j8 = -1;
                                                            }
                                                            fVar2.C = j8;
                                                        }
                                                        fVar2.E = false;
                                                        fVar2.f48603p = list;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 15;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = fVar2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 13;
                                                    objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                    if (objD4 != aVar) {
                                                        fVar = fVar2;
                                                        fVar.f48602o = (o13.p) objD4;
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO6 = fVar2.f48605r;
                                                            if (workoutDetailsDTO6 != null) {
                                                                j16 = workoutDetailsDTO6.Y;
                                                            } else {
                                                                j16 = -1;
                                                            }
                                                            fVar2.C = j16;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 14;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        o13.r.b(obj);
                        str = this.f24924h;
                        if (str != null) {
                            l52.y yVar8 = fVar2.f48588b;
                            this.f24922f = b0Var;
                            this.f24920d = 1;
                            this.f24921e = 2;
                            objN = yVar8.n(str);
                            if (objN == aVar) {
                                i14 = 1;
                                this.f24922f = b0Var;
                                this.f24920d = i14;
                                this.f24921e = 3;
                                objAwait = ((o53.i0) objN).await(this);
                                if (objAwait != aVar) {
                                    workoutDetailsDTO = (WorkoutDetailsDTO) objAwait;
                                    int i111 = i14;
                                    workoutDetailsDTO2 = workoutDetailsDTO;
                                    i15 = i111;
                                    if (workoutDetailsDTO2.H()) {
                                        int i213 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                        Resources resourcesQ17 = fVar2.Q4();
                                        resourcesQ17.getClass();
                                        strA = i62.n.a(resourcesQ17);
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24920d = i15;
                                        this.f24921e = 6;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                            if (!workoutDetailsDTO2.I()) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            list = null;
                                            int i214 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                            if (kVarR4 == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = C0359a.f24927a[kVarR4.ordinal()];
                                            }
                                            if (i16 == 1) {
                                                l52.y yVar9 = fVar2.f48588b;
                                                this.f24922f = b0Var;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 8;
                                                objY = yVar9.Y(this);
                                                if (objY != aVar) {
                                                    v2Var = (v2) objY;
                                                    if (v2Var instanceof v2.b) {
                                                        list2 = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str7 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        com.garmin.android.apps.connectmobile.i2.a aVar17 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                        com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                        aVar17.getClass();
                                                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var6, "WorkoutDetailsViewModel", str7);
                                                        list2 = null;
                                                    }
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24919c = list2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 9;
                                                    objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA5 == aVar) {
                                                        PowerZonesDTO powerZonesDTO11 = (PowerZonesDTO) objA5;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = list2;
                                                        x52.g.a aVar18 = x52.g.f189104d;
                                                        Resources resourcesQ18 = fVar2.Q4();
                                                        resourcesQ18.getClass();
                                                        aVar18.getClass();
                                                        x52.g.a.b(resourcesQ18, kVarR4, powerZonesDTO11);
                                                        fVar2.f48610y = powerZonesDTO11;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO4 = fVar2.f48605r;
                                                            if (workoutDetailsDTO4 != null) {
                                                                j14 = workoutDetailsDTO4.Y;
                                                            } else {
                                                                j14 = -1;
                                                            }
                                                            fVar2.C = j14;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 10;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i16 == 2) {
                                                this.f24922f = null;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 11;
                                                objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                if (objA4 != aVar) {
                                                    kVar = kVarR4;
                                                    PowerZonesDTO powerZonesDTO12 = (PowerZonesDTO) objA4;
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar19 = x52.g.f189104d;
                                                    Resources resourcesQ19 = fVar2.Q4();
                                                    resourcesQ19.getClass();
                                                    aVar19.getClass();
                                                    x52.g.a.b(resourcesQ19, kVar, powerZonesDTO12);
                                                    fVar2.f48610y = powerZonesDTO12;
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO5 = fVar2.f48605r;
                                                        if (workoutDetailsDTO5 != null) {
                                                            j15 = workoutDetailsDTO5.Y;
                                                        } else {
                                                            j15 = -1;
                                                        }
                                                        fVar2.C = j15;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 12;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i16 != 3) {
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO3 = fVar2.f48605r;
                                                        if (workoutDetailsDTO3 != null) {
                                                            j8 = workoutDetailsDTO3.Y;
                                                        } else {
                                                            j8 = -1;
                                                        }
                                                        fVar2.C = j8;
                                                    }
                                                    fVar2.E = false;
                                                    fVar2.f48603p = list;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 15;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = fVar2;
                                                this.f24920d = i15;
                                                this.f24921e = 13;
                                                objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                if (objD4 != aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) objD4;
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO6 = fVar2.f48605r;
                                                        if (workoutDetailsDTO6 != null) {
                                                            j16 = workoutDetailsDTO6.Y;
                                                        } else {
                                                            j16 = -1;
                                                        }
                                                        fVar2.C = j16;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 14;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            break;
                                        }
                                    } else {
                                        int i215 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                        Resources resourcesQ110 = fVar2.Q4();
                                        resourcesQ110.getClass();
                                        strA = i62.n.a(resourcesQ110);
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24920d = i15;
                                        this.f24921e = 6;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                            if (!workoutDetailsDTO2.I()) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            list = null;
                                            int i216 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                            if (kVarR4 == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = C0359a.f24927a[kVarR4.ordinal()];
                                            }
                                            if (i16 == 1) {
                                                l52.y yVar10 = fVar2.f48588b;
                                                this.f24922f = b0Var;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 8;
                                                objY = yVar10.Y(this);
                                                if (objY != aVar) {
                                                    v2Var = (v2) objY;
                                                    if (v2Var instanceof v2.b) {
                                                        list2 = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str8 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        com.garmin.android.apps.connectmobile.i2.a aVar110 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                        com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                        aVar110.getClass();
                                                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var7, "WorkoutDetailsViewModel", str8);
                                                        list2 = null;
                                                    }
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24919c = list2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 9;
                                                    objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA5 == aVar) {
                                                        PowerZonesDTO powerZonesDTO13 = (PowerZonesDTO) objA5;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = list2;
                                                        x52.g.a aVar111 = x52.g.f189104d;
                                                        Resources resourcesQ111 = fVar2.Q4();
                                                        resourcesQ111.getClass();
                                                        aVar111.getClass();
                                                        x52.g.a.b(resourcesQ111, kVarR4, powerZonesDTO13);
                                                        fVar2.f48610y = powerZonesDTO13;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO4 = fVar2.f48605r;
                                                            if (workoutDetailsDTO4 != null) {
                                                                j14 = workoutDetailsDTO4.Y;
                                                            } else {
                                                                j14 = -1;
                                                            }
                                                            fVar2.C = j14;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 10;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i16 == 2) {
                                                this.f24922f = null;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 11;
                                                objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                if (objA4 != aVar) {
                                                    kVar = kVarR4;
                                                    PowerZonesDTO powerZonesDTO14 = (PowerZonesDTO) objA4;
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar112 = x52.g.f189104d;
                                                    Resources resourcesQ112 = fVar2.Q4();
                                                    resourcesQ112.getClass();
                                                    aVar112.getClass();
                                                    x52.g.a.b(resourcesQ112, kVar, powerZonesDTO14);
                                                    fVar2.f48610y = powerZonesDTO14;
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO5 = fVar2.f48605r;
                                                        if (workoutDetailsDTO5 != null) {
                                                            j15 = workoutDetailsDTO5.Y;
                                                        } else {
                                                            j15 = -1;
                                                        }
                                                        fVar2.C = j15;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 12;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i16 != 3) {
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO3 = fVar2.f48605r;
                                                        if (workoutDetailsDTO3 != null) {
                                                            j8 = workoutDetailsDTO3.Y;
                                                        } else {
                                                            j8 = -1;
                                                        }
                                                        fVar2.C = j8;
                                                    }
                                                    fVar2.E = false;
                                                    fVar2.f48603p = list;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 15;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = fVar2;
                                                this.f24920d = i15;
                                                this.f24921e = 13;
                                                objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                if (objD4 != aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) objD4;
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO6 = fVar2.f48605r;
                                                        if (workoutDetailsDTO6 != null) {
                                                            j16 = workoutDetailsDTO6.Y;
                                                        } else {
                                                            j16 = -1;
                                                        }
                                                        fVar2.C = j16;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 14;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            l52.y yVar11 = fVar2.f48588b;
                            String strValueOf2 = String.valueOf(this.f24925i);
                            this.f24922f = b0Var;
                            this.f24920d = 0;
                            this.f24921e = 4;
                            objQ = yVar11.q(strValueOf2);
                            if (objQ == aVar) {
                                i14 = 0;
                                this.f24922f = b0Var;
                                this.f24920d = i14;
                                this.f24921e = 5;
                                objAwait2 = ((o53.i0) objQ).await(this);
                                if (objAwait2 != aVar) {
                                    workoutDetailsDTO = (WorkoutDetailsDTO) objAwait2;
                                    int i112 = i14;
                                    workoutDetailsDTO2 = workoutDetailsDTO;
                                    i15 = i112;
                                    if (workoutDetailsDTO2.H()) {
                                        int i217 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                        Resources resourcesQ113 = fVar2.Q4();
                                        resourcesQ113.getClass();
                                        strA = i62.n.a(resourcesQ113);
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24920d = i15;
                                        this.f24921e = 6;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                            if (!workoutDetailsDTO2.I()) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            list = null;
                                            int i218 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                            if (kVarR4 == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = C0359a.f24927a[kVarR4.ordinal()];
                                            }
                                            if (i16 == 1) {
                                                l52.y yVar12 = fVar2.f48588b;
                                                this.f24922f = b0Var;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 8;
                                                objY = yVar12.Y(this);
                                                if (objY != aVar) {
                                                    v2Var = (v2) objY;
                                                    if (v2Var instanceof v2.b) {
                                                        list2 = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str9 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        com.garmin.android.apps.connectmobile.i2.a aVar113 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                        com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                        aVar113.getClass();
                                                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var8, "WorkoutDetailsViewModel", str9);
                                                        list2 = null;
                                                    }
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24919c = list2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 9;
                                                    objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA5 == aVar) {
                                                        PowerZonesDTO powerZonesDTO15 = (PowerZonesDTO) objA5;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = list2;
                                                        x52.g.a aVar114 = x52.g.f189104d;
                                                        Resources resourcesQ114 = fVar2.Q4();
                                                        resourcesQ114.getClass();
                                                        aVar114.getClass();
                                                        x52.g.a.b(resourcesQ114, kVarR4, powerZonesDTO15);
                                                        fVar2.f48610y = powerZonesDTO15;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO4 = fVar2.f48605r;
                                                            if (workoutDetailsDTO4 != null) {
                                                                j14 = workoutDetailsDTO4.Y;
                                                            } else {
                                                                j14 = -1;
                                                            }
                                                            fVar2.C = j14;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 10;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i16 == 2) {
                                                this.f24922f = null;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 11;
                                                objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                if (objA4 != aVar) {
                                                    kVar = kVarR4;
                                                    PowerZonesDTO powerZonesDTO16 = (PowerZonesDTO) objA4;
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar115 = x52.g.f189104d;
                                                    Resources resourcesQ115 = fVar2.Q4();
                                                    resourcesQ115.getClass();
                                                    aVar115.getClass();
                                                    x52.g.a.b(resourcesQ115, kVar, powerZonesDTO16);
                                                    fVar2.f48610y = powerZonesDTO16;
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO5 = fVar2.f48605r;
                                                        if (workoutDetailsDTO5 != null) {
                                                            j15 = workoutDetailsDTO5.Y;
                                                        } else {
                                                            j15 = -1;
                                                        }
                                                        fVar2.C = j15;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 12;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i16 != 3) {
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO3 = fVar2.f48605r;
                                                        if (workoutDetailsDTO3 != null) {
                                                            j8 = workoutDetailsDTO3.Y;
                                                        } else {
                                                            j8 = -1;
                                                        }
                                                        fVar2.C = j8;
                                                    }
                                                    fVar2.E = false;
                                                    fVar2.f48603p = list;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 15;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = fVar2;
                                                this.f24920d = i15;
                                                this.f24921e = 13;
                                                objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                if (objD4 != aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) objD4;
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO6 = fVar2.f48605r;
                                                        if (workoutDetailsDTO6 != null) {
                                                            j16 = workoutDetailsDTO6.Y;
                                                        } else {
                                                            j16 = -1;
                                                        }
                                                        fVar2.C = j16;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 14;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            break;
                                        }
                                    } else {
                                        int i219 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                        Resources resourcesQ116 = fVar2.Q4();
                                        resourcesQ116.getClass();
                                        strA = i62.n.a(resourcesQ116);
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24920d = i15;
                                        this.f24921e = 6;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                            if (!workoutDetailsDTO2.I()) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            list = null;
                                            int i2110 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                            if (kVarR4 == null) {
                                                i16 = -1;
                                            } else {
                                                i16 = C0359a.f24927a[kVarR4.ordinal()];
                                            }
                                            if (i16 == 1) {
                                                l52.y yVar13 = fVar2.f48588b;
                                                this.f24922f = b0Var;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 8;
                                                objY = yVar13.Y(this);
                                                if (objY != aVar) {
                                                    v2Var = (v2) objY;
                                                    if (v2Var instanceof v2.b) {
                                                        list2 = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (v2Var instanceof v2.a) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str10 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        com.garmin.android.apps.connectmobile.i2.a aVar116 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                        com.garmin.android.apps.connectmobile.a2 a2Var9 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                        aVar116.getClass();
                                                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var9, "WorkoutDetailsViewModel", str10);
                                                        list2 = null;
                                                    }
                                                    this.f24922f = null;
                                                    this.f24917a = workoutDetailsDTO2;
                                                    this.f24918b = kVarR4;
                                                    this.f24919c = list2;
                                                    this.f24920d = i15;
                                                    this.f24921e = 9;
                                                    objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                    if (objA5 == aVar) {
                                                        PowerZonesDTO powerZonesDTO17 = (PowerZonesDTO) objA5;
                                                        fVar2.f48605r = workoutDetailsDTO2;
                                                        fVar2.f48608w = list2;
                                                        x52.g.a aVar117 = x52.g.f189104d;
                                                        Resources resourcesQ117 = fVar2.Q4();
                                                        resourcesQ117.getClass();
                                                        aVar117.getClass();
                                                        x52.g.a.b(resourcesQ117, kVarR4, powerZonesDTO17);
                                                        fVar2.f48610y = powerZonesDTO17;
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        if (!fVar2.Y4()) {
                                                            workoutDetailsDTO4 = fVar2.f48605r;
                                                            if (workoutDetailsDTO4 != null) {
                                                                j14 = workoutDetailsDTO4.Y;
                                                            } else {
                                                                j14 = -1;
                                                            }
                                                            fVar2.C = j14;
                                                        }
                                                        fVar2.E = false;
                                                        this.f24922f = null;
                                                        this.f24917a = null;
                                                        this.f24918b = null;
                                                        this.f24919c = null;
                                                        this.f24920d = i15;
                                                        this.f24921e = 10;
                                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i16 == 2) {
                                                this.f24922f = null;
                                                this.f24917a = workoutDetailsDTO2;
                                                this.f24918b = kVarR4;
                                                this.f24920d = i15;
                                                this.f24921e = 11;
                                                objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                                if (objA4 != aVar) {
                                                    kVar = kVarR4;
                                                    PowerZonesDTO powerZonesDTO18 = (PowerZonesDTO) objA4;
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar118 = x52.g.f189104d;
                                                    Resources resourcesQ118 = fVar2.Q4();
                                                    resourcesQ118.getClass();
                                                    aVar118.getClass();
                                                    x52.g.a.b(resourcesQ118, kVar, powerZonesDTO18);
                                                    fVar2.f48610y = powerZonesDTO18;
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO5 = fVar2.f48605r;
                                                        if (workoutDetailsDTO5 != null) {
                                                            j15 = workoutDetailsDTO5.Y;
                                                        } else {
                                                            j15 = -1;
                                                        }
                                                        fVar2.C = j15;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 12;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i16 != 3) {
                                                    fVar2.f48605r = workoutDetailsDTO2;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO3 = fVar2.f48605r;
                                                        if (workoutDetailsDTO3 != null) {
                                                            j8 = workoutDetailsDTO3.Y;
                                                        } else {
                                                            j8 = -1;
                                                        }
                                                        fVar2.C = j8;
                                                    }
                                                    fVar2.E = false;
                                                    fVar2.f48603p = list;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 15;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = fVar2;
                                                this.f24920d = i15;
                                                this.f24921e = 13;
                                                objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                                if (objD4 != aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) objD4;
                                                    if (!fVar2.Y4()) {
                                                        workoutDetailsDTO6 = fVar2.f48605r;
                                                        if (workoutDetailsDTO6 != null) {
                                                            j16 = workoutDetailsDTO6.Y;
                                                        } else {
                                                            j16 = -1;
                                                        }
                                                        fVar2.C = j16;
                                                    }
                                                    fVar2.E = false;
                                                    this.f24922f = null;
                                                    this.f24917a = null;
                                                    this.f24918b = null;
                                                    this.f24919c = null;
                                                    this.f24920d = i15;
                                                    this.f24921e = 14;
                                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 2:
                        int i30 = this.f24920d;
                        o13.r.b(obj);
                        i14 = i30;
                        objN = obj;
                        this.f24922f = b0Var;
                        this.f24920d = i14;
                        this.f24921e = 3;
                        objAwait = ((o53.i0) objN).await(this);
                        if (objAwait != aVar) {
                            workoutDetailsDTO = (WorkoutDetailsDTO) objAwait;
                            int i113 = i14;
                            workoutDetailsDTO2 = workoutDetailsDTO;
                            i15 = i113;
                            if (workoutDetailsDTO2.H()) {
                                int i2111 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                Resources resourcesQ119 = fVar2.Q4();
                                resourcesQ119.getClass();
                                strA = i62.n.a(resourcesQ119);
                                this.f24922f = b0Var;
                                this.f24917a = workoutDetailsDTO2;
                                this.f24920d = i15;
                                this.f24921e = 6;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                    if (!workoutDetailsDTO2.I()) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    list = null;
                                    int i2112 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                    bool = Boolean.FALSE;
                                    kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                    if (kVarR4 == null) {
                                        i16 = -1;
                                    } else {
                                        i16 = C0359a.f24927a[kVarR4.ordinal()];
                                    }
                                    if (i16 == 1) {
                                        l52.y yVar14 = fVar2.f48588b;
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 8;
                                        objY = yVar14.Y(this);
                                        if (objY != aVar) {
                                            v2Var = (v2) objY;
                                            if (v2Var instanceof v2.b) {
                                                list2 = (List) ((v2.b) v2Var).f47386a;
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String str11 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                com.garmin.android.apps.connectmobile.i2.a aVar119 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                com.garmin.android.apps.connectmobile.a2 a2Var10 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                aVar119.getClass();
                                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var10, "WorkoutDetailsViewModel", str11);
                                                list2 = null;
                                            }
                                            this.f24922f = null;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24918b = kVarR4;
                                            this.f24919c = list2;
                                            this.f24920d = i15;
                                            this.f24921e = 9;
                                            objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                            if (objA5 == aVar) {
                                                PowerZonesDTO powerZonesDTO19 = (PowerZonesDTO) objA5;
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = list2;
                                                x52.g.a aVar1110 = x52.g.f189104d;
                                                Resources resourcesQ1110 = fVar2.Q4();
                                                resourcesQ1110.getClass();
                                                aVar1110.getClass();
                                                x52.g.a.b(resourcesQ1110, kVarR4, powerZonesDTO19);
                                                fVar2.f48610y = powerZonesDTO19;
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                if (!fVar2.Y4()) {
                                                    workoutDetailsDTO4 = fVar2.f48605r;
                                                    if (workoutDetailsDTO4 != null) {
                                                        j14 = workoutDetailsDTO4.Y;
                                                    } else {
                                                        j14 = -1;
                                                    }
                                                    fVar2.C = j14;
                                                }
                                                fVar2.E = false;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = null;
                                                this.f24920d = i15;
                                                this.f24921e = 10;
                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else if (i16 == 2) {
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 11;
                                        objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA4 != aVar) {
                                            kVar = kVarR4;
                                            PowerZonesDTO powerZonesDTO110 = (PowerZonesDTO) objA4;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            x52.g.a aVar1111 = x52.g.f189104d;
                                            Resources resourcesQ1111 = fVar2.Q4();
                                            resourcesQ1111.getClass();
                                            aVar1111.getClass();
                                            x52.g.a.b(resourcesQ1111, kVar, powerZonesDTO110);
                                            fVar2.f48610y = powerZonesDTO110;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO5 = fVar2.f48605r;
                                                if (workoutDetailsDTO5 != null) {
                                                    j15 = workoutDetailsDTO5.Y;
                                                } else {
                                                    j15 = -1;
                                                }
                                                fVar2.C = j15;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 12;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (i16 != 3) {
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            fVar2.f48602o = new o13.p<>(bool, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO3 = fVar2.f48605r;
                                                if (workoutDetailsDTO3 != null) {
                                                    j8 = workoutDetailsDTO3.Y;
                                                } else {
                                                    j8 = -1;
                                                }
                                                fVar2.C = j8;
                                            }
                                            fVar2.E = false;
                                            fVar2.f48603p = list;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24920d = i15;
                                            this.f24921e = 15;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = fVar2;
                                        this.f24920d = i15;
                                        this.f24921e = 13;
                                        objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                        if (objD4 != aVar) {
                                            fVar = fVar2;
                                            fVar.f48602o = (o13.p) objD4;
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO6 = fVar2.f48605r;
                                                if (workoutDetailsDTO6 != null) {
                                                    j16 = workoutDetailsDTO6.Y;
                                                } else {
                                                    j16 = -1;
                                                }
                                                fVar2.C = j16;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 14;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                int i2113 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                Resources resourcesQ1112 = fVar2.Q4();
                                resourcesQ1112.getClass();
                                strA = i62.n.a(resourcesQ1112);
                                this.f24922f = b0Var;
                                this.f24917a = workoutDetailsDTO2;
                                this.f24920d = i15;
                                this.f24921e = 6;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                    if (!workoutDetailsDTO2.I()) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    list = null;
                                    int i2114 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                    bool = Boolean.FALSE;
                                    kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                    if (kVarR4 == null) {
                                        i16 = -1;
                                    } else {
                                        i16 = C0359a.f24927a[kVarR4.ordinal()];
                                    }
                                    if (i16 == 1) {
                                        l52.y yVar15 = fVar2.f48588b;
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 8;
                                        objY = yVar15.Y(this);
                                        if (objY != aVar) {
                                            v2Var = (v2) objY;
                                            if (v2Var instanceof v2.b) {
                                                list2 = (List) ((v2.b) v2Var).f47386a;
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String str12 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                com.garmin.android.apps.connectmobile.i2.a aVar1112 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                com.garmin.android.apps.connectmobile.a2 a2Var11 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                aVar1112.getClass();
                                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var11, "WorkoutDetailsViewModel", str12);
                                                list2 = null;
                                            }
                                            this.f24922f = null;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24918b = kVarR4;
                                            this.f24919c = list2;
                                            this.f24920d = i15;
                                            this.f24921e = 9;
                                            objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                            if (objA5 == aVar) {
                                                PowerZonesDTO powerZonesDTO111 = (PowerZonesDTO) objA5;
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = list2;
                                                x52.g.a aVar1113 = x52.g.f189104d;
                                                Resources resourcesQ1113 = fVar2.Q4();
                                                resourcesQ1113.getClass();
                                                aVar1113.getClass();
                                                x52.g.a.b(resourcesQ1113, kVarR4, powerZonesDTO111);
                                                fVar2.f48610y = powerZonesDTO111;
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                if (!fVar2.Y4()) {
                                                    workoutDetailsDTO4 = fVar2.f48605r;
                                                    if (workoutDetailsDTO4 != null) {
                                                        j14 = workoutDetailsDTO4.Y;
                                                    } else {
                                                        j14 = -1;
                                                    }
                                                    fVar2.C = j14;
                                                }
                                                fVar2.E = false;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = null;
                                                this.f24920d = i15;
                                                this.f24921e = 10;
                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else if (i16 == 2) {
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 11;
                                        objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA4 != aVar) {
                                            kVar = kVarR4;
                                            PowerZonesDTO powerZonesDTO112 = (PowerZonesDTO) objA4;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            x52.g.a aVar1114 = x52.g.f189104d;
                                            Resources resourcesQ1114 = fVar2.Q4();
                                            resourcesQ1114.getClass();
                                            aVar1114.getClass();
                                            x52.g.a.b(resourcesQ1114, kVar, powerZonesDTO112);
                                            fVar2.f48610y = powerZonesDTO112;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO5 = fVar2.f48605r;
                                                if (workoutDetailsDTO5 != null) {
                                                    j15 = workoutDetailsDTO5.Y;
                                                } else {
                                                    j15 = -1;
                                                }
                                                fVar2.C = j15;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 12;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (i16 != 3) {
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            fVar2.f48602o = new o13.p<>(bool, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO3 = fVar2.f48605r;
                                                if (workoutDetailsDTO3 != null) {
                                                    j8 = workoutDetailsDTO3.Y;
                                                } else {
                                                    j8 = -1;
                                                }
                                                fVar2.C = j8;
                                            }
                                            fVar2.E = false;
                                            fVar2.f48603p = list;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24920d = i15;
                                            this.f24921e = 15;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = fVar2;
                                        this.f24920d = i15;
                                        this.f24921e = 13;
                                        objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                        if (objD4 != aVar) {
                                            fVar = fVar2;
                                            fVar.f48602o = (o13.p) objD4;
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO6 = fVar2.f48605r;
                                                if (workoutDetailsDTO6 != null) {
                                                    j16 = workoutDetailsDTO6.Y;
                                                } else {
                                                    j16 = -1;
                                                }
                                                fVar2.C = j16;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 14;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        return aVar;
                    case 3:
                        int i34 = this.f24920d;
                        o13.r.b(obj);
                        i14 = i34;
                        objAwait = obj;
                        workoutDetailsDTO = (WorkoutDetailsDTO) objAwait;
                        int i114 = i14;
                        workoutDetailsDTO2 = workoutDetailsDTO;
                        i15 = i114;
                        if (workoutDetailsDTO2.H()) {
                            int i2115 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                            Resources resourcesQ1115 = fVar2.Q4();
                            resourcesQ1115.getClass();
                            strA = i62.n.a(resourcesQ1115);
                            this.f24922f = b0Var;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24920d = i15;
                            this.f24921e = 6;
                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                if (!workoutDetailsDTO2.I()) {
                                }
                                if (i15 == 0) {
                                }
                                list = null;
                                int i2116 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                bool = Boolean.FALSE;
                                kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                if (kVarR4 == null) {
                                    i16 = -1;
                                } else {
                                    i16 = C0359a.f24927a[kVarR4.ordinal()];
                                }
                                if (i16 == 1) {
                                    l52.y yVar16 = fVar2.f48588b;
                                    this.f24922f = b0Var;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 8;
                                    objY = yVar16.Y(this);
                                    if (objY != aVar) {
                                        v2Var = (v2) objY;
                                        if (v2Var instanceof v2.b) {
                                            list2 = (List) ((v2.b) v2Var).f47386a;
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str13 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                            com.garmin.android.apps.connectmobile.i2.a aVar1115 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                            com.garmin.android.apps.connectmobile.a2 a2Var12 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                            aVar1115.getClass();
                                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var12, "WorkoutDetailsViewModel", str13);
                                            list2 = null;
                                        }
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24919c = list2;
                                        this.f24920d = i15;
                                        this.f24921e = 9;
                                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA5 == aVar) {
                                            PowerZonesDTO powerZonesDTO113 = (PowerZonesDTO) objA5;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = list2;
                                            x52.g.a aVar1116 = x52.g.f189104d;
                                            Resources resourcesQ1116 = fVar2.Q4();
                                            resourcesQ1116.getClass();
                                            aVar1116.getClass();
                                            x52.g.a.b(resourcesQ1116, kVarR4, powerZonesDTO113);
                                            fVar2.f48610y = powerZonesDTO113;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO4 = fVar2.f48605r;
                                                if (workoutDetailsDTO4 != null) {
                                                    j14 = workoutDetailsDTO4.Y;
                                                } else {
                                                    j14 = -1;
                                                }
                                                fVar2.C = j14;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 10;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else if (i16 == 2) {
                                    this.f24922f = null;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 11;
                                    objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                    if (objA4 != aVar) {
                                        kVar = kVarR4;
                                        PowerZonesDTO powerZonesDTO114 = (PowerZonesDTO) objA4;
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        x52.g.a aVar1117 = x52.g.f189104d;
                                        Resources resourcesQ1117 = fVar2.Q4();
                                        resourcesQ1117.getClass();
                                        aVar1117.getClass();
                                        x52.g.a.b(resourcesQ1117, kVar, powerZonesDTO114);
                                        fVar2.f48610y = powerZonesDTO114;
                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO5 = fVar2.f48605r;
                                            if (workoutDetailsDTO5 != null) {
                                                j15 = workoutDetailsDTO5.Y;
                                            } else {
                                                j15 = -1;
                                            }
                                            fVar2.C = j15;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 12;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i16 != 3) {
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        fVar2.f48602o = new o13.p<>(bool, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO3 = fVar2.f48605r;
                                            if (workoutDetailsDTO3 != null) {
                                                j8 = workoutDetailsDTO3.Y;
                                            } else {
                                                j8 = -1;
                                            }
                                            fVar2.C = j8;
                                        }
                                        fVar2.E = false;
                                        fVar2.f48603p = list;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24920d = i15;
                                        this.f24921e = 15;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fVar2.f48605r = workoutDetailsDTO2;
                                    fVar2.f48608w = null;
                                    fVar2.f48610y = null;
                                    this.f24922f = null;
                                    this.f24917a = null;
                                    this.f24918b = null;
                                    this.f24919c = fVar2;
                                    this.f24920d = i15;
                                    this.f24921e = 13;
                                    objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                    if (objD4 != aVar) {
                                        fVar = fVar2;
                                        fVar.f48602o = (o13.p) objD4;
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO6 = fVar2.f48605r;
                                            if (workoutDetailsDTO6 != null) {
                                                j16 = workoutDetailsDTO6.Y;
                                            } else {
                                                j16 = -1;
                                            }
                                            fVar2.C = j16;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 14;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                break;
                            }
                        } else {
                            int i2117 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                            Resources resourcesQ1118 = fVar2.Q4();
                            resourcesQ1118.getClass();
                            strA = i62.n.a(resourcesQ1118);
                            this.f24922f = b0Var;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24920d = i15;
                            this.f24921e = 6;
                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                if (!workoutDetailsDTO2.I()) {
                                }
                                if (i15 == 0) {
                                }
                                list = null;
                                int i2118 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                bool = Boolean.FALSE;
                                kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                if (kVarR4 == null) {
                                    i16 = -1;
                                } else {
                                    i16 = C0359a.f24927a[kVarR4.ordinal()];
                                }
                                if (i16 == 1) {
                                    l52.y yVar17 = fVar2.f48588b;
                                    this.f24922f = b0Var;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 8;
                                    objY = yVar17.Y(this);
                                    if (objY != aVar) {
                                        v2Var = (v2) objY;
                                        if (v2Var instanceof v2.b) {
                                            list2 = (List) ((v2.b) v2Var).f47386a;
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str14 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                            com.garmin.android.apps.connectmobile.i2.a aVar1118 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                            com.garmin.android.apps.connectmobile.a2 a2Var13 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                            aVar1118.getClass();
                                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var13, "WorkoutDetailsViewModel", str14);
                                            list2 = null;
                                        }
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24919c = list2;
                                        this.f24920d = i15;
                                        this.f24921e = 9;
                                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA5 == aVar) {
                                            PowerZonesDTO powerZonesDTO115 = (PowerZonesDTO) objA5;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = list2;
                                            x52.g.a aVar1119 = x52.g.f189104d;
                                            Resources resourcesQ1119 = fVar2.Q4();
                                            resourcesQ1119.getClass();
                                            aVar1119.getClass();
                                            x52.g.a.b(resourcesQ1119, kVarR4, powerZonesDTO115);
                                            fVar2.f48610y = powerZonesDTO115;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO4 = fVar2.f48605r;
                                                if (workoutDetailsDTO4 != null) {
                                                    j14 = workoutDetailsDTO4.Y;
                                                } else {
                                                    j14 = -1;
                                                }
                                                fVar2.C = j14;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 10;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else if (i16 == 2) {
                                    this.f24922f = null;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 11;
                                    objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                    if (objA4 != aVar) {
                                        kVar = kVarR4;
                                        PowerZonesDTO powerZonesDTO116 = (PowerZonesDTO) objA4;
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        x52.g.a aVar11110 = x52.g.f189104d;
                                        Resources resourcesQ11110 = fVar2.Q4();
                                        resourcesQ11110.getClass();
                                        aVar11110.getClass();
                                        x52.g.a.b(resourcesQ11110, kVar, powerZonesDTO116);
                                        fVar2.f48610y = powerZonesDTO116;
                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO5 = fVar2.f48605r;
                                            if (workoutDetailsDTO5 != null) {
                                                j15 = workoutDetailsDTO5.Y;
                                            } else {
                                                j15 = -1;
                                            }
                                            fVar2.C = j15;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 12;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i16 != 3) {
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        fVar2.f48602o = new o13.p<>(bool, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO3 = fVar2.f48605r;
                                            if (workoutDetailsDTO3 != null) {
                                                j8 = workoutDetailsDTO3.Y;
                                            } else {
                                                j8 = -1;
                                            }
                                            fVar2.C = j8;
                                        }
                                        fVar2.E = false;
                                        fVar2.f48603p = list;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24920d = i15;
                                        this.f24921e = 15;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fVar2.f48605r = workoutDetailsDTO2;
                                    fVar2.f48608w = null;
                                    fVar2.f48610y = null;
                                    this.f24922f = null;
                                    this.f24917a = null;
                                    this.f24918b = null;
                                    this.f24919c = fVar2;
                                    this.f24920d = i15;
                                    this.f24921e = 13;
                                    objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                    if (objD4 != aVar) {
                                        fVar = fVar2;
                                        fVar.f48602o = (o13.p) objD4;
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO6 = fVar2.f48605r;
                                            if (workoutDetailsDTO6 != null) {
                                                j16 = workoutDetailsDTO6.Y;
                                            } else {
                                                j16 = -1;
                                            }
                                            fVar2.C = j16;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 14;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                break;
                            }
                        }
                        return aVar;
                    case 4:
                        int i35 = this.f24920d;
                        o13.r.b(obj);
                        i14 = i35;
                        objQ = obj;
                        this.f24922f = b0Var;
                        this.f24920d = i14;
                        this.f24921e = 5;
                        objAwait2 = ((o53.i0) objQ).await(this);
                        if (objAwait2 != aVar) {
                            workoutDetailsDTO = (WorkoutDetailsDTO) objAwait2;
                            int i115 = i14;
                            workoutDetailsDTO2 = workoutDetailsDTO;
                            i15 = i115;
                            if (workoutDetailsDTO2.H()) {
                                int i2119 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                Resources resourcesQ11111 = fVar2.Q4();
                                resourcesQ11111.getClass();
                                strA = i62.n.a(resourcesQ11111);
                                this.f24922f = b0Var;
                                this.f24917a = workoutDetailsDTO2;
                                this.f24920d = i15;
                                this.f24921e = 6;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                    if (!workoutDetailsDTO2.I()) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    list = null;
                                    int i21110 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                    bool = Boolean.FALSE;
                                    kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                    if (kVarR4 == null) {
                                        i16 = -1;
                                    } else {
                                        i16 = C0359a.f24927a[kVarR4.ordinal()];
                                    }
                                    if (i16 == 1) {
                                        l52.y yVar18 = fVar2.f48588b;
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 8;
                                        objY = yVar18.Y(this);
                                        if (objY != aVar) {
                                            v2Var = (v2) objY;
                                            if (v2Var instanceof v2.b) {
                                                list2 = (List) ((v2.b) v2Var).f47386a;
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String str15 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                com.garmin.android.apps.connectmobile.i2.a aVar11111 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                com.garmin.android.apps.connectmobile.a2 a2Var14 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                aVar11111.getClass();
                                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var14, "WorkoutDetailsViewModel", str15);
                                                list2 = null;
                                            }
                                            this.f24922f = null;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24918b = kVarR4;
                                            this.f24919c = list2;
                                            this.f24920d = i15;
                                            this.f24921e = 9;
                                            objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                            if (objA5 == aVar) {
                                                PowerZonesDTO powerZonesDTO117 = (PowerZonesDTO) objA5;
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = list2;
                                                x52.g.a aVar11112 = x52.g.f189104d;
                                                Resources resourcesQ11112 = fVar2.Q4();
                                                resourcesQ11112.getClass();
                                                aVar11112.getClass();
                                                x52.g.a.b(resourcesQ11112, kVarR4, powerZonesDTO117);
                                                fVar2.f48610y = powerZonesDTO117;
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                if (!fVar2.Y4()) {
                                                    workoutDetailsDTO4 = fVar2.f48605r;
                                                    if (workoutDetailsDTO4 != null) {
                                                        j14 = workoutDetailsDTO4.Y;
                                                    } else {
                                                        j14 = -1;
                                                    }
                                                    fVar2.C = j14;
                                                }
                                                fVar2.E = false;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = null;
                                                this.f24920d = i15;
                                                this.f24921e = 10;
                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else if (i16 == 2) {
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 11;
                                        objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA4 != aVar) {
                                            kVar = kVarR4;
                                            PowerZonesDTO powerZonesDTO118 = (PowerZonesDTO) objA4;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            x52.g.a aVar11113 = x52.g.f189104d;
                                            Resources resourcesQ11113 = fVar2.Q4();
                                            resourcesQ11113.getClass();
                                            aVar11113.getClass();
                                            x52.g.a.b(resourcesQ11113, kVar, powerZonesDTO118);
                                            fVar2.f48610y = powerZonesDTO118;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO5 = fVar2.f48605r;
                                                if (workoutDetailsDTO5 != null) {
                                                    j15 = workoutDetailsDTO5.Y;
                                                } else {
                                                    j15 = -1;
                                                }
                                                fVar2.C = j15;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 12;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (i16 != 3) {
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            fVar2.f48602o = new o13.p<>(bool, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO3 = fVar2.f48605r;
                                                if (workoutDetailsDTO3 != null) {
                                                    j8 = workoutDetailsDTO3.Y;
                                                } else {
                                                    j8 = -1;
                                                }
                                                fVar2.C = j8;
                                            }
                                            fVar2.E = false;
                                            fVar2.f48603p = list;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24920d = i15;
                                            this.f24921e = 15;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = fVar2;
                                        this.f24920d = i15;
                                        this.f24921e = 13;
                                        objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                        if (objD4 != aVar) {
                                            fVar = fVar2;
                                            fVar.f48602o = (o13.p) objD4;
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO6 = fVar2.f48605r;
                                                if (workoutDetailsDTO6 != null) {
                                                    j16 = workoutDetailsDTO6.Y;
                                                } else {
                                                    j16 = -1;
                                                }
                                                fVar2.C = j16;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 14;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                int i21111 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                Resources resourcesQ11114 = fVar2.Q4();
                                resourcesQ11114.getClass();
                                strA = i62.n.a(resourcesQ11114);
                                this.f24922f = b0Var;
                                this.f24917a = workoutDetailsDTO2;
                                this.f24920d = i15;
                                this.f24921e = 6;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                    if (!workoutDetailsDTO2.I()) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    list = null;
                                    int i21112 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                    bool = Boolean.FALSE;
                                    kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                    if (kVarR4 == null) {
                                        i16 = -1;
                                    } else {
                                        i16 = C0359a.f24927a[kVarR4.ordinal()];
                                    }
                                    if (i16 == 1) {
                                        l52.y yVar19 = fVar2.f48588b;
                                        this.f24922f = b0Var;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 8;
                                        objY = yVar19.Y(this);
                                        if (objY != aVar) {
                                            v2Var = (v2) objY;
                                            if (v2Var instanceof v2.b) {
                                                list2 = (List) ((v2.b) v2Var).f47386a;
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String str16 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                com.garmin.android.apps.connectmobile.i2.a aVar11114 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                                com.garmin.android.apps.connectmobile.a2 a2Var15 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                aVar11114.getClass();
                                                com.garmin.android.apps.connectmobile.i2.a.f(a2Var15, "WorkoutDetailsViewModel", str16);
                                                list2 = null;
                                            }
                                            this.f24922f = null;
                                            this.f24917a = workoutDetailsDTO2;
                                            this.f24918b = kVarR4;
                                            this.f24919c = list2;
                                            this.f24920d = i15;
                                            this.f24921e = 9;
                                            objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                            if (objA5 == aVar) {
                                                PowerZonesDTO powerZonesDTO119 = (PowerZonesDTO) objA5;
                                                fVar2.f48605r = workoutDetailsDTO2;
                                                fVar2.f48608w = list2;
                                                x52.g.a aVar11115 = x52.g.f189104d;
                                                Resources resourcesQ11115 = fVar2.Q4();
                                                resourcesQ11115.getClass();
                                                aVar11115.getClass();
                                                x52.g.a.b(resourcesQ11115, kVarR4, powerZonesDTO119);
                                                fVar2.f48610y = powerZonesDTO119;
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                if (!fVar2.Y4()) {
                                                    workoutDetailsDTO4 = fVar2.f48605r;
                                                    if (workoutDetailsDTO4 != null) {
                                                        j14 = workoutDetailsDTO4.Y;
                                                    } else {
                                                        j14 = -1;
                                                    }
                                                    fVar2.C = j14;
                                                }
                                                fVar2.E = false;
                                                this.f24922f = null;
                                                this.f24917a = null;
                                                this.f24918b = null;
                                                this.f24919c = null;
                                                this.f24920d = i15;
                                                this.f24921e = 10;
                                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else if (i16 == 2) {
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24920d = i15;
                                        this.f24921e = 11;
                                        objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA4 != aVar) {
                                            kVar = kVarR4;
                                            PowerZonesDTO powerZonesDTO1110 = (PowerZonesDTO) objA4;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            x52.g.a aVar11116 = x52.g.f189104d;
                                            Resources resourcesQ11116 = fVar2.Q4();
                                            resourcesQ11116.getClass();
                                            aVar11116.getClass();
                                            x52.g.a.b(resourcesQ11116, kVar, powerZonesDTO1110);
                                            fVar2.f48610y = powerZonesDTO1110;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO5 = fVar2.f48605r;
                                                if (workoutDetailsDTO5 != null) {
                                                    j15 = workoutDetailsDTO5.Y;
                                                } else {
                                                    j15 = -1;
                                                }
                                                fVar2.C = j15;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 12;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (i16 != 3) {
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            fVar2.f48602o = new o13.p<>(bool, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO3 = fVar2.f48605r;
                                                if (workoutDetailsDTO3 != null) {
                                                    j8 = workoutDetailsDTO3.Y;
                                                } else {
                                                    j8 = -1;
                                                }
                                                fVar2.C = j8;
                                            }
                                            fVar2.E = false;
                                            fVar2.f48603p = list;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24920d = i15;
                                            this.f24921e = 15;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = fVar2;
                                        this.f24920d = i15;
                                        this.f24921e = 13;
                                        objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                        if (objD4 != aVar) {
                                            fVar = fVar2;
                                            fVar.f48602o = (o13.p) objD4;
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO6 = fVar2.f48605r;
                                                if (workoutDetailsDTO6 != null) {
                                                    j16 = workoutDetailsDTO6.Y;
                                                } else {
                                                    j16 = -1;
                                                }
                                                fVar2.C = j16;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 14;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        return aVar;
                    case 5:
                        int i36 = this.f24920d;
                        o13.r.b(obj);
                        i14 = i36;
                        objAwait2 = obj;
                        workoutDetailsDTO = (WorkoutDetailsDTO) objAwait2;
                        int i116 = i14;
                        workoutDetailsDTO2 = workoutDetailsDTO;
                        i15 = i116;
                        if (workoutDetailsDTO2.H()) {
                            int i21113 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                            Resources resourcesQ11117 = fVar2.Q4();
                            resourcesQ11117.getClass();
                            strA = i62.n.a(resourcesQ11117);
                            this.f24922f = b0Var;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24920d = i15;
                            this.f24921e = 6;
                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                if (!workoutDetailsDTO2.I()) {
                                }
                                if (i15 == 0) {
                                }
                                list = null;
                                int i21114 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                bool = Boolean.FALSE;
                                kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                if (kVarR4 == null) {
                                    i16 = -1;
                                } else {
                                    i16 = C0359a.f24927a[kVarR4.ordinal()];
                                }
                                if (i16 == 1) {
                                    l52.y yVar110 = fVar2.f48588b;
                                    this.f24922f = b0Var;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 8;
                                    objY = yVar110.Y(this);
                                    if (objY != aVar) {
                                        v2Var = (v2) objY;
                                        if (v2Var instanceof v2.b) {
                                            list2 = (List) ((v2.b) v2Var).f47386a;
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str17 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                            com.garmin.android.apps.connectmobile.i2.a aVar11117 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                            com.garmin.android.apps.connectmobile.a2 a2Var16 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                            aVar11117.getClass();
                                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var16, "WorkoutDetailsViewModel", str17);
                                            list2 = null;
                                        }
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24919c = list2;
                                        this.f24920d = i15;
                                        this.f24921e = 9;
                                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA5 == aVar) {
                                            PowerZonesDTO powerZonesDTO1111 = (PowerZonesDTO) objA5;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = list2;
                                            x52.g.a aVar11118 = x52.g.f189104d;
                                            Resources resourcesQ11118 = fVar2.Q4();
                                            resourcesQ11118.getClass();
                                            aVar11118.getClass();
                                            x52.g.a.b(resourcesQ11118, kVarR4, powerZonesDTO1111);
                                            fVar2.f48610y = powerZonesDTO1111;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO4 = fVar2.f48605r;
                                                if (workoutDetailsDTO4 != null) {
                                                    j14 = workoutDetailsDTO4.Y;
                                                } else {
                                                    j14 = -1;
                                                }
                                                fVar2.C = j14;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 10;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else if (i16 == 2) {
                                    this.f24922f = null;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 11;
                                    objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                    if (objA4 != aVar) {
                                        kVar = kVarR4;
                                        PowerZonesDTO powerZonesDTO1112 = (PowerZonesDTO) objA4;
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        x52.g.a aVar11119 = x52.g.f189104d;
                                        Resources resourcesQ11119 = fVar2.Q4();
                                        resourcesQ11119.getClass();
                                        aVar11119.getClass();
                                        x52.g.a.b(resourcesQ11119, kVar, powerZonesDTO1112);
                                        fVar2.f48610y = powerZonesDTO1112;
                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO5 = fVar2.f48605r;
                                            if (workoutDetailsDTO5 != null) {
                                                j15 = workoutDetailsDTO5.Y;
                                            } else {
                                                j15 = -1;
                                            }
                                            fVar2.C = j15;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 12;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i16 != 3) {
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        fVar2.f48602o = new o13.p<>(bool, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO3 = fVar2.f48605r;
                                            if (workoutDetailsDTO3 != null) {
                                                j8 = workoutDetailsDTO3.Y;
                                            } else {
                                                j8 = -1;
                                            }
                                            fVar2.C = j8;
                                        }
                                        fVar2.E = false;
                                        fVar2.f48603p = list;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24920d = i15;
                                        this.f24921e = 15;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fVar2.f48605r = workoutDetailsDTO2;
                                    fVar2.f48608w = null;
                                    fVar2.f48610y = null;
                                    this.f24922f = null;
                                    this.f24917a = null;
                                    this.f24918b = null;
                                    this.f24919c = fVar2;
                                    this.f24920d = i15;
                                    this.f24921e = 13;
                                    objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                    if (objD4 != aVar) {
                                        fVar = fVar2;
                                        fVar.f48602o = (o13.p) objD4;
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO6 = fVar2.f48605r;
                                            if (workoutDetailsDTO6 != null) {
                                                j16 = workoutDetailsDTO6.Y;
                                            } else {
                                                j16 = -1;
                                            }
                                            fVar2.C = j16;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 14;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                break;
                            }
                        } else {
                            int i21115 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                            Resources resourcesQ111110 = fVar2.Q4();
                            resourcesQ111110.getClass();
                            strA = i62.n.a(resourcesQ111110);
                            this.f24922f = b0Var;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24920d = i15;
                            this.f24921e = 6;
                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(fVar2, strA, workoutDetailsDTO2, this) != aVar) {
                                if (!workoutDetailsDTO2.I()) {
                                }
                                if (i15 == 0) {
                                }
                                list = null;
                                int i21116 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                                bool = Boolean.FALSE;
                                kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                                if (kVarR4 == null) {
                                    i16 = -1;
                                } else {
                                    i16 = C0359a.f24927a[kVarR4.ordinal()];
                                }
                                if (i16 == 1) {
                                    l52.y yVar111 = fVar2.f48588b;
                                    this.f24922f = b0Var;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 8;
                                    objY = yVar111.Y(this);
                                    if (objY != aVar) {
                                        v2Var = (v2) objY;
                                        if (v2Var instanceof v2.b) {
                                            list2 = (List) ((v2.b) v2Var).f47386a;
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            String str18 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                            com.garmin.android.apps.connectmobile.i2.a aVar111110 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                            com.garmin.android.apps.connectmobile.a2 a2Var17 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                            aVar111110.getClass();
                                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var17, "WorkoutDetailsViewModel", str18);
                                            list2 = null;
                                        }
                                        this.f24922f = null;
                                        this.f24917a = workoutDetailsDTO2;
                                        this.f24918b = kVarR4;
                                        this.f24919c = list2;
                                        this.f24920d = i15;
                                        this.f24921e = 9;
                                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                        if (objA5 == aVar) {
                                            PowerZonesDTO powerZonesDTO1113 = (PowerZonesDTO) objA5;
                                            fVar2.f48605r = workoutDetailsDTO2;
                                            fVar2.f48608w = list2;
                                            x52.g.a aVar111111 = x52.g.f189104d;
                                            Resources resourcesQ111111 = fVar2.Q4();
                                            resourcesQ111111.getClass();
                                            aVar111111.getClass();
                                            x52.g.a.b(resourcesQ111111, kVarR4, powerZonesDTO1113);
                                            fVar2.f48610y = powerZonesDTO1113;
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            if (!fVar2.Y4()) {
                                                workoutDetailsDTO4 = fVar2.f48605r;
                                                if (workoutDetailsDTO4 != null) {
                                                    j14 = workoutDetailsDTO4.Y;
                                                } else {
                                                    j14 = -1;
                                                }
                                                fVar2.C = j14;
                                            }
                                            fVar2.E = false;
                                            this.f24922f = null;
                                            this.f24917a = null;
                                            this.f24918b = null;
                                            this.f24919c = null;
                                            this.f24920d = i15;
                                            this.f24921e = 10;
                                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else if (i16 == 2) {
                                    this.f24922f = null;
                                    this.f24917a = workoutDetailsDTO2;
                                    this.f24918b = kVarR4;
                                    this.f24920d = i15;
                                    this.f24921e = 11;
                                    objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                    if (objA4 != aVar) {
                                        kVar = kVarR4;
                                        PowerZonesDTO powerZonesDTO1114 = (PowerZonesDTO) objA4;
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        x52.g.a aVar111112 = x52.g.f189104d;
                                        Resources resourcesQ111112 = fVar2.Q4();
                                        resourcesQ111112.getClass();
                                        aVar111112.getClass();
                                        x52.g.a.b(resourcesQ111112, kVar, powerZonesDTO1114);
                                        fVar2.f48610y = powerZonesDTO1114;
                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO5 = fVar2.f48605r;
                                            if (workoutDetailsDTO5 != null) {
                                                j15 = workoutDetailsDTO5.Y;
                                            } else {
                                                j15 = -1;
                                            }
                                            fVar2.C = j15;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 12;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (i16 != 3) {
                                        fVar2.f48605r = workoutDetailsDTO2;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        fVar2.f48602o = new o13.p<>(bool, null);
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO3 = fVar2.f48605r;
                                            if (workoutDetailsDTO3 != null) {
                                                j8 = workoutDetailsDTO3.Y;
                                            } else {
                                                j8 = -1;
                                            }
                                            fVar2.C = j8;
                                        }
                                        fVar2.E = false;
                                        fVar2.f48603p = list;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24920d = i15;
                                        this.f24921e = 15;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fVar2.f48605r = workoutDetailsDTO2;
                                    fVar2.f48608w = null;
                                    fVar2.f48610y = null;
                                    this.f24922f = null;
                                    this.f24917a = null;
                                    this.f24918b = null;
                                    this.f24919c = fVar2;
                                    this.f24920d = i15;
                                    this.f24921e = 13;
                                    objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                                    if (objD4 != aVar) {
                                        fVar = fVar2;
                                        fVar.f48602o = (o13.p) objD4;
                                        if (!fVar2.Y4()) {
                                            workoutDetailsDTO6 = fVar2.f48605r;
                                            if (workoutDetailsDTO6 != null) {
                                                j16 = workoutDetailsDTO6.Y;
                                            } else {
                                                j16 = -1;
                                            }
                                            fVar2.C = j16;
                                        }
                                        fVar2.E = false;
                                        this.f24922f = null;
                                        this.f24917a = null;
                                        this.f24918b = null;
                                        this.f24919c = null;
                                        this.f24920d = i15;
                                        this.f24921e = 14;
                                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                break;
                            }
                        }
                        return aVar;
                    case 6:
                        i15 = this.f24920d;
                        workoutDetailsDTO2 = this.f24917a;
                        o13.r.b(obj);
                        if (!workoutDetailsDTO2.I()) {
                            break;
                        }
                        if (i15 == 0) {
                            break;
                        }
                        list = null;
                        int i21117 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                        bool = Boolean.FALSE;
                        kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                        if (kVarR4 == null) {
                            i16 = -1;
                        } else {
                            i16 = C0359a.f24927a[kVarR4.ordinal()];
                        }
                        if (i16 == 1) {
                            l52.y yVar112 = fVar2.f48588b;
                            this.f24922f = b0Var;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24918b = kVarR4;
                            this.f24920d = i15;
                            this.f24921e = 8;
                            objY = yVar112.Y(this);
                            if (objY != aVar) {
                                v2Var = (v2) objY;
                                if (v2Var instanceof v2.b) {
                                    list2 = (List) ((v2.b) v2Var).f47386a;
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str19 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                    com.garmin.android.apps.connectmobile.i2.a aVar111113 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var18 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar111113.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var18, "WorkoutDetailsViewModel", str19);
                                    list2 = null;
                                }
                                this.f24922f = null;
                                this.f24917a = workoutDetailsDTO2;
                                this.f24918b = kVarR4;
                                this.f24919c = list2;
                                this.f24920d = i15;
                                this.f24921e = 9;
                                objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                if (objA5 == aVar) {
                                    PowerZonesDTO powerZonesDTO1115 = (PowerZonesDTO) objA5;
                                    fVar2.f48605r = workoutDetailsDTO2;
                                    fVar2.f48608w = list2;
                                    x52.g.a aVar111114 = x52.g.f189104d;
                                    Resources resourcesQ111113 = fVar2.Q4();
                                    resourcesQ111113.getClass();
                                    aVar111114.getClass();
                                    x52.g.a.b(resourcesQ111113, kVarR4, powerZonesDTO1115);
                                    fVar2.f48610y = powerZonesDTO1115;
                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                    if (!fVar2.Y4()) {
                                        workoutDetailsDTO4 = fVar2.f48605r;
                                        if (workoutDetailsDTO4 != null) {
                                            j14 = workoutDetailsDTO4.Y;
                                        } else {
                                            j14 = -1;
                                        }
                                        fVar2.C = j14;
                                    }
                                    fVar2.E = false;
                                    this.f24922f = null;
                                    this.f24917a = null;
                                    this.f24918b = null;
                                    this.f24919c = null;
                                    this.f24920d = i15;
                                    this.f24921e = 10;
                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else if (i16 == 2) {
                            this.f24922f = null;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24918b = kVarR4;
                            this.f24920d = i15;
                            this.f24921e = 11;
                            objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                            if (objA4 != aVar) {
                                kVar = kVarR4;
                                PowerZonesDTO powerZonesDTO1116 = (PowerZonesDTO) objA4;
                                fVar2.f48605r = workoutDetailsDTO2;
                                fVar2.f48608w = null;
                                x52.g.a aVar111115 = x52.g.f189104d;
                                Resources resourcesQ111114 = fVar2.Q4();
                                resourcesQ111114.getClass();
                                aVar111115.getClass();
                                x52.g.a.b(resourcesQ111114, kVar, powerZonesDTO1116);
                                fVar2.f48610y = powerZonesDTO1116;
                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                if (!fVar2.Y4()) {
                                    workoutDetailsDTO5 = fVar2.f48605r;
                                    if (workoutDetailsDTO5 != null) {
                                        j15 = workoutDetailsDTO5.Y;
                                    } else {
                                        j15 = -1;
                                    }
                                    fVar2.C = j15;
                                }
                                fVar2.E = false;
                                this.f24922f = null;
                                this.f24917a = null;
                                this.f24918b = null;
                                this.f24919c = null;
                                this.f24920d = i15;
                                this.f24921e = 12;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i16 != 3) {
                                fVar2.f48605r = workoutDetailsDTO2;
                                fVar2.f48608w = null;
                                fVar2.f48610y = null;
                                fVar2.f48602o = new o13.p<>(bool, null);
                                if (!fVar2.Y4()) {
                                    workoutDetailsDTO3 = fVar2.f48605r;
                                    if (workoutDetailsDTO3 != null) {
                                        j8 = workoutDetailsDTO3.Y;
                                    } else {
                                        j8 = -1;
                                    }
                                    fVar2.C = j8;
                                }
                                fVar2.E = false;
                                fVar2.f48603p = list;
                                this.f24922f = null;
                                this.f24917a = null;
                                this.f24918b = null;
                                this.f24920d = i15;
                                this.f24921e = 15;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                            fVar2.f48605r = workoutDetailsDTO2;
                            fVar2.f48608w = null;
                            fVar2.f48610y = null;
                            this.f24922f = null;
                            this.f24917a = null;
                            this.f24918b = null;
                            this.f24919c = fVar2;
                            this.f24920d = i15;
                            this.f24921e = 13;
                            objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                            if (objD4 != aVar) {
                                fVar = fVar2;
                                fVar.f48602o = (o13.p) objD4;
                                if (!fVar2.Y4()) {
                                    workoutDetailsDTO6 = fVar2.f48605r;
                                    if (workoutDetailsDTO6 != null) {
                                        j16 = workoutDetailsDTO6.Y;
                                    } else {
                                        j16 = -1;
                                    }
                                    fVar2.C = j16;
                                }
                                fVar2.E = false;
                                this.f24922f = null;
                                this.f24917a = null;
                                this.f24918b = null;
                                this.f24919c = null;
                                this.f24920d = i15;
                                this.f24921e = 14;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar;
                    case 7:
                        i15 = this.f24920d;
                        workoutDetailsDTO2 = this.f24917a;
                        o13.r.b(obj);
                        objC4 = obj;
                        h0Var = (ww1.h0) objC4;
                        if (h0Var == null) {
                            list = null;
                        } else {
                            uVar2 = workoutDetailsDTO2.M0;
                            if (uVar2 == null) {
                                i17 = -1;
                            } else {
                                i17 = ww1.h0.d.f187793a[uVar2.ordinal()];
                            }
                            if (i17 != 1) {
                                list = h0Var.f187787a;
                            } else if (i17 != 2) {
                                list = h0Var.f187788b;
                            } else if (i17 != 3) {
                                list = h0Var.f187789c;
                            } else if (i17 != 4) {
                                list = h0Var.f187790d;
                            } else if (i17 != 5) {
                                list = null;
                            } else {
                                list = h0Var.f187791e;
                            }
                        }
                        int i21118 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                        bool = Boolean.FALSE;
                        kVarR4 = fVar2.R4(workoutDetailsDTO2, bool);
                        if (kVarR4 == null) {
                            i16 = -1;
                        } else {
                            i16 = C0359a.f24927a[kVarR4.ordinal()];
                        }
                        if (i16 == 1) {
                            l52.y yVar113 = fVar2.f48588b;
                            this.f24922f = b0Var;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24918b = kVarR4;
                            this.f24920d = i15;
                            this.f24921e = 8;
                            objY = yVar113.Y(this);
                            if (objY != aVar) {
                                v2Var = (v2) objY;
                                if (v2Var instanceof v2.b) {
                                    list2 = (List) ((v2.b) v2Var).f47386a;
                                } else {
                                    if (v2Var instanceof v2.a) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str110 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                    com.garmin.android.apps.connectmobile.i2.a aVar111116 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    com.garmin.android.apps.connectmobile.a2 a2Var19 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                    aVar111116.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var19, "WorkoutDetailsViewModel", str110);
                                    list2 = null;
                                }
                                this.f24922f = null;
                                this.f24917a = workoutDetailsDTO2;
                                this.f24918b = kVarR4;
                                this.f24919c = list2;
                                this.f24920d = i15;
                                this.f24921e = 9;
                                objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                                if (objA5 == aVar) {
                                    PowerZonesDTO powerZonesDTO1117 = (PowerZonesDTO) objA5;
                                    fVar2.f48605r = workoutDetailsDTO2;
                                    fVar2.f48608w = list2;
                                    x52.g.a aVar111117 = x52.g.f189104d;
                                    Resources resourcesQ111115 = fVar2.Q4();
                                    resourcesQ111115.getClass();
                                    aVar111117.getClass();
                                    x52.g.a.b(resourcesQ111115, kVarR4, powerZonesDTO1117);
                                    fVar2.f48610y = powerZonesDTO1117;
                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                    if (!fVar2.Y4()) {
                                        workoutDetailsDTO4 = fVar2.f48605r;
                                        if (workoutDetailsDTO4 != null) {
                                            j14 = workoutDetailsDTO4.Y;
                                        } else {
                                            j14 = -1;
                                        }
                                        fVar2.C = j14;
                                    }
                                    fVar2.E = false;
                                    this.f24922f = null;
                                    this.f24917a = null;
                                    this.f24918b = null;
                                    this.f24919c = null;
                                    this.f24920d = i15;
                                    this.f24921e = 10;
                                    if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else if (i16 == 2) {
                            this.f24922f = null;
                            this.f24917a = workoutDetailsDTO2;
                            this.f24918b = kVarR4;
                            this.f24920d = i15;
                            this.f24921e = 11;
                            objA4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                            if (objA4 != aVar) {
                                kVar = kVarR4;
                                PowerZonesDTO powerZonesDTO1118 = (PowerZonesDTO) objA4;
                                fVar2.f48605r = workoutDetailsDTO2;
                                fVar2.f48608w = null;
                                x52.g.a aVar111118 = x52.g.f189104d;
                                Resources resourcesQ111116 = fVar2.Q4();
                                resourcesQ111116.getClass();
                                aVar111118.getClass();
                                x52.g.a.b(resourcesQ111116, kVar, powerZonesDTO1118);
                                fVar2.f48610y = powerZonesDTO1118;
                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                if (!fVar2.Y4()) {
                                    workoutDetailsDTO5 = fVar2.f48605r;
                                    if (workoutDetailsDTO5 != null) {
                                        j15 = workoutDetailsDTO5.Y;
                                    } else {
                                        j15 = -1;
                                    }
                                    fVar2.C = j15;
                                }
                                fVar2.E = false;
                                this.f24922f = null;
                                this.f24917a = null;
                                this.f24918b = null;
                                this.f24919c = null;
                                this.f24920d = i15;
                                this.f24921e = 12;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i16 != 3) {
                                fVar2.f48605r = workoutDetailsDTO2;
                                fVar2.f48608w = null;
                                fVar2.f48610y = null;
                                fVar2.f48602o = new o13.p<>(bool, null);
                                if (!fVar2.Y4()) {
                                    workoutDetailsDTO3 = fVar2.f48605r;
                                    if (workoutDetailsDTO3 != null) {
                                        j8 = workoutDetailsDTO3.Y;
                                    } else {
                                        j8 = -1;
                                    }
                                    fVar2.C = j8;
                                }
                                fVar2.E = false;
                                fVar2.f48603p = list;
                                this.f24922f = null;
                                this.f24917a = null;
                                this.f24918b = null;
                                this.f24920d = i15;
                                this.f24921e = 15;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                            fVar2.f48605r = workoutDetailsDTO2;
                            fVar2.f48608w = null;
                            fVar2.f48610y = null;
                            this.f24922f = null;
                            this.f24917a = null;
                            this.f24918b = null;
                            this.f24919c = fVar2;
                            this.f24920d = i15;
                            this.f24921e = 13;
                            objD4 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(fVar2, this);
                            if (objD4 != aVar) {
                                fVar = fVar2;
                                fVar.f48602o = (o13.p) objD4;
                                if (!fVar2.Y4()) {
                                    workoutDetailsDTO6 = fVar2.f48605r;
                                    if (workoutDetailsDTO6 != null) {
                                        j16 = workoutDetailsDTO6.Y;
                                    } else {
                                        j16 = -1;
                                    }
                                    fVar2.C = j16;
                                }
                                fVar2.E = false;
                                this.f24922f = null;
                                this.f24917a = null;
                                this.f24918b = null;
                                this.f24919c = null;
                                this.f24920d = i15;
                                this.f24921e = 14;
                                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar;
                    case 8:
                        int i37 = this.f24920d;
                        m52.k kVar2 = this.f24918b;
                        workoutDetailsDTO2 = this.f24917a;
                        o13.r.b(obj);
                        kVarR4 = kVar2;
                        i15 = i37;
                        objY = obj;
                        v2Var = (v2) objY;
                        if (v2Var instanceof v2.b) {
                            list2 = (List) ((v2.b) v2Var).f47386a;
                        } else {
                            if (v2Var instanceof v2.a) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str111 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                            com.garmin.android.apps.connectmobile.i2.a aVar111119 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var110 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar111119.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.f(a2Var110, "WorkoutDetailsViewModel", str111);
                            list2 = null;
                        }
                        this.f24922f = null;
                        this.f24917a = workoutDetailsDTO2;
                        this.f24918b = kVarR4;
                        this.f24919c = list2;
                        this.f24920d = i15;
                        this.f24921e = 9;
                        objA5 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.A4(fVar2, this);
                        if (objA5 == aVar) {
                            PowerZonesDTO powerZonesDTO1119 = (PowerZonesDTO) objA5;
                            fVar2.f48605r = workoutDetailsDTO2;
                            fVar2.f48608w = list2;
                            x52.g.a aVar1111110 = x52.g.f189104d;
                            Resources resourcesQ111117 = fVar2.Q4();
                            resourcesQ111117.getClass();
                            aVar1111110.getClass();
                            x52.g.a.b(resourcesQ111117, kVarR4, powerZonesDTO1119);
                            fVar2.f48610y = powerZonesDTO1119;
                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                            if (!fVar2.Y4()) {
                                workoutDetailsDTO4 = fVar2.f48605r;
                                if (workoutDetailsDTO4 != null) {
                                    j14 = workoutDetailsDTO4.Y;
                                } else {
                                    j14 = -1;
                                }
                                fVar2.C = j14;
                            }
                            fVar2.E = false;
                            this.f24922f = null;
                            this.f24917a = null;
                            this.f24918b = null;
                            this.f24919c = null;
                            this.f24920d = i15;
                            this.f24921e = 10;
                            if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                            }
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    case 9:
                        int i38 = this.f24920d;
                        list2 = (List) this.f24919c;
                        m52.k kVar3 = this.f24918b;
                        workoutDetailsDTO2 = this.f24917a;
                        o13.r.b(obj);
                        kVarR4 = kVar3;
                        i15 = i38;
                        objA5 = obj;
                        PowerZonesDTO powerZonesDTO11110 = (PowerZonesDTO) objA5;
                        fVar2.f48605r = workoutDetailsDTO2;
                        fVar2.f48608w = list2;
                        x52.g.a aVar1111111 = x52.g.f189104d;
                        Resources resourcesQ111118 = fVar2.Q4();
                        resourcesQ111118.getClass();
                        aVar1111111.getClass();
                        x52.g.a.b(resourcesQ111118, kVarR4, powerZonesDTO11110);
                        fVar2.f48610y = powerZonesDTO11110;
                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                        if (!fVar2.Y4()) {
                            workoutDetailsDTO4 = fVar2.f48605r;
                            if (workoutDetailsDTO4 != null) {
                                j14 = workoutDetailsDTO4.Y;
                            } else {
                                j14 = -1;
                            }
                            fVar2.C = j14;
                        }
                        fVar2.E = false;
                        this.f24922f = null;
                        this.f24917a = null;
                        this.f24918b = null;
                        this.f24919c = null;
                        this.f24920d = i15;
                        this.f24921e = 10;
                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    case 10:
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    case 11:
                        int i39 = this.f24920d;
                        kVar = this.f24918b;
                        WorkoutDetailsDTO workoutDetailsDTO7 = this.f24917a;
                        o13.r.b(obj);
                        workoutDetailsDTO2 = workoutDetailsDTO7;
                        i15 = i39;
                        objA4 = obj;
                        PowerZonesDTO powerZonesDTO11111 = (PowerZonesDTO) objA4;
                        fVar2.f48605r = workoutDetailsDTO2;
                        fVar2.f48608w = null;
                        x52.g.a aVar1111112 = x52.g.f189104d;
                        Resources resourcesQ111119 = fVar2.Q4();
                        resourcesQ111119.getClass();
                        aVar1111112.getClass();
                        x52.g.a.b(resourcesQ111119, kVar, powerZonesDTO11111);
                        fVar2.f48610y = powerZonesDTO11111;
                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                        if (!fVar2.Y4()) {
                            workoutDetailsDTO5 = fVar2.f48605r;
                            if (workoutDetailsDTO5 != null) {
                                j15 = workoutDetailsDTO5.Y;
                            } else {
                                j15 = -1;
                            }
                            fVar2.C = j15;
                        }
                        fVar2.E = false;
                        this.f24922f = null;
                        this.f24917a = null;
                        this.f24918b = null;
                        this.f24919c = null;
                        this.f24920d = i15;
                        this.f24921e = 12;
                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    case 12:
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    case 13:
                        int i44 = this.f24920d;
                        fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) this.f24919c;
                        o13.r.b(obj);
                        i15 = i44;
                        objD4 = obj;
                        fVar.f48602o = (o13.p) objD4;
                        if (!fVar2.Y4()) {
                            workoutDetailsDTO6 = fVar2.f48605r;
                            if (workoutDetailsDTO6 != null) {
                                j16 = workoutDetailsDTO6.Y;
                            } else {
                                j16 = -1;
                            }
                            fVar2.C = j16;
                        }
                        fVar2.E = false;
                        this.f24922f = null;
                        this.f24917a = null;
                        this.f24918b = null;
                        this.f24919c = null;
                        this.f24920d = i15;
                        this.f24921e = 14;
                        if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(fVar2, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    case 14:
                    case 15:
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    case 16:
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th3) {
                r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar2 = fVar2.Y;
                v52.c.a aVar20 = new v52.c.a(th3);
                this.f24922f = null;
                this.f24917a = null;
                this.f24918b = null;
                this.f24919c = null;
                this.f24921e = 16;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, String str, Long l14, Long l15, t13.d<? super v1> dVar) {
        super(2, dVar);
        this.f24913b = fVar;
        this.f24914c = str;
        this.f24915d = l14;
        this.f24916e = l15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v1(this.f24913b, this.f24914c, this.f24915d, this.f24916e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24912a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f24913b, this.f24914c, this.f24915d, this.f24916e, null);
            this.f24912a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
