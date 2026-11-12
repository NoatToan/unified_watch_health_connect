package b90;

import android.content.Context;
import c90.c;
import c90.d;
import c90.e;
import c90.f;
import c90.g;
import c90.h;
import c90.i;
import c90.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lb90/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lc90/g;", "getLocalDeviceImageUseCase", "Lc90/c;", "getDevicePairConfigUseCase", "Lc90/d;", "getDevicePairTutorialConfigUseCase", "Lc90/b;", "getDeviceGestureTutorialConfigUseCase", "Lc90/e;", "getDeviceProductTutorialConfigUseCase", "Lc90/i;", "getSyncConfigUseCase", "Lc90/j;", "getWifiDuringSetupSupportUseCase", "Lc90/h;", "getPermissionsDuringSetupSupport", "Lc90/f;", "getFavoritesActivitiesDuringSetupSupport", "Ln90/a;", "getLaunchpadItemsUseCase", "Lh90/f;", "getCustomizationScreensUseCase", "Ls90/d;", "getUserProfileScreensUseCase", "Lc90/a;", "allowEditUserSettingsUseCase", "<init>", "(Landroid/content/Context;Lc90/g;Lc90/c;Lc90/d;Lc90/b;Lc90/e;Lc90/i;Lc90/j;Lc90/h;Lc90/f;Ln90/a;Lh90/f;Ls90/d;Lc90/a;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f16942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c90.b f16943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f16944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f16945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f16946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f16947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f16948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n90.a f16949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h90.f f16950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s90.d f16951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c90.a f16952n;

    public /* synthetic */ a(Context context, g gVar, c cVar, d dVar, c90.b bVar, e eVar, i iVar, j jVar, h hVar, f fVar, n90.a aVar, h90.f fVar2, s90.d dVar2, c90.a aVar2, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i14 & 2) != 0 ? new g() : gVar, (i14 & 4) != 0 ? new c() : cVar, (i14 & 8) != 0 ? new d() : dVar, (i14 & 16) != 0 ? new c90.b() : bVar, (i14 & 32) != 0 ? new e() : eVar, (i14 & 64) != 0 ? new i() : iVar, (i14 & 128) != 0 ? new j() : jVar, (i14 & 256) != 0 ? new h() : hVar, (i14 & 512) != 0 ? new f() : fVar, (i14 & 1024) != 0 ? new n90.a() : aVar, (i14 & 2048) != 0 ? new h90.f() : fVar2, (i14 & 4096) != 0 ? new s90.d() : dVar2, (i14 & 8192) != 0 ? new c90.a() : aVar2);
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:185:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:189:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:192:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:193:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:195:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:196:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:197:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:200:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0b29  */
    /* JADX WARN: Code duplicated, block: B:205:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:209:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:213:0x0b4c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:219:0x0b5c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:224:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:228:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:232:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:236:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:238:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:239:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:241:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:242:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:246:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:247:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:248:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:261:0x0c47  */
    /* JADX WARN: Code duplicated, block: B:275:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0c83  */
    /* JADX WARN: Code duplicated, block: B:295:0x0c92  */
    /* JADX WARN: Code duplicated, block: B:299:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:302:0x0ca8  */
    /* JADX WARN: Code duplicated, block: B:305:0x0cac  */
    /* JADX WARN: Code duplicated, block: B:308:0x0cba  */
    /* JADX WARN: Code duplicated, block: B:311:0x0cc0  */
    public final d90.d a(String str, String str2, String str3) {
        int iValueOf;
        Integer num;
        d90.i iVar;
        d90.i iVar2;
        boolean z14;
        d90.a aVar;
        d90.a aVar2;
        boolean z15;
        d90.a aVar3;
        d90.a aVar4;
        boolean z16;
        d90.a aVar5;
        List listC0;
        List listC;
        d90.f fVar;
        d90.f.e eVar;
        d90.f fVar2;
        int i14;
        d90.h hVar;
        int i15;
        d90.h hVar2;
        int i16;
        List listC2;
        int i17;
        boolean z17;
        int i18;
        d90.g gVar;
        int i19;
        ArrayList arrayList;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        List list;
        ArrayList arrayList2;
        int[] iArr;
        ArrayList arrayList3;
        List listC3;
        str2.getClass();
        str3.getClass();
        yl2.b bVar = (yl2.b) yl2.b.B6.get(str);
        this.f16940b.getClass();
        switch (bVar == null ? -1 : g.a.f26047a[bVar.ordinal()]) {
            case 1:
                iValueOf = 2131232093;
                num = iValueOf;
                break;
            case 2:
                iValueOf = 2131232101;
                num = iValueOf;
                break;
            case 3:
                iValueOf = 2131232137;
                num = iValueOf;
                break;
            case 4:
                iValueOf = 2131232092;
                num = iValueOf;
                break;
            case 5:
                iValueOf = 2131232087;
                num = iValueOf;
                break;
            case 6:
                iValueOf = 2131233593;
                num = iValueOf;
                break;
            case 7:
                iValueOf = 2131233151;
                num = iValueOf;
                break;
            case 8:
                iValueOf = 2131233278;
                num = iValueOf;
                break;
            case 9:
                iValueOf = 2131231230;
                num = iValueOf;
                break;
            case 10:
                iValueOf = 2131233594;
                num = iValueOf;
                break;
            case 11:
                iValueOf = 2131233150;
                num = iValueOf;
                break;
            case 12:
                iValueOf = 2131231581;
                num = iValueOf;
                break;
            case 13:
                iValueOf = 2131231484;
                num = iValueOf;
                break;
            case 14:
                iValueOf = 2131233002;
                num = iValueOf;
                break;
            case 15:
                iValueOf = 2131233595;
                num = iValueOf;
                break;
            case 16:
                iValueOf = 2131232088;
                num = iValueOf;
                break;
            case 17:
            case 18:
                iValueOf = 2131232086;
                num = iValueOf;
                break;
            case 19:
                iValueOf = 2131232089;
                num = iValueOf;
                break;
            case 20:
                iValueOf = 2131232133;
                num = iValueOf;
                break;
            case 21:
                iValueOf = 2131232134;
                num = iValueOf;
                break;
            case 22:
                iValueOf = 2131232141;
                num = iValueOf;
                break;
            case 23:
                iValueOf = 2131232205;
                num = iValueOf;
                break;
            case 24:
                iValueOf = 2131232169;
                num = iValueOf;
                break;
            case 25:
                iValueOf = 2131232355;
                num = iValueOf;
                break;
            case 26:
                iValueOf = 2131232353;
                num = iValueOf;
                break;
            case 27:
                iValueOf = 2131231767;
                num = iValueOf;
                break;
            case 28:
                iValueOf = 2131231954;
                num = iValueOf;
                break;
            case 29:
            case 30:
                iValueOf = 2131231951;
                num = iValueOf;
                break;
            case 31:
                iValueOf = 2131231952;
                num = iValueOf;
                break;
            case 32:
                iValueOf = 2131231953;
                num = iValueOf;
                break;
            case 33:
            case 34:
                iValueOf = 2131231956;
                num = iValueOf;
                break;
            case 35:
                iValueOf = 2131231957;
                num = iValueOf;
                break;
            case 36:
                iValueOf = 2131231958;
                num = iValueOf;
                break;
            case 37:
                iValueOf = 2131231896;
                num = iValueOf;
                break;
            case 38:
                iValueOf = Integer.valueOf((u0.w(str3) || u0.w(str2)) ? 2131232017 : 2131231946);
                num = iValueOf;
                break;
            case 39:
                iValueOf = Integer.valueOf((u0.y(str3) || u0.y(str2)) ? 2131232052 : 2131231946);
                num = iValueOf;
                break;
            case 40:
                iValueOf = 2131231948;
                num = iValueOf;
                break;
            case 41:
                iValueOf = 2131231947;
                num = iValueOf;
                break;
            case 42:
                iValueOf = 2131231949;
                num = iValueOf;
                break;
            case 43:
                iValueOf = 2131231950;
                num = iValueOf;
                break;
            case 44:
                iValueOf = 2131231935;
                num = iValueOf;
                break;
            case 45:
                iValueOf = 2131231927;
                num = iValueOf;
                break;
            case 46:
                iValueOf = 2131231928;
                num = iValueOf;
                break;
            case 47:
                iValueOf = 2131231929;
                num = iValueOf;
                break;
            case 48:
                iValueOf = 2131231930;
                num = iValueOf;
                break;
            case 49:
                iValueOf = 2131231937;
                num = iValueOf;
                break;
            case 50:
                iValueOf = 2131231938;
                num = iValueOf;
                break;
            case 51:
                iValueOf = 2131231939;
                num = iValueOf;
                break;
            case 52:
                iValueOf = 2131232245;
                num = iValueOf;
                break;
            case 53:
                iValueOf = 2131232246;
                num = iValueOf;
                break;
            case 54:
                iValueOf = 2131231940;
                num = iValueOf;
                break;
            case 55:
            case 56:
                iValueOf = 2131231589;
                num = iValueOf;
                break;
            case 57:
                iValueOf = 2131231941;
                num = iValueOf;
                break;
            case 58:
                iValueOf = 2131231826;
                num = iValueOf;
                break;
            case 59:
                iValueOf = 2131231960;
                num = iValueOf;
                break;
            case 60:
                iValueOf = 2131232388;
                num = iValueOf;
                break;
            case 61:
                iValueOf = 2131232389;
                num = iValueOf;
                break;
            case 62:
                iValueOf = 2131232387;
                num = iValueOf;
                break;
            case 63:
                iValueOf = 2131232390;
                num = iValueOf;
                break;
            case 64:
                iValueOf = 2131232090;
                num = iValueOf;
                break;
            case 65:
                iValueOf = 2131232138;
                num = iValueOf;
                break;
            default:
                num = null;
                break;
        }
        this.f16942d.getClass();
        Context context = this.f16939a;
        context.getClass();
        switch (bVar == null ? -1 : d.a.f26044a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                d90.j jVar = d90.j.LEGACY;
                String string = context.getString(R.string.startup_tutorial_pair_device);
                string.getClass();
                iVar = new d90.i(jVar, string);
                iVar2 = iVar;
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 137:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
            case 173:
            case 174:
            case 175:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
            case 185:
            case 186:
            case 187:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
            case 190:
            case 191:
            case 192:
                d90.j jVar2 = d90.j.LOTTIE;
                String string2 = context.getString(R.string.startup_tutorial_pair_device);
                string2.getClass();
                iVar = new d90.i(jVar2, string2);
                iVar2 = iVar;
                break;
            case 193:
                d90.j jVar3 = d90.j.LOTTIE;
                String string3 = context.getString(R.string.startup_tutorial_pair_device_flashing_purple, str2);
                string3.getClass();
                iVar = new d90.i(jVar3, string3);
                iVar2 = iVar;
                break;
            case 194:
                iVar = new d90.i(d90.j.LOTTIE, new l22.a(context).getString(R.string.startup_tutorial_device_pairing_mode));
                iVar2 = iVar;
                break;
            case 195:
                iVar = new d90.i(d90.j.LOTTIE, new l22.a(context).getString(R.string.startup_tutorial_device_pairing_mode_1));
                iVar2 = iVar;
                break;
            default:
                iVar2 = null;
                break;
        }
        this.f16941c.getClass();
        d90.e eVar2 = new d90.e(context.getString(R.string.ready_to_connect_info), context.getString(R.string.device_pin_input_msg, context.getString(R.string.connect_it)), (String) null, 4, (p005kotlin.jvm.internal.j) null);
        d90.e eVar3 = new d90.e(context.getString(R.string.pairing_generic_instructions_1), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null);
        switch (bVar == null ? -1 : c.b.f26043a[bVar.ordinal()]) {
            case 1:
            case 2:
                z14 = true;
                aVar = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.ready_to_connect_info), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.b) null, eVar3, (d90.e) null, (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) null);
                aVar2 = aVar;
                break;
            case 3:
                z14 = true;
                aVar = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.msg_complete_setup_to_track_body_metrics), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.b) (false ? 1 : 0), eVar3, (d90.e) null, (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) null);
                aVar2 = aVar;
                break;
            case 4:
                z14 = true;
                String str4 = null;
                d90.e eVar4 = new d90.e(context.getString(R.string.ready_to_connect_info), (String) null, str4, 4, (p005kotlin.jvm.internal.j) null);
                String string4 = context.getString(R.string.msg_device_setup_how_to_pair, str2);
                string4.getClass();
                int i30 = 6;
                p005kotlin.jvm.internal.j jVar4 = null;
                String str5 = null;
                String str6 = null;
                aVar2 = new d90.a((Integer) 2131231802, true, false, false, eVar4, new d90.b(string4, str4, str5, d90.c.b.INSTANCE, i30, jVar4), new d90.e(context.getString(R.string.msg_device_setup_how_to_pair, str2), str5, str6, i30, jVar4), (d90.e) (false ? 1 : 0), new d90.e(context.getString(R.string.msg_setup_failed, str2), str6, (String) null, 6, (p005kotlin.jvm.internal.j) null), (String) (false ? 1 : 0), 652, (p005kotlin.jvm.internal.j) null);
                break;
            case 5:
                z15 = true;
                String string5 = context.getString(R.string.lbl_vs4_tut_0);
                string5.getClass();
                p005kotlin.jvm.internal.j jVar5 = null;
                String str7 = null;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, new d90.b(string5, context.getString(R.string.device_pin_input_msg, context.getString(R.string.lbl_start)), (String) null, new d90.c.C1246c(2131232102), 4, (p005kotlin.jvm.internal.j) null), new d90.e(context.getString(R.string.lbl_vs4_tut_0), (String) null, str7, 6, jVar5), (d90.e) null, (d90.e) (false ? 1 : 0), str7, 911, jVar5);
                z14 = z15;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                z15 = true;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, (d90.b) null, new d90.e(context.getString(R.string.startup_tutorial_turn_on), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.e) (false ? 1 : 0), (d90.e) (false ? 1 : 0), (String) null, 943, (p005kotlin.jvm.internal.j) null);
                z14 = z15;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                z15 = true;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, (d90.b) null, new d90.e(context.getString(R.string.startup_tutorial_press_crown), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.e) null, (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) (false ? 1 : 0));
                z14 = z15;
                break;
            case 46:
                z15 = true;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, (d90.b) null, new d90.e(context.getString(R.string.startup_tutorial_press_crown), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.e) null, (d90.e) null, "https://support.garmin.com/sas/grmn/?productId=869433&contentId=9CDD55lm3a4DcQaNL7yii9", 431, (p005kotlin.jvm.internal.j) (false ? 1 : 0));
                z14 = z15;
                break;
            case 47:
            case 48:
            case 49:
                z15 = true;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, (d90.b) null, new d90.e(context.getString(R.string.startup_tutorial_powering_on), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.e) (false ? 1 : 0), (d90.e) (false ? 1 : 0), (String) null, 943, (p005kotlin.jvm.internal.j) null);
                z14 = z15;
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                aVar = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.ready_to_connect_edge_info), context.getString(R.string.device_pin_input_msg, context.getString(R.string.connect_it)), (String) null, 4, (p005kotlin.jvm.internal.j) null), (d90.b) null, eVar3, (d90.e) null, (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) null);
                z14 = true;
                aVar2 = aVar;
                break;
            case 74:
                String str8 = null;
                d90.e eVar5 = new d90.e(context.getString(R.string.startup_generic_start_setup, str2), (String) null, str8, 6, (p005kotlin.jvm.internal.j) null);
                String string6 = context.getString(R.string.vector_pairing_instruction);
                string6.getClass();
                String str9 = null;
                z14 = true;
                aVar2 = new d90.a((Integer) null, false, true, false, eVar5, new d90.b(string6, str8, str9, (d90.c) (false ? 1 : 0), 14, (p005kotlin.jvm.internal.j) null), new d90.e(context.getString(R.string.vector_pairing_instruction), str9, (String) (false ? 1 : 0), 6, (p005kotlin.jvm.internal.j) (false ? 1 : 0)), (d90.e) (false ? 1 : 0), (d90.e) null, (String) null, 907, (p005kotlin.jvm.internal.j) null);
                break;
            case 75:
                String str10 = null;
                d90.e eVar6 = new d90.e(context.getString(R.string.startup_generic_start_setup, str2), (String) null, str10, 6, (p005kotlin.jvm.internal.j) null);
                String string7 = context.getString(R.string.pedal_pairing_instruction);
                string7.getClass();
                String str11 = null;
                aVar3 = new d90.a((Integer) null, false, true, true, eVar6, new d90.b(string7, str10, str11, (d90.c) (false ? 1 : 0), 14, (p005kotlin.jvm.internal.j) null), new d90.e(context.getString(R.string.pedal_pairing_instruction), str11, (String) (false ? 1 : 0), 6, (p005kotlin.jvm.internal.j) (false ? 1 : 0)), (d90.e) (false ? 1 : 0), (d90.e) null, (String) null, 899, (p005kotlin.jvm.internal.j) null);
                z14 = true;
                aVar2 = aVar3;
                break;
            case 76:
                d90.e eVar7 = new d90.e(context.getString(R.string.startup_generic_start_setup, str2), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null);
                String string8 = context.getString(R.string.rally_x10_bic_pairing_instruction);
                string8.getClass();
                aVar4 = new d90.a((Integer) null, false, false, true, eVar7, new d90.b(string8, context.getString(R.string.rally_x10_bic_pairing_instruction_charging_cable), (String) null, (d90.c) (false ? 1 : 0), 12, (p005kotlin.jvm.internal.j) null), new d90.e(context.getString(R.string.rally_x10_bic_pairing_instruction), context.getString(R.string.rally_x10_bic_pairing_instruction_charging_cable), (String) (false ? 1 : 0), 4, (p005kotlin.jvm.internal.j) (false ? 1 : 0)), (d90.e) (false ? 1 : 0), (d90.e) null, (String) null, 903, (p005kotlin.jvm.internal.j) null);
                z14 = true;
                aVar2 = aVar4;
                break;
            case 77:
            case 78:
                z16 = true;
                aVar5 = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.startup_generic_start_setup, str2), context.getString(R.string.startup_speed_sensor_note), (String) null, 4, (p005kotlin.jvm.internal.j) null), (d90.b) null, new d90.e(context.getString(R.string.msg_startup_speed_sensor_2_pairing_instruction), context.getString(R.string.startup_speed_sensor_note), (String) null, 4, (p005kotlin.jvm.internal.j) null), (d90.e) null, (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) null);
                z14 = z16;
                aVar2 = aVar5;
                break;
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                z15 = true;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, (d90.b) null, new d90.e(context.getString(R.string.lbl_dual_pairing_secondary_interface_start_help), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.e) (false ? 1 : 0), (d90.e) (false ? 1 : 0), (String) null, 943, (p005kotlin.jvm.internal.j) null);
                z14 = z15;
                break;
            case 86:
            case 87:
            case 88:
                z16 = true;
                String str12 = null;
                aVar5 = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.msg_hrm_setup_instruction, str2), context.getString(R.string.msg_hrm_setup_warning_placeholder, str2), str12, 4, (p005kotlin.jvm.internal.j) null), (d90.b) null, new d90.e(context.getString(R.string.msg_hrm_pairing_instructions), str12, context.getString(R.string.msg_hrm_setup_warning_placeholder, str2), 2, (p005kotlin.jvm.internal.j) null), (d90.e) (false ? 1 : 0), (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) null);
                z14 = z16;
                aVar2 = aVar5;
                break;
            case 89:
                z15 = true;
                int i34 = 4;
                p005kotlin.jvm.internal.j jVar6 = null;
                String str13 = null;
                aVar2 = new d90.a((Integer) null, false, false, true, new d90.e(context.getString(R.string.msg_hrm_setup_instruction, str2), context.getString(R.string.msg_hrm_setup_warning_placeholder, str2), (String) null, i34, jVar6), (d90.b) null, new d90.e(context.getString(R.string.msg_pair_awake_led, str2), context.getString(R.string.msg_then_flashing_purple_pairing, "4"), (String) (false ? 1 : 0), i34, jVar6), new d90.e(str13, context.getString(R.string.msg_flashing_purple_pairing, "4"), (String) (false ? 1 : 0), 5, jVar6), (d90.e) null, str13, 807, (p005kotlin.jvm.internal.j) (false ? 1 : 0));
                z14 = z15;
                break;
            case 90:
                z14 = true;
                aVar2 = new d90.a((Integer) null, false, false, true, new d90.e(context.getString(R.string.msg_hrm_setup_instruction, str2), context.getString(R.string.msg_hrm_setup_warning_placeholder, str2), (String) null, 4, (p005kotlin.jvm.internal.j) null), (d90.b) null, new d90.e(context.getString(R.string.msg_pair_awake_led, str2), context.getString(R.string.msg_then_flashing_orange_pairing, "4"), (String) null, 4, (p005kotlin.jvm.internal.j) null), new d90.e((String) null, context.getString(R.string.msg_flashing_orange_pairing, "4"), (String) null, 5, (p005kotlin.jvm.internal.j) null), (d90.e) null, (String) null, 807, (p005kotlin.jvm.internal.j) null);
                break;
            case 91:
                z14 = true;
                String str14 = null;
                d90.e eVar8 = new d90.e(context.getString(R.string.msg_complete_setup_to_track_body_metrics), (String) null, str14, 6, (p005kotlin.jvm.internal.j) null);
                String string9 = context.getString(R.string.msg_pairing_atlas2_instructions);
                string9.getClass();
                String str15 = null;
                aVar3 = new d90.a((Integer) null, false, false, false, eVar8, new d90.b(string9, str14, str15, (d90.c) (false ? 1 : 0), 14, (p005kotlin.jvm.internal.j) null), new d90.e(context.getString(R.string.lbl_scale_in_pairing_mode), str15, (String) (false ? 1 : 0), 6, (p005kotlin.jvm.internal.j) (false ? 1 : 0)), (d90.e) null, (d90.e) (false ? 1 : 0), (String) null, 911, (p005kotlin.jvm.internal.j) null);
                aVar2 = aVar3;
                break;
            case 92:
                z14 = true;
                int i35 = 4;
                p005kotlin.jvm.internal.j jVar7 = null;
                aVar4 = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.mercury_bic_start_pairing_text), context.getString(R.string.device_pin_input_msg, context.getString(R.string.connect_it)), (String) null, i35, jVar7), (d90.b) null, new d90.e(context.getString(R.string.msg_index_bpm_how_to_pair), context.getString(R.string.msg_bic_pairing_pin_enter_instructions), (String) (false ? 1 : 0), i35, jVar7), (d90.e) null, (d90.e) (false ? 1 : 0), (String) null, 943, (p005kotlin.jvm.internal.j) null);
                aVar2 = aVar4;
                break;
            case 93:
                z14 = true;
                String str16 = null;
                d90.e eVar9 = new d90.e(context.getString(R.string.msg_ready_to_connect_device_featuring_sleep), context.getString(R.string.startup_tutorial_powering_on), str16, 4, (p005kotlin.jvm.internal.j) null);
                String string10 = context.getString(R.string.msg_device_flashes_color_when_pairing, lc.u0.j(context.getString(R.string.lbl_purple_color)));
                x0 x0Var = x0.f105818a;
                aVar5 = new d90.a((Integer) null, false, false, false, eVar9, (d90.b) null, new d90.e(string10, str16, String.format("\n\n%s", Arrays.copyOf(new Object[]{context.getString(R.string.startup_tutorial_powering_on)}, 1)), 2, (p005kotlin.jvm.internal.j) null), (d90.e) null, (d90.e) null, (String) null, 943, (p005kotlin.jvm.internal.j) null);
                aVar2 = aVar5;
                break;
            case 94:
            case 95:
                z14 = true;
                aVar2 = new d90.a((Integer) null, false, false, true, eVar2, (d90.b) null, eVar3, (d90.e) null, (d90.e) null, (String) null, 935, (p005kotlin.jvm.internal.j) null);
                break;
            case 96:
            case 97:
                z14 = true;
                aVar = new d90.a((Integer) null, false, false, false, new d90.e(context.getString(R.string.ready_to_connect_info), (String) null, (String) null, 6, (p005kotlin.jvm.internal.j) null), (d90.b) null, eVar3, (d90.e) null, (d90.e) null, "https://support.garmin.com/%1$s/?faq=9CDD55lm3a4DcQaNL7yii9&productID=125677&tab=topics&sas_source=gcm", 431, (p005kotlin.jvm.internal.j) null);
                aVar2 = aVar;
                break;
            default:
                z14 = true;
                aVar2 = new d90.a((Integer) null, false, false, false, eVar2, (d90.b) null, eVar3, (d90.e) null, (d90.e) null, "https://support.garmin.com/%1$s/?faq=9CDD55lm3a4DcQaNL7yii9&productID=125677&tab=topics&sas_source=gcm", 431, (p005kotlin.jvm.internal.j) null);
                break;
        }
        this.f16952n.getClass();
        boolean z18 = false;
        switch (bVar == null ? -1 : c90.a.C0395a.f26041a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                z18 = z14;
                break;
        }
        s90.d dVar = this.f16951m;
        if (bVar != null) {
            dVar.getClass();
            switch (s90.d.a.f158031a[bVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    listC0 = h0.C0(s90.d.a(), w.c(u90.a.SLEEP_ADVANCED));
                    break;
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                case 137:
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    listC0 = s90.d.a();
                    break;
                case 139:
                    listC0 = h0.C0(s90.d.a(), x.k(u90.a.ACTIVITY_LEVEL, u90.a.USER_SHORT_NAME));
                    break;
                case 140:
                    listC0 = h0.C0(s90.d.a(), w.c(u90.a.USER_SHORT_NAME));
                    break;
                case 141:
                case 142:
                case 143:
                    listC0 = h0.C0(s90.d.a(), x.k(u90.a.SLEEP, u90.a.BOTTOM_TIME));
                    break;
                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    listC0 = h0.C0(s90.d.a(), x.k(u90.a.SLEEP_ADVANCED, u90.a.BOTTOM_TIME));
                    break;
                default:
                    listC0 = h0.C0(s90.d.a(), w.c(u90.a.SLEEP));
                    break;
            }
        } else {
            dVar.getClass();
            listC0 = h0.C0(s90.d.a(), w.c(u90.a.SLEEP));
        }
        List list2 = listC0;
        this.f16950l.getClass();
        switch (bVar == null ? -1 : h90.f.a.f82528a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                listC = w.c(j90.e.ACTIVITY_PROFILES_AND_SENSORS);
                break;
            case 23:
                listC = x.k(j90.e.LANGUAGE_SELECTION, j90.e.WRIST_SELECTION);
                break;
            case 24:
            case 25:
                listC = w.c(j90.e.BIKE_WHEEL_CIRCUMFERENCE);
                break;
            case 26:
                listC = w.c(j90.e.LTE_SUBSCRIPTION_TRANSFER);
                break;
            case 27:
            case 28:
                listC = x.k(j90.e.WRIST_SELECTION, j90.e.ACTIVITY_OPTIONS);
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                listC = x.k(j90.e.DEVICE_SCREEN_ORIENTATION, j90.e.WRIST_SELECTION);
                break;
            case 33:
            case 34:
            case 35:
            case 36:
                listC = x.k(j90.e.WRIST_SELECTION, j90.e.BUTTON_DIRECTION);
                break;
            case 37:
            case 38:
                listC = w.c(j90.e.WEAR_LOCATION);
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
                listC = w.c(j90.e.WRIST_SELECTION);
                break;
            default:
                listC = j0.f134944a;
                break;
        }
        List list3 = listC;
        this.f16945g.getClass();
        switch (bVar == null ? -1 : i.a.f26049a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                fVar = d90.f.c.INSTANCE;
                fVar2 = fVar;
                this.f16943e.getClass();
                if (bVar == null) {
                    i14 = -1;
                } else {
                    i14 = c90.b.a.f26042a[bVar.ordinal()];
                }
                switch (i14) {
                    case 1:
                        hVar = new d90.h(d90.j.LEGACY, 0, 0, false, 6, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.software_background_title, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.title_now_you_try_it, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        hVar = new d90.h((d90.j) null, 0, R.string.device_gesture_tutorial_intro, false, 11, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 137:
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    case 153:
                    case 154:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                    case 173:
                    case 174:
                    case 175:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                        hVar = new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar = null;
                        break;
                }
                this.f16944f.getClass();
                if (bVar == null) {
                    i15 = -1;
                } else {
                    i15 = e.a.f26045a[bVar.ordinal()];
                }
                switch (i15) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        hVar2 = new d90.h(d90.j.LEGACY, R.string.lbl_check_out_tutorial, 0, false, 12, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 7:
                        hVar2 = new d90.h(d90.j.LOTTIE, 0, 0, false, 14, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar2 = null;
                        break;
                }
                this.f16947i.getClass();
                if (bVar == null) {
                    i16 = -1;
                } else {
                    i16 = h.a.f26048a[bVar.ordinal()];
                }
                switch (i16) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        listC2 = j0.f134944a;
                        break;
                    case 17:
                    case 18:
                        listC2 = w.c(r90.a.f151346d);
                        break;
                    default:
                        listC2 = r90.a.f151352j;
                        break;
                }
                List list4 = listC2;
                this.f16948j.getClass();
                if (bVar == null) {
                    i17 = -1;
                } else {
                    i17 = f.a.f26046a[bVar.ordinal()];
                }
                if (i17 != z14 || i17 == 2 || i17 == 3) {
                    z17 = z14;
                } else {
                    z17 = false;
                }
                this.f16946h.getClass();
                if (bVar == null) {
                    i18 = -1;
                } else {
                    i18 = j.a.f26050a[bVar.ordinal()];
                }
                switch (i18) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        gVar = d90.g.DEFAULT;
                        break;
                    case 41:
                    case 42:
                        gVar = d90.g.INDEX;
                        break;
                    default:
                        gVar = d90.g.NONE;
                        break;
                }
                d90.g gVar2 = gVar;
                this.f16949k.getClass();
                if (bVar == null) {
                    i19 = -1;
                } else {
                    i19 = n90.a.C2407a.f125010a[bVar.ordinal()];
                }
                switch (i19) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        arrayList = new ArrayList();
                        int[] iArr2 = n90.a.C2407a.f125010a;
                        i24 = iArr2[bVar.ordinal()];
                        if (i24 != z14 || i24 == 2 || i24 == 5 || i24 == 6 || i24 == 7) {
                            arrayList.add(n90.b.f125012g);
                        }
                        i25 = iArr2[bVar.ordinal()];
                        if (i25 != 1 || i25 == 2 || i25 == 3 || i25 == 4 || i25 == 5 || i25 == 7 || i25 == 18 || i25 == 19) {
                            arrayList.add(n90.b.f125021p);
                        }
                        i26 = iArr2[bVar.ordinal()];
                        if (i26 != 1 || i26 == 2 || i26 == 3 || i26 == 4 || i26 == 5 || i26 == 7 || i26 == 18 || i26 == 19) {
                            arrayList.add(n90.b.f125015j);
                        }
                        i27 = iArr2[bVar.ordinal()];
                        if (i27 == 18 && i27 != 19) {
                            switch (i27) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    arrayList.add(n90.b.f125017l);
                            }
                        } else {
                            arrayList.add(n90.b.f125017l);
                        }
                        i28 = iArr2[bVar.ordinal()];
                        if (i28 != 2 || i28 == 7) {
                            arrayList.add(n90.b.f125028y);
                        }
                        i29 = iArr2[bVar.ordinal()];
                        if (i29 != 5 || i29 == 6) {
                            arrayList.add(n90.b.f125027x);
                        }
                        list = arrayList;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(n90.b.f125019n);
                        arrayList4.add(n90.b.f125013h);
                        arrayList4.add(n90.b.f125018m);
                        listC3 = arrayList4;
                        list = listC3;
                        break;
                    case 12:
                    case 13:
                        arrayList2 = new ArrayList();
                        iArr = n90.a.C2407a.f125010a;
                        if (iArr[bVar.ordinal()] == 12) {
                            arrayList2.add(n90.b.f125023r);
                        } else {
                            arrayList2.add(n90.b.f125025v);
                        }
                        arrayList2.add(n90.b.f125022q);
                        arrayList2.add(n90.b.f125020o);
                        listC3 = arrayList2;
                        if (iArr[bVar.ordinal()] != 12) {
                            arrayList2.add(n90.b.f125016k);
                            listC3 = arrayList2;
                        }
                        list = listC3;
                        break;
                    case 14:
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(n90.b.f125014i);
                        arrayList5.add(n90.b.f125028y);
                        listC3 = arrayList5;
                        list = listC3;
                        break;
                    case 15:
                    case 16:
                        arrayList3 = new ArrayList();
                        arrayList3.add(n90.b.f125024t);
                        if (n90.a.C2407a.f125010a[bVar.ordinal()] == 16) {
                            arrayList3.add(n90.b.f125026w);
                        }
                        arrayList3.add(n90.b.f125019n);
                        arrayList3.add(n90.b.f125013h);
                        arrayList3.add(n90.b.f125018m);
                        listC3 = arrayList3;
                        list = listC3;
                        break;
                    case 17:
                        listC3 = w.c(n90.b.f125014i);
                        list = listC3;
                        break;
                    default:
                        list = null;
                        break;
                }
                return new d90.d(num, iVar2, aVar2, z18, list2, list3, fVar2, hVar, hVar2, list4, gVar2, z17, list);
            case 25:
            case 26:
                fVar = d90.f.d.INSTANCE;
                fVar2 = fVar;
                this.f16943e.getClass();
                if (bVar == null) {
                    i14 = -1;
                } else {
                    i14 = c90.b.a.f26042a[bVar.ordinal()];
                }
                switch (i14) {
                    case 1:
                        hVar = new d90.h(d90.j.LEGACY, 0, 0, false, 6, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.software_background_title, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.title_now_you_try_it, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        hVar = new d90.h((d90.j) null, 0, R.string.device_gesture_tutorial_intro, false, 11, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 137:
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    case 153:
                    case 154:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                    case 173:
                    case 174:
                    case 175:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                        hVar = new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar = null;
                        break;
                }
                this.f16944f.getClass();
                if (bVar == null) {
                    i15 = -1;
                } else {
                    i15 = e.a.f26045a[bVar.ordinal()];
                }
                switch (i15) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        hVar2 = new d90.h(d90.j.LEGACY, R.string.lbl_check_out_tutorial, 0, false, 12, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 7:
                        hVar2 = new d90.h(d90.j.LOTTIE, 0, 0, false, 14, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar2 = null;
                        break;
                }
                this.f16947i.getClass();
                if (bVar == null) {
                    i16 = -1;
                } else {
                    i16 = h.a.f26048a[bVar.ordinal()];
                }
                switch (i16) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        listC2 = j0.f134944a;
                        break;
                    case 17:
                    case 18:
                        listC2 = w.c(r90.a.f151346d);
                        break;
                    default:
                        listC2 = r90.a.f151352j;
                        break;
                }
                List list5 = listC2;
                this.f16948j.getClass();
                if (bVar == null) {
                    i17 = -1;
                } else {
                    i17 = f.a.f26046a[bVar.ordinal()];
                }
                if (i17 != z14) {
                    z17 = z14;
                } else {
                    z17 = z14;
                }
                this.f16946h.getClass();
                if (bVar == null) {
                    i18 = -1;
                } else {
                    i18 = j.a.f26050a[bVar.ordinal()];
                }
                switch (i18) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        gVar = d90.g.DEFAULT;
                        break;
                    case 41:
                    case 42:
                        gVar = d90.g.INDEX;
                        break;
                    default:
                        gVar = d90.g.NONE;
                        break;
                }
                d90.g gVar3 = gVar;
                this.f16949k.getClass();
                if (bVar == null) {
                    i19 = -1;
                } else {
                    i19 = n90.a.C2407a.f125010a[bVar.ordinal()];
                }
                switch (i19) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        arrayList = new ArrayList();
                        int[] iArr3 = n90.a.C2407a.f125010a;
                        i24 = iArr3[bVar.ordinal()];
                        if (i24 != z14) {
                            arrayList.add(n90.b.f125012g);
                        } else {
                            arrayList.add(n90.b.f125012g);
                        }
                        i25 = iArr3[bVar.ordinal()];
                        if (i25 != 1) {
                            arrayList.add(n90.b.f125021p);
                        } else {
                            arrayList.add(n90.b.f125021p);
                        }
                        i26 = iArr3[bVar.ordinal()];
                        if (i26 != 1) {
                            arrayList.add(n90.b.f125015j);
                        } else {
                            arrayList.add(n90.b.f125015j);
                        }
                        i27 = iArr3[bVar.ordinal()];
                        if (i27 == 18) {
                            arrayList.add(n90.b.f125017l);
                        } else {
                            arrayList.add(n90.b.f125017l);
                        }
                        i28 = iArr3[bVar.ordinal()];
                        if (i28 != 2) {
                            arrayList.add(n90.b.f125028y);
                        } else {
                            arrayList.add(n90.b.f125028y);
                        }
                        i29 = iArr3[bVar.ordinal()];
                        if (i29 != 5) {
                            arrayList.add(n90.b.f125027x);
                        } else {
                            arrayList.add(n90.b.f125027x);
                        }
                        list = arrayList;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(n90.b.f125019n);
                        arrayList6.add(n90.b.f125013h);
                        arrayList6.add(n90.b.f125018m);
                        listC3 = arrayList6;
                        list = listC3;
                        break;
                    case 12:
                    case 13:
                        arrayList2 = new ArrayList();
                        iArr = n90.a.C2407a.f125010a;
                        if (iArr[bVar.ordinal()] == 12) {
                            arrayList2.add(n90.b.f125023r);
                        } else {
                            arrayList2.add(n90.b.f125025v);
                        }
                        arrayList2.add(n90.b.f125022q);
                        arrayList2.add(n90.b.f125020o);
                        listC3 = arrayList2;
                        if (iArr[bVar.ordinal()] != 12) {
                            arrayList2.add(n90.b.f125016k);
                            listC3 = arrayList2;
                        }
                        list = listC3;
                        break;
                    case 14:
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(n90.b.f125014i);
                        arrayList7.add(n90.b.f125028y);
                        listC3 = arrayList7;
                        list = listC3;
                        break;
                    case 15:
                    case 16:
                        arrayList3 = new ArrayList();
                        arrayList3.add(n90.b.f125024t);
                        if (n90.a.C2407a.f125010a[bVar.ordinal()] == 16) {
                            arrayList3.add(n90.b.f125026w);
                        }
                        arrayList3.add(n90.b.f125019n);
                        arrayList3.add(n90.b.f125013h);
                        arrayList3.add(n90.b.f125018m);
                        listC3 = arrayList3;
                        list = listC3;
                        break;
                    case 17:
                        listC3 = w.c(n90.b.f125014i);
                        list = listC3;
                        break;
                    default:
                        list = null;
                        break;
                }
                return new d90.d(num, iVar2, aVar2, z18, list2, list3, fVar2, hVar, hVar2, list5, gVar3, z17, list);
            case 27:
                String string11 = context.getString(R.string.startup_syncnow_almost_done);
                string11.getClass();
                eVar = new d90.f.e(string11);
                break;
            case 28:
                String string12 = context.getString(R.string.sync_reminder_title);
                string12.getClass();
                eVar = new d90.f.e(string12);
                break;
            case 29:
            case 30:
            case 31:
                fVar = d90.f.C1248f.INSTANCE;
                fVar2 = fVar;
                this.f16943e.getClass();
                if (bVar == null) {
                    i14 = -1;
                } else {
                    i14 = c90.b.a.f26042a[bVar.ordinal()];
                }
                switch (i14) {
                    case 1:
                        hVar = new d90.h(d90.j.LEGACY, 0, 0, false, 6, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.software_background_title, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.title_now_you_try_it, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        hVar = new d90.h((d90.j) null, 0, R.string.device_gesture_tutorial_intro, false, 11, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 137:
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    case 153:
                    case 154:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                    case 173:
                    case 174:
                    case 175:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                        hVar = new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar = null;
                        break;
                }
                this.f16944f.getClass();
                if (bVar == null) {
                    i15 = -1;
                } else {
                    i15 = e.a.f26045a[bVar.ordinal()];
                }
                switch (i15) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        hVar2 = new d90.h(d90.j.LEGACY, R.string.lbl_check_out_tutorial, 0, false, 12, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 7:
                        hVar2 = new d90.h(d90.j.LOTTIE, 0, 0, false, 14, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar2 = null;
                        break;
                }
                this.f16947i.getClass();
                if (bVar == null) {
                    i16 = -1;
                } else {
                    i16 = h.a.f26048a[bVar.ordinal()];
                }
                switch (i16) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        listC2 = j0.f134944a;
                        break;
                    case 17:
                    case 18:
                        listC2 = w.c(r90.a.f151346d);
                        break;
                    default:
                        listC2 = r90.a.f151352j;
                        break;
                }
                List list6 = listC2;
                this.f16948j.getClass();
                if (bVar == null) {
                    i17 = -1;
                } else {
                    i17 = f.a.f26046a[bVar.ordinal()];
                }
                if (i17 != z14) {
                    z17 = z14;
                } else {
                    z17 = z14;
                }
                this.f16946h.getClass();
                if (bVar == null) {
                    i18 = -1;
                } else {
                    i18 = j.a.f26050a[bVar.ordinal()];
                }
                switch (i18) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        gVar = d90.g.DEFAULT;
                        break;
                    case 41:
                    case 42:
                        gVar = d90.g.INDEX;
                        break;
                    default:
                        gVar = d90.g.NONE;
                        break;
                }
                d90.g gVar4 = gVar;
                this.f16949k.getClass();
                if (bVar == null) {
                    i19 = -1;
                } else {
                    i19 = n90.a.C2407a.f125010a[bVar.ordinal()];
                }
                switch (i19) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        arrayList = new ArrayList();
                        int[] iArr4 = n90.a.C2407a.f125010a;
                        i24 = iArr4[bVar.ordinal()];
                        if (i24 != z14) {
                            arrayList.add(n90.b.f125012g);
                        } else {
                            arrayList.add(n90.b.f125012g);
                        }
                        i25 = iArr4[bVar.ordinal()];
                        if (i25 != 1) {
                            arrayList.add(n90.b.f125021p);
                        } else {
                            arrayList.add(n90.b.f125021p);
                        }
                        i26 = iArr4[bVar.ordinal()];
                        if (i26 != 1) {
                            arrayList.add(n90.b.f125015j);
                        } else {
                            arrayList.add(n90.b.f125015j);
                        }
                        i27 = iArr4[bVar.ordinal()];
                        if (i27 == 18) {
                            arrayList.add(n90.b.f125017l);
                        } else {
                            arrayList.add(n90.b.f125017l);
                        }
                        i28 = iArr4[bVar.ordinal()];
                        if (i28 != 2) {
                            arrayList.add(n90.b.f125028y);
                        } else {
                            arrayList.add(n90.b.f125028y);
                        }
                        i29 = iArr4[bVar.ordinal()];
                        if (i29 != 5) {
                            arrayList.add(n90.b.f125027x);
                        } else {
                            arrayList.add(n90.b.f125027x);
                        }
                        list = arrayList;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.add(n90.b.f125019n);
                        arrayList8.add(n90.b.f125013h);
                        arrayList8.add(n90.b.f125018m);
                        listC3 = arrayList8;
                        list = listC3;
                        break;
                    case 12:
                    case 13:
                        arrayList2 = new ArrayList();
                        iArr = n90.a.C2407a.f125010a;
                        if (iArr[bVar.ordinal()] == 12) {
                            arrayList2.add(n90.b.f125023r);
                        } else {
                            arrayList2.add(n90.b.f125025v);
                        }
                        arrayList2.add(n90.b.f125022q);
                        arrayList2.add(n90.b.f125020o);
                        listC3 = arrayList2;
                        if (iArr[bVar.ordinal()] != 12) {
                            arrayList2.add(n90.b.f125016k);
                            listC3 = arrayList2;
                        }
                        list = listC3;
                        break;
                    case 14:
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(n90.b.f125014i);
                        arrayList9.add(n90.b.f125028y);
                        listC3 = arrayList9;
                        list = listC3;
                        break;
                    case 15:
                    case 16:
                        arrayList3 = new ArrayList();
                        arrayList3.add(n90.b.f125024t);
                        if (n90.a.C2407a.f125010a[bVar.ordinal()] == 16) {
                            arrayList3.add(n90.b.f125026w);
                        }
                        arrayList3.add(n90.b.f125019n);
                        arrayList3.add(n90.b.f125013h);
                        arrayList3.add(n90.b.f125018m);
                        listC3 = arrayList3;
                        list = listC3;
                        break;
                    case 17:
                        listC3 = w.c(n90.b.f125014i);
                        list = listC3;
                        break;
                    default:
                        list = null;
                        break;
                }
                return new d90.d(num, iVar2, aVar2, z18, list2, list3, fVar2, hVar, hVar2, list6, gVar4, z17, list);
            default:
                fVar = d90.f.b.INSTANCE;
                fVar2 = fVar;
                this.f16943e.getClass();
                if (bVar == null) {
                    i14 = -1;
                } else {
                    i14 = c90.b.a.f26042a[bVar.ordinal()];
                }
                switch (i14) {
                    case 1:
                        hVar = new d90.h(d90.j.LEGACY, 0, 0, false, 6, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.software_background_title, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        hVar = new d90.h(d90.j.LEGACY, 0, R.string.title_now_you_try_it, false, 10, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        hVar = new d90.h((d90.j) null, 0, R.string.device_gesture_tutorial_intro, false, 11, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 137:
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    case 153:
                    case 154:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                    case 173:
                    case 174:
                    case 175:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                        hVar = new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar = null;
                        break;
                }
                this.f16944f.getClass();
                if (bVar == null) {
                    i15 = -1;
                } else {
                    i15 = e.a.f26045a[bVar.ordinal()];
                }
                switch (i15) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        hVar2 = new d90.h(d90.j.LEGACY, R.string.lbl_check_out_tutorial, 0, false, 12, (p005kotlin.jvm.internal.j) null);
                        break;
                    case 7:
                        hVar2 = new d90.h(d90.j.LOTTIE, 0, 0, false, 14, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        hVar2 = null;
                        break;
                }
                this.f16947i.getClass();
                if (bVar == null) {
                    i16 = -1;
                } else {
                    i16 = h.a.f26048a[bVar.ordinal()];
                }
                switch (i16) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        listC2 = j0.f134944a;
                        break;
                    case 17:
                    case 18:
                        listC2 = w.c(r90.a.f151346d);
                        break;
                    default:
                        listC2 = r90.a.f151352j;
                        break;
                }
                List list7 = listC2;
                this.f16948j.getClass();
                if (bVar == null) {
                    i17 = -1;
                } else {
                    i17 = f.a.f26046a[bVar.ordinal()];
                }
                if (i17 != z14) {
                    z17 = z14;
                } else {
                    z17 = z14;
                }
                this.f16946h.getClass();
                if (bVar == null) {
                    i18 = -1;
                } else {
                    i18 = j.a.f26050a[bVar.ordinal()];
                }
                switch (i18) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        gVar = d90.g.DEFAULT;
                        break;
                    case 41:
                    case 42:
                        gVar = d90.g.INDEX;
                        break;
                    default:
                        gVar = d90.g.NONE;
                        break;
                }
                d90.g gVar5 = gVar;
                this.f16949k.getClass();
                if (bVar == null) {
                    i19 = -1;
                } else {
                    i19 = n90.a.C2407a.f125010a[bVar.ordinal()];
                }
                switch (i19) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        arrayList = new ArrayList();
                        int[] iArr5 = n90.a.C2407a.f125010a;
                        i24 = iArr5[bVar.ordinal()];
                        if (i24 != z14) {
                            arrayList.add(n90.b.f125012g);
                        } else {
                            arrayList.add(n90.b.f125012g);
                        }
                        i25 = iArr5[bVar.ordinal()];
                        if (i25 != 1) {
                            arrayList.add(n90.b.f125021p);
                        } else {
                            arrayList.add(n90.b.f125021p);
                        }
                        i26 = iArr5[bVar.ordinal()];
                        if (i26 != 1) {
                            arrayList.add(n90.b.f125015j);
                        } else {
                            arrayList.add(n90.b.f125015j);
                        }
                        i27 = iArr5[bVar.ordinal()];
                        if (i27 == 18) {
                            arrayList.add(n90.b.f125017l);
                        } else {
                            arrayList.add(n90.b.f125017l);
                        }
                        i28 = iArr5[bVar.ordinal()];
                        if (i28 != 2) {
                            arrayList.add(n90.b.f125028y);
                        } else {
                            arrayList.add(n90.b.f125028y);
                        }
                        i29 = iArr5[bVar.ordinal()];
                        if (i29 != 5) {
                            arrayList.add(n90.b.f125027x);
                        } else {
                            arrayList.add(n90.b.f125027x);
                        }
                        list = arrayList;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(n90.b.f125019n);
                        arrayList10.add(n90.b.f125013h);
                        arrayList10.add(n90.b.f125018m);
                        listC3 = arrayList10;
                        list = listC3;
                        break;
                    case 12:
                    case 13:
                        arrayList2 = new ArrayList();
                        iArr = n90.a.C2407a.f125010a;
                        if (iArr[bVar.ordinal()] == 12) {
                            arrayList2.add(n90.b.f125023r);
                        } else {
                            arrayList2.add(n90.b.f125025v);
                        }
                        arrayList2.add(n90.b.f125022q);
                        arrayList2.add(n90.b.f125020o);
                        listC3 = arrayList2;
                        if (iArr[bVar.ordinal()] != 12) {
                            arrayList2.add(n90.b.f125016k);
                            listC3 = arrayList2;
                        }
                        list = listC3;
                        break;
                    case 14:
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.add(n90.b.f125014i);
                        arrayList11.add(n90.b.f125028y);
                        listC3 = arrayList11;
                        list = listC3;
                        break;
                    case 15:
                    case 16:
                        arrayList3 = new ArrayList();
                        arrayList3.add(n90.b.f125024t);
                        if (n90.a.C2407a.f125010a[bVar.ordinal()] == 16) {
                            arrayList3.add(n90.b.f125026w);
                        }
                        arrayList3.add(n90.b.f125019n);
                        arrayList3.add(n90.b.f125013h);
                        arrayList3.add(n90.b.f125018m);
                        listC3 = arrayList3;
                        list = listC3;
                        break;
                    case 17:
                        listC3 = w.c(n90.b.f125014i);
                        list = listC3;
                        break;
                    default:
                        list = null;
                        break;
                }
                return new d90.d(num, iVar2, aVar2, z18, list2, list3, fVar2, hVar, hVar2, list7, gVar5, z17, list);
        }
        fVar2 = eVar;
        this.f16943e.getClass();
        if (bVar == null) {
            i14 = -1;
        } else {
            i14 = c90.b.a.f26042a[bVar.ordinal()];
        }
        switch (i14) {
            case 1:
                hVar = new d90.h(d90.j.LEGACY, 0, 0, false, 6, (p005kotlin.jvm.internal.j) null);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                hVar = new d90.h(d90.j.LEGACY, 0, R.string.software_background_title, false, 10, (p005kotlin.jvm.internal.j) null);
                break;
            case 9:
            case 10:
            case 11:
                hVar = new d90.h(d90.j.LEGACY, 0, R.string.title_now_you_try_it, false, 10, (p005kotlin.jvm.internal.j) null);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                hVar = new d90.h((d90.j) null, 0, R.string.device_gesture_tutorial_intro, false, 11, (p005kotlin.jvm.internal.j) null);
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 137:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
            case 173:
            case 174:
            case 175:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
                hVar = new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null);
                break;
            default:
                hVar = null;
                break;
        }
        this.f16944f.getClass();
        if (bVar == null) {
            i15 = -1;
        } else {
            i15 = e.a.f26045a[bVar.ordinal()];
        }
        switch (i15) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                hVar2 = new d90.h(d90.j.LEGACY, R.string.lbl_check_out_tutorial, 0, false, 12, (p005kotlin.jvm.internal.j) null);
                break;
            case 7:
                hVar2 = new d90.h(d90.j.LOTTIE, 0, 0, false, 14, (p005kotlin.jvm.internal.j) null);
                break;
            default:
                hVar2 = null;
                break;
        }
        this.f16947i.getClass();
        if (bVar == null) {
            i16 = -1;
        } else {
            i16 = h.a.f26048a[bVar.ordinal()];
        }
        switch (i16) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                listC2 = j0.f134944a;
                break;
            case 17:
            case 18:
                listC2 = w.c(r90.a.f151346d);
                break;
            default:
                listC2 = r90.a.f151352j;
                break;
        }
        List list8 = listC2;
        this.f16948j.getClass();
        if (bVar == null) {
            i17 = -1;
        } else {
            i17 = f.a.f26046a[bVar.ordinal()];
        }
        if (i17 != z14) {
            z17 = z14;
        } else {
            z17 = z14;
        }
        this.f16946h.getClass();
        if (bVar == null) {
            i18 = -1;
        } else {
            i18 = j.a.f26050a[bVar.ordinal()];
        }
        switch (i18) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                gVar = d90.g.DEFAULT;
                break;
            case 41:
            case 42:
                gVar = d90.g.INDEX;
                break;
            default:
                gVar = d90.g.NONE;
                break;
        }
        d90.g gVar6 = gVar;
        this.f16949k.getClass();
        if (bVar == null) {
            i19 = -1;
        } else {
            i19 = n90.a.C2407a.f125010a[bVar.ordinal()];
        }
        switch (i19) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                arrayList = new ArrayList();
                int[] iArr6 = n90.a.C2407a.f125010a;
                i24 = iArr6[bVar.ordinal()];
                if (i24 != z14) {
                    arrayList.add(n90.b.f125012g);
                } else {
                    arrayList.add(n90.b.f125012g);
                }
                i25 = iArr6[bVar.ordinal()];
                if (i25 != 1) {
                    arrayList.add(n90.b.f125021p);
                } else {
                    arrayList.add(n90.b.f125021p);
                }
                i26 = iArr6[bVar.ordinal()];
                if (i26 != 1) {
                    arrayList.add(n90.b.f125015j);
                } else {
                    arrayList.add(n90.b.f125015j);
                }
                i27 = iArr6[bVar.ordinal()];
                if (i27 == 18) {
                    arrayList.add(n90.b.f125017l);
                } else {
                    arrayList.add(n90.b.f125017l);
                }
                i28 = iArr6[bVar.ordinal()];
                if (i28 != 2) {
                    arrayList.add(n90.b.f125028y);
                } else {
                    arrayList.add(n90.b.f125028y);
                }
                i29 = iArr6[bVar.ordinal()];
                if (i29 != 5) {
                    arrayList.add(n90.b.f125027x);
                } else {
                    arrayList.add(n90.b.f125027x);
                }
                list = arrayList;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(n90.b.f125019n);
                arrayList12.add(n90.b.f125013h);
                arrayList12.add(n90.b.f125018m);
                listC3 = arrayList12;
                list = listC3;
                break;
            case 12:
            case 13:
                arrayList2 = new ArrayList();
                iArr = n90.a.C2407a.f125010a;
                if (iArr[bVar.ordinal()] == 12) {
                    arrayList2.add(n90.b.f125023r);
                } else {
                    arrayList2.add(n90.b.f125025v);
                }
                arrayList2.add(n90.b.f125022q);
                arrayList2.add(n90.b.f125020o);
                listC3 = arrayList2;
                if (iArr[bVar.ordinal()] != 12) {
                    arrayList2.add(n90.b.f125016k);
                    listC3 = arrayList2;
                }
                list = listC3;
                break;
            case 14:
                ArrayList arrayList13 = new ArrayList();
                arrayList13.add(n90.b.f125014i);
                arrayList13.add(n90.b.f125028y);
                listC3 = arrayList13;
                list = listC3;
                break;
            case 15:
            case 16:
                arrayList3 = new ArrayList();
                arrayList3.add(n90.b.f125024t);
                if (n90.a.C2407a.f125010a[bVar.ordinal()] == 16) {
                    arrayList3.add(n90.b.f125026w);
                }
                arrayList3.add(n90.b.f125019n);
                arrayList3.add(n90.b.f125013h);
                arrayList3.add(n90.b.f125018m);
                listC3 = arrayList3;
                list = listC3;
                break;
            case 17:
                listC3 = w.c(n90.b.f125014i);
                list = listC3;
                break;
            default:
                list = null;
                break;
        }
        return new d90.d(num, iVar2, aVar2, z18, list2, list3, fVar2, hVar, hVar2, list8, gVar6, z17, list);
    }

    public a(Context context, g gVar, c cVar, d dVar, c90.b bVar, e eVar, i iVar, j jVar, h hVar, f fVar, n90.a aVar, h90.f fVar2, s90.d dVar2, c90.a aVar2) {
        context.getClass();
        gVar.getClass();
        cVar.getClass();
        dVar.getClass();
        bVar.getClass();
        eVar.getClass();
        iVar.getClass();
        jVar.getClass();
        hVar.getClass();
        fVar.getClass();
        aVar.getClass();
        fVar2.getClass();
        dVar2.getClass();
        aVar2.getClass();
        this.f16939a = context;
        this.f16940b = gVar;
        this.f16941c = cVar;
        this.f16942d = dVar;
        this.f16943e = bVar;
        this.f16944f = eVar;
        this.f16945g = iVar;
        this.f16946h = jVar;
        this.f16947i = hVar;
        this.f16948j = fVar;
        this.f16949k = aVar;
        this.f16950l = fVar2;
        this.f16951m = dVar2;
        this.f16952n = aVar2;
    }
}
