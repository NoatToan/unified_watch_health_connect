package com.huami.account.selectArea.datasource;

import androidx.compose.runtime.ComposeVersion;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.alipay.sdk.m.l.b;
import com.alipay.sdk.m.s.a;
import com.facebook.appevents.UserDataStore;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.R;
import com.huami.module.homepage.cards.business.healthstate.HealthStateCardView;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.passport.Configs;
import com.huami.sleep.model.DataConstant;
import com.huami.watch.companion.BuildConfig;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.dataflow.chart.util.AnimUtil;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.market.sdk.Constants;
import java.util.Locale;
import kotlin.Metadata;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/account/selectArea/datasource/AreaMapper;", "", "", "areaCode", "exec", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AreaMapper {

    @NotNull
    public static final AreaMapper INSTANCE = new AreaMapper();

    private AreaMapper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1014:0x118b  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 int, still in use, count: 14, list:
      (r0v1 int) from 0x000c: IF  (r0v1 int) != (3115 int)  -> B:4:0x000e A[HIDDEN]
      (r0v1 int) from 0x0010: IF  (r0v1 int) != (3116 int)  -> B:6:0x0012 A[HIDDEN]
      (r0v1 int) from 0x0014: IF  (r0v1 int) != (3126 int)  -> B:8:0x0016 A[HIDDEN]
      (r0v1 int) from 0x0018: IF  (r0v1 int) != (3127 int)  -> B:10:0x001a A[HIDDEN]
      (r0v1 int) from 0x001c: IF  (r0v1 int) != (3135 int)  -> B:12:0x001e A[HIDDEN]
      (r0v1 int) from 0x0020: IF  (r0v1 int) != (3136 int)  -> B:14:0x0022 A[HIDDEN]
      (r0v1 int) from 0x0024: IF  (r0v1 int) != (3159 int)  -> B:16:0x0026 A[HIDDEN]
      (r0v1 int) from 0x0028: IF  (r0v1 int) != (3160 int)  -> B:18:0x002a A[HIDDEN]
      (r0v1 int) from 0x002c: IF  (r0v1 int) != (3168 int)  -> B:20:0x002e A[HIDDEN]
      (r0v1 int) from 0x0030: IF  (r0v1 int) != (3169 int)  -> B:22:0x0032 A[HIDDEN]
      (r0v1 int) from 0x0035: SWITCH (r0v1 int)
     case 3112: goto B:956:0x1093
     case 3118: goto B:952:0x1081
     case 3129: goto B:948:0x106f
     case 3138: goto B:944:0x105d
     case 3139: goto B:940:0x104b
     case 3140: goto B:936:0x1039
     case 3141: goto B:932:0x1027
     case 3142: goto B:928:0x1015
     case 3143: goto B:924:0x1003
     case 3144: goto B:920:0x0ff1
     case 3157: goto B:916:0x0fdf
     case 3166: goto B:912:0x0fcd
     case 3171: goto B:908:0x0fbb
     case 3172: goto B:904:0x0fa9
     case 3173: goto B:900:0x0f97
     case 3174: goto B:896:0x0f85
     case 3176: goto B:892:0x0f73
     case 3177: goto B:888:0x0f61
     case 3178: goto B:884:0x0f4f
     case 3179: goto B:880:0x0f3d
     case 3180: goto B:876:0x0f2b
     case 3183: goto B:872:0x0f19
     case 3186: goto B:868:0x0f07
     case 3187: goto B:864:0x0ef5
     case 3188: goto B:860:0x0ee3
     case 3189: goto B:856:0x0ed1
     case 3190: goto B:852:0x0ebf
     case 3191: goto B:848:0x0ead
     case 3201: goto B:844:0x0e9b
     case 3203: goto B:840:0x0e89
     case 3206: goto B:836:0x0e77
     case 3207: goto B:832:0x0e65
     case 3209: goto B:828:0x0e53
     case 3211: goto B:824:0x0e41
     case 3222: goto B:820:0x0e2f
     case 3228: goto B:816:0x0e1d
     case 3230: goto B:812:0x0e0b
     case 3232: goto B:808:0x0df9
     case 3234: goto B:804:0x0de7
     case 3235: goto B:800:0x0dd5
     case 3245: goto B:796:0x0dc3
     case 3246: goto B:792:0x0db1
     case 3247: goto B:788:0x0d9f
     case 3267: goto B:784:0x0d8d
     case 3268: goto B:780:0x0d7b
     case 3269: goto B:776:0x0d69
     case 3271: goto B:772:0x0d57
     case 3273: goto B:768:0x0d45
     case 3276: goto B:764:0x0d33
     case 3290: goto B:760:0x0d21
     case 3291: goto B:756:0x0d0f
     case 3293: goto B:752:0x0cfd
     case 3294: goto B:748:0x0ceb
     case 3295: goto B:744:0x0cd9
     case 3296: goto B:740:0x0cc7
     case 3297: goto B:736:0x0cb5
     case 3298: goto B:732:0x0ca3
     case 3301: goto B:728:0x0c91
     case 3302: goto B:724:0x0c7f
     case 3303: goto B:720:0x0c6d
     case 3305: goto B:716:0x0c5b
     case 3306: goto B:712:0x0c49
     case 3307: goto B:708:0x0c37
     case 3309: goto B:704:0x0c25
     case 3310: goto B:700:0x0c13
     case 3312: goto B:696:0x0c01
     case 3314: goto B:692:0x0bef
     case 3331: goto B:688:0x0bdd
     case 3334: goto B:684:0x0bcb
     case 3338: goto B:680:0x0bb9
     case 3340: goto B:676:0x0ba7
     case 3341: goto B:672:0x0b95
     case 3354: goto B:668:0x0b83
     case 3355: goto B:664:0x0b71
     case 3356: goto B:660:0x0b5f
     case 3363: goto B:656:0x0b4d
     case 3364: goto B:652:0x0b3b
     case 3365: goto B:648:0x0b29
     case 3366: goto B:644:0x0b17
     case 3368: goto B:640:0x0b05
     case 3369: goto B:636:0x0af3
     case 3370: goto B:632:0x0ae1
     case 3371: goto B:628:0x0acf
     case 3387: goto B:624:0x0abd
     case 3395: goto B:620:0x0aab
     case 3397: goto B:616:0x0a99
     case 3398: goto B:612:0x0a87
     case 3418: goto B:608:0x0a75
     case 3420: goto B:604:0x0a63
     case 3421: goto B:600:0x0a51
     case 3422: goto B:596:0x0a3f
     case 3426: goto B:592:0x0a2d
     case 3427: goto B:588:0x0a1b
     case 3429: goto B:584:0x0a09
     case 3431: goto B:580:0x09f7
     case 3436: goto B:576:0x09e5
     case 3438: goto B:572:0x09d3
     case 3439: goto B:568:0x09c1
     case 3445: goto B:564:0x09af
     case 3446: goto B:560:0x099d
     case 3447: goto B:556:0x098b
     case 3453: goto B:552:0x0979
     case 3455: goto B:548:0x0967
     case 3462: goto B:544:0x0955
     case 3463: goto B:540:0x0943
     case 3464: goto B:536:0x0931
     case 3465: goto B:532:0x091f
     case 3466: goto B:528:0x090d
     case 3469: goto B:524:0x08fb
     case 3476: goto B:520:0x08e9
     case 3478: goto B:516:0x08d7
     case 3479: goto B:512:0x08c5
     case 3480: goto B:508:0x08b3
     case 3481: goto B:504:0x08a1
     case 3482: goto B:500:0x088f
     case 3483: goto B:496:0x087d
     case 3486: goto B:492:0x086b
     case 3487: goto B:488:0x0859
     case 3488: goto B:484:0x0847
     case 3489: goto B:480:0x0835
     case 3490: goto B:476:0x0823
     case 3491: goto B:472:0x0811
     case 3492: goto B:468:0x07ff
     case 3493: goto B:464:0x07ed
     case 3494: goto B:460:0x07db
     case 3495: goto B:456:0x07c9
     case 3496: goto B:452:0x07b7
     case 3498: goto B:448:0x07a5
     case 3499: goto B:444:0x0793
     case 3500: goto B:440:0x0781
     case 3501: goto B:436:0x076f
     case 3507: goto B:432:0x075d
     case 3509: goto B:428:0x074b
     case 3511: goto B:424:0x0739
     case 3512: goto B:420:0x0727
     case 3513: goto B:416:0x0715
     case 3515: goto B:412:0x0703
     case 3518: goto B:408:0x06f1
     case 3521: goto B:404:0x06df
     case 3522: goto B:400:0x06cd
     case 3524: goto B:396:0x06bb
     case 3527: goto B:392:0x06a9
     case 3532: goto B:388:0x0697
     case 3550: goto B:384:0x0685
     case 3569: goto B:380:0x0673
     case 3573: goto B:376:0x0661
     case 3574: goto B:372:0x064f
     case 3575: goto B:368:0x063d
     case 3576: goto B:364:0x062b
     case 3579: goto B:360:0x0619
     case 3580: goto B:356:0x0607
     case 3581: goto B:352:0x05f5
     case 3582: goto B:348:0x05e3
     case 3586: goto B:344:0x05d1
     case 3587: goto B:340:0x05bf
     case 3588: goto B:336:0x05ad
     case 3591: goto B:332:0x059b
     case 3593: goto B:328:0x0589
     case 3600: goto B:324:0x0577
     case 3635: goto B:320:0x0565
     case 3645: goto B:316:0x0553
     case 3649: goto B:312:0x0541
     case 3651: goto B:308:0x052f
     case 3653: goto B:304:0x051d
     case 3662: goto B:300:0x050b
     case 3663: goto B:296:0x04f9
     case 3664: goto B:292:0x04e7
     case 3665: goto B:288:0x04d5
     case 3666: goto B:284:0x04c3
     case 3668: goto B:280:0x04b1
     case 3669: goto B:276:0x049f
     case 3670: goto B:272:0x048d
     case 3671: goto B:268:0x047b
     case 3672: goto B:264:0x0469
     case 3673: goto B:260:0x0457
     case 3674: goto B:256:0x0445
     case 3675: goto B:252:0x0433
     case 3676: goto B:248:0x0421
     case 3679: goto B:244:0x040f
     case 3680: goto B:240:0x03fd
     case 3681: goto B:236:0x03eb
     case 3683: goto B:232:0x03d9
     case 3685: goto B:228:0x03c7
     case 3686: goto B:224:0x03b5
     case 3687: goto B:220:0x03a3
     case 3695: goto B:216:0x0391
     case 3696: goto B:212:0x037f
     case 3699: goto B:208:0x036d
     case 3700: goto B:204:0x035b
     case 3702: goto B:200:0x0349
     case 3703: goto B:196:0x0337
     case 3704: goto B:192:0x0325
     case 3705: goto B:188:0x0313
     case 3706: goto B:184:0x0301
     case 3707: goto B:180:0x02ef
     case 3710: goto B:176:0x02dd
     case 3712: goto B:172:0x02cb
     case 3714: goto B:168:0x02b9
     case 3715: goto B:164:0x02a7
     case 3718: goto B:160:0x0295
     case 3724: goto B:156:0x0283
     case 3730: goto B:152:0x0271
     case 3736: goto B:148:0x025f
     case 3742: goto B:144:0x024d
     case 3748: goto B:140:0x023b
     case 3749: goto B:136:0x0229
     case 3755: goto B:132:0x0217
     case 3757: goto B:128:0x0205
     case 3759: goto B:124:0x01f3
     case 3761: goto B:120:0x01e1
     case 3763: goto B:116:0x01cf
     case 3768: goto B:112:0x01bd
     case 3775: goto B:108:0x01ab
     case 3791: goto B:104:0x0199
     case 3804: goto B:100:0x0187
     case 3827: goto B:96:0x0175
     case 3852: goto B:92:0x0163
     case 3867: goto B:88:0x0151
     case 3879: goto B:84:0x013f
     case 3891: goto B:80:0x012d
     case 3901: goto B:76:0x011b
     default: goto B:24:0x0038 A[RegionRef:SW:23]
      (r0v1 int) from 0x0038: SWITCH (r0v1 int)
     case 3121: goto B:72:0x0109
     case 3122: goto B:68:0x00f7
     case 3123: goto B:64:0x00e5
     case 3124: goto B:60:0x00d3
     default: goto B:25:0x003b A[RegionRef:SW:24]
      (r0v1 int) from 0x003b: SWITCH (r0v1 int)
     case 3146: goto B:56:0x00c1
     case 3147: goto B:52:0x00af
     case 3148: goto B:48:0x009d
     case 3149: goto B:44:0x008b
     default: goto B:26:0x003e A[RegionRef:SW:25]
      (r0v1 int) from 0x003e: SWITCH (r0v1 int)
     case 3151: goto B:40:0x0079
     case 3152: goto B:36:0x0067
     case 3153: goto B:32:0x0055
     case 3154: goto B:28:0x0043
     default: goto B:1014:0x118b A[RegionRef:SW:26]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final String exec(@NotNull String areaCode) {
        Integer numValueOf;
        String lowerCase = areaCode.toLowerCase(Locale.ROOT);
        if (iHashCode != 3115) {
            if (iHashCode != 3116) {
                if (iHashCode != 3126) {
                    if (iHashCode != 3127) {
                        if (iHashCode != 3135) {
                            if (iHashCode != 3136) {
                                if (iHashCode != 3159) {
                                    if (iHashCode != 3160) {
                                        if (iHashCode != 3168) {
                                            if (iHashCode != 3169) {
                                                switch (lowerCase) {
                                                    case "ad":
                                                        numValueOf = Integer.valueOf(R.string.account_ui_region_ad);
                                                        break;
                                                    case "ae":
                                                        numValueOf = Integer.valueOf(R.string.account_ui_region_ae);
                                                        break;
                                                    case "af":
                                                        numValueOf = Integer.valueOf(R.string.account_ui_region_af);
                                                        break;
                                                    case "ag":
                                                        numValueOf = Integer.valueOf(R.string.account_ui_region_ag);
                                                        break;
                                                    default:
                                                        switch (lowerCase) {
                                                            case 3112:
                                                                if (!lowerCase.equals("ai")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ai);
                                                                }
                                                                break;
                                                            case 3118:
                                                                if (!lowerCase.equals("ao")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ao);
                                                                }
                                                                break;
                                                            case 3129:
                                                                if (!lowerCase.equals("az")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_az);
                                                                }
                                                                break;
                                                            case 3138:
                                                                if (!lowerCase.equals("bd")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bd);
                                                                }
                                                                break;
                                                            case 3139:
                                                                if (!lowerCase.equals("be")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_be);
                                                                }
                                                                break;
                                                            case 3140:
                                                                if (!lowerCase.equals("bf")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bf);
                                                                }
                                                                break;
                                                            case 3141:
                                                                if (!lowerCase.equals("bg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bg);
                                                                }
                                                                break;
                                                            case 3142:
                                                                if (!lowerCase.equals("bh")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bh);
                                                                }
                                                                break;
                                                            case 3143:
                                                                if (!lowerCase.equals("bi")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bi);
                                                                }
                                                                break;
                                                            case 3144:
                                                                if (!lowerCase.equals("bj")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bj);
                                                                }
                                                                break;
                                                            case 3157:
                                                                if (!lowerCase.equals("bw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bw);
                                                                }
                                                                break;
                                                            case 3166:
                                                                if (!lowerCase.equals("ca")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ca);
                                                                }
                                                                break;
                                                            case 3171:
                                                                if (!lowerCase.equals("cf")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cf);
                                                                }
                                                                break;
                                                            case 3172:
                                                                if (!lowerCase.equals("cg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cg);
                                                                }
                                                                break;
                                                            case 3173:
                                                                if (!lowerCase.equals("ch")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ch);
                                                                }
                                                                break;
                                                            case 3174:
                                                                if (!lowerCase.equals("ci")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ci);
                                                                }
                                                                break;
                                                            case 3176:
                                                                if (!lowerCase.equals("ck")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ck);
                                                                }
                                                                break;
                                                            case 3177:
                                                                if (!lowerCase.equals("cl")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cl);
                                                                }
                                                                break;
                                                            case 3178:
                                                                if (!lowerCase.equals("cm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cm);
                                                                }
                                                                break;
                                                            case 3179:
                                                                if (!lowerCase.equals("cn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cn);
                                                                }
                                                                break;
                                                            case 3180:
                                                                if (!lowerCase.equals(Constants.JSON_COUNTRY)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_co);
                                                                }
                                                                break;
                                                            case 3183:
                                                                if (!lowerCase.equals("cr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cr);
                                                                }
                                                                break;
                                                            case 3186:
                                                                if (!lowerCase.equals("cu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cu);
                                                                }
                                                                break;
                                                            case 3187:
                                                                if (!lowerCase.equals("cv")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cv);
                                                                }
                                                                break;
                                                            case 3188:
                                                                if (!lowerCase.equals("cw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cw);
                                                                }
                                                                break;
                                                            case 3189:
                                                                if (!lowerCase.equals("cx")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cx);
                                                                }
                                                                break;
                                                            case 3190:
                                                                if (!lowerCase.equals("cy")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cy);
                                                                }
                                                                break;
                                                            case 3191:
                                                                if (!lowerCase.equals("cz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_cz);
                                                                }
                                                                break;
                                                            case 3201:
                                                                if (!lowerCase.equals("de")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_de);
                                                                }
                                                                break;
                                                            case 3203:
                                                                if (!lowerCase.equals("dg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_dg);
                                                                }
                                                                break;
                                                            case 3206:
                                                                if (!lowerCase.equals("dj")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_dj);
                                                                }
                                                                break;
                                                            case 3207:
                                                                if (!lowerCase.equals("dk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_dk);
                                                                }
                                                                break;
                                                            case 3209:
                                                                if (!lowerCase.equals("dm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_dm);
                                                                }
                                                                break;
                                                            case 3211:
                                                                if (!lowerCase.equals("do")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_do);
                                                                }
                                                                break;
                                                            case 3222:
                                                                if (!lowerCase.equals("dz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_dz);
                                                                }
                                                                break;
                                                            case 3228:
                                                                if (!lowerCase.equals("ea")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ea);
                                                                }
                                                                break;
                                                            case 3230:
                                                                if (!lowerCase.equals("ec")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ec);
                                                                }
                                                                break;
                                                            case 3232:
                                                                if (!lowerCase.equals("ee")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ee);
                                                                }
                                                                break;
                                                            case 3234:
                                                                if (!lowerCase.equals("eg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_eg);
                                                                }
                                                                break;
                                                            case 3235:
                                                                if (!lowerCase.equals("eh")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_eh);
                                                                }
                                                                break;
                                                            case 3245:
                                                                if (!lowerCase.equals("er")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_er);
                                                                }
                                                                break;
                                                            case 3246:
                                                                if (!lowerCase.equals("es")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_es);
                                                                }
                                                                break;
                                                            case 3247:
                                                                if (!lowerCase.equals("et")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_et);
                                                                }
                                                                break;
                                                            case 3267:
                                                                if (!lowerCase.equals("fi")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_fi);
                                                                }
                                                                break;
                                                            case 3268:
                                                                if (!lowerCase.equals("fj")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_fj);
                                                                }
                                                                break;
                                                            case 3269:
                                                                if (!lowerCase.equals("fk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_fk);
                                                                }
                                                                break;
                                                            case 3271:
                                                                if (!lowerCase.equals("fm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_fm);
                                                                }
                                                                break;
                                                            case 3273:
                                                                if (!lowerCase.equals("fo")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_fo);
                                                                }
                                                                break;
                                                            case 3276:
                                                                if (!lowerCase.equals("fr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_fr);
                                                                }
                                                                break;
                                                            case 3290:
                                                                if (!lowerCase.equals("ga")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ga);
                                                                }
                                                                break;
                                                            case 3291:
                                                                if (!lowerCase.equals("gb")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gb);
                                                                }
                                                                break;
                                                            case 3293:
                                                                if (!lowerCase.equals(Constant.PAI_KEY_GENDER)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gd);
                                                                }
                                                                break;
                                                            case 3294:
                                                                if (!lowerCase.equals(UserDataStore.GENDER)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ge);
                                                                }
                                                                break;
                                                            case 3295:
                                                                if (!lowerCase.equals("gf")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gf);
                                                                }
                                                                break;
                                                            case 3296:
                                                                if (!lowerCase.equals("gg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gg);
                                                                }
                                                                break;
                                                            case 3297:
                                                                if (!lowerCase.equals("gh")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gh);
                                                                }
                                                                break;
                                                            case 3298:
                                                                if (!lowerCase.equals("gi")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gi);
                                                                }
                                                                break;
                                                            case 3301:
                                                                if (!lowerCase.equals("gl")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gl);
                                                                }
                                                                break;
                                                            case 3302:
                                                                if (!lowerCase.equals("gm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gm);
                                                                }
                                                                break;
                                                            case 3303:
                                                                if (!lowerCase.equals("gn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gn);
                                                                }
                                                                break;
                                                            case ComposeVersion.version /* 3305 */:
                                                                if (!lowerCase.equals("gp")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gp);
                                                                }
                                                                break;
                                                            case 3306:
                                                                if (!lowerCase.equals("gq")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gq);
                                                                }
                                                                break;
                                                            case 3307:
                                                                if (!lowerCase.equals("gr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gr);
                                                                }
                                                                break;
                                                            case 3309:
                                                                if (!lowerCase.equals("gt")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gt);
                                                                }
                                                                break;
                                                            case 3310:
                                                                if (!lowerCase.equals("gu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gu);
                                                                }
                                                                break;
                                                            case 3312:
                                                                if (!lowerCase.equals("gw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gw);
                                                                }
                                                                break;
                                                            case 3314:
                                                                if (!lowerCase.equals("gy")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_gy);
                                                                }
                                                                break;
                                                            case 3331:
                                                                if (!lowerCase.equals("hk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_hk);
                                                                }
                                                                break;
                                                            case 3334:
                                                                if (!lowerCase.equals("hn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_hn);
                                                                }
                                                                break;
                                                            case 3338:
                                                                if (!lowerCase.equals(com.huami.mifit.sportlib.common.Constants.DATA_KEY_HR)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_hr);
                                                                }
                                                                break;
                                                            case 3340:
                                                                if (!lowerCase.equals("ht")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ht);
                                                                }
                                                                break;
                                                            case 3341:
                                                                if (!lowerCase.equals("hu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_hu);
                                                                }
                                                                break;
                                                            case 3354:
                                                                if (!lowerCase.equals("ic")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ic);
                                                                }
                                                                break;
                                                            case 3355:
                                                                if (!lowerCase.equals("id")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_id);
                                                                }
                                                                break;
                                                            case 3356:
                                                                if (!lowerCase.equals("ie")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ie);
                                                                }
                                                                break;
                                                            case 3363:
                                                                if (!lowerCase.equals("il")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_il);
                                                                }
                                                                break;
                                                            case 3364:
                                                                if (!lowerCase.equals("im")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_im);
                                                                }
                                                                break;
                                                            case 3365:
                                                                if (!lowerCase.equals(Argument.IN)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_in);
                                                                }
                                                                break;
                                                            case 3366:
                                                                if (!lowerCase.equals("io")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_io);
                                                                }
                                                                break;
                                                            case 3368:
                                                                if (!lowerCase.equals("iq")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_iq);
                                                                }
                                                                break;
                                                            case 3369:
                                                                if (!lowerCase.equals("ir")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ir);
                                                                }
                                                                break;
                                                            case 3370:
                                                                if (!lowerCase.equals("is")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_is);
                                                                }
                                                                break;
                                                            case 3371:
                                                                if (!lowerCase.equals("it")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_it);
                                                                }
                                                                break;
                                                            case 3387:
                                                                if (!lowerCase.equals("je")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_je);
                                                                }
                                                                break;
                                                            case 3395:
                                                                if (!lowerCase.equals("jm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_jm);
                                                                }
                                                                break;
                                                            case 3397:
                                                                if (!lowerCase.equals("jo")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_jo);
                                                                }
                                                                break;
                                                            case 3398:
                                                                if (!lowerCase.equals("jp")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_jp);
                                                                }
                                                                break;
                                                            case 3418:
                                                                if (!lowerCase.equals("ke")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ke);
                                                                }
                                                                break;
                                                            case 3420:
                                                                if (!lowerCase.equals("kg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kg);
                                                                }
                                                                break;
                                                            case 3421:
                                                                if (!lowerCase.equals("kh")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kh);
                                                                }
                                                                break;
                                                            case 3422:
                                                                if (!lowerCase.equals("ki")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ki);
                                                                }
                                                                break;
                                                            case 3426:
                                                                if (!lowerCase.equals(SportAnalytics.ParamValue.MapButtonType.KM)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_km);
                                                                }
                                                                break;
                                                            case 3427:
                                                                if (!lowerCase.equals("kn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kn);
                                                                }
                                                                break;
                                                            case 3429:
                                                                if (!lowerCase.equals("kp")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kp);
                                                                }
                                                                break;
                                                            case 3431:
                                                                if (!lowerCase.equals("kr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kr);
                                                                }
                                                                break;
                                                            case 3436:
                                                                if (!lowerCase.equals("kw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kw);
                                                                }
                                                                break;
                                                            case 3438:
                                                                if (!lowerCase.equals("ky")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ky);
                                                                }
                                                                break;
                                                            case 3439:
                                                                if (!lowerCase.equals("kz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_kz);
                                                                }
                                                                break;
                                                            case 3445:
                                                                if (!lowerCase.equals(Constants.JSON_LANGUAGE)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_la);
                                                                }
                                                                break;
                                                            case 3446:
                                                                if (!lowerCase.equals("lb")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lb);
                                                                }
                                                                break;
                                                            case 3447:
                                                                if (!lowerCase.equals("lc")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lc);
                                                                }
                                                                break;
                                                            case 3453:
                                                                if (!lowerCase.equals("li")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_li);
                                                                }
                                                                break;
                                                            case 3455:
                                                                if (!lowerCase.equals("lk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lk);
                                                                }
                                                                break;
                                                            case 3462:
                                                                if (!lowerCase.equals("lr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lr);
                                                                }
                                                                break;
                                                            case 3463:
                                                                if (!lowerCase.equals("ls")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ls);
                                                                }
                                                                break;
                                                            case 3464:
                                                                if (!lowerCase.equals("lt")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lt);
                                                                }
                                                                break;
                                                            case 3465:
                                                                if (!lowerCase.equals("lu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lu);
                                                                }
                                                                break;
                                                            case 3466:
                                                                if (!lowerCase.equals("lv")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_lv);
                                                                }
                                                                break;
                                                            case 3469:
                                                                if (!lowerCase.equals("ly")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ly);
                                                                }
                                                                break;
                                                            case 3476:
                                                                if (!lowerCase.equals("ma")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ma);
                                                                }
                                                                break;
                                                            case 3478:
                                                                if (!lowerCase.equals("mc")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mc);
                                                                }
                                                                break;
                                                            case 3479:
                                                                if (!lowerCase.equals(BuildConfig.WX_NAME)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_md);
                                                                }
                                                                break;
                                                            case 3480:
                                                                if (!lowerCase.equals(TournamentShareDialogURIBuilder.me)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_me);
                                                                }
                                                                break;
                                                            case 3481:
                                                                if (!lowerCase.equals("mf")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mf);
                                                                }
                                                                break;
                                                            case 3482:
                                                                if (!lowerCase.equals("mg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mg);
                                                                }
                                                                break;
                                                            case 3483:
                                                                if (!lowerCase.equals("mh")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mh);
                                                                }
                                                                break;
                                                            case 3486:
                                                                if (!lowerCase.equals("mk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mk);
                                                                }
                                                                break;
                                                            case 3487:
                                                                if (!lowerCase.equals("ml")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ml);
                                                                }
                                                                break;
                                                            case 3488:
                                                                if (!lowerCase.equals(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mm);
                                                                }
                                                                break;
                                                            case 3489:
                                                                if (!lowerCase.equals("mn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mn);
                                                                }
                                                                break;
                                                            case 3490:
                                                                if (!lowerCase.equals("mo")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mo);
                                                                }
                                                                break;
                                                            case 3491:
                                                                if (!lowerCase.equals(Constant.PAI_KEY_MEDIUM_ZONE_PAI)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mp);
                                                                }
                                                                break;
                                                            case 3492:
                                                                if (!lowerCase.equals("mq")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mq);
                                                                }
                                                                break;
                                                            case 3493:
                                                                if (!lowerCase.equals("mr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mr);
                                                                }
                                                                break;
                                                            case 3494:
                                                                if (!lowerCase.equals("ms")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ms);
                                                                }
                                                                break;
                                                            case 3495:
                                                                if (!lowerCase.equals("mt")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mt);
                                                                }
                                                                break;
                                                            case 3496:
                                                                if (!lowerCase.equals("mu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mu);
                                                                }
                                                                break;
                                                            case 3498:
                                                                if (!lowerCase.equals("mw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mw);
                                                                }
                                                                break;
                                                            case 3499:
                                                                if (!lowerCase.equals("mx")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mx);
                                                                }
                                                                break;
                                                            case AnimUtil.DURATION_LOADING /* 3500 */:
                                                                if (!lowerCase.equals("my")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_my);
                                                                }
                                                                break;
                                                            case 3501:
                                                                if (!lowerCase.equals("mz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_mz);
                                                                }
                                                                break;
                                                            case 3507:
                                                                if (!lowerCase.equals("na")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_na);
                                                                }
                                                                break;
                                                            case 3509:
                                                                if (!lowerCase.equals("nc")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_nc);
                                                                }
                                                                break;
                                                            case 3511:
                                                                if (!lowerCase.equals("ne")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ne);
                                                                }
                                                                break;
                                                            case 3512:
                                                                if (!lowerCase.equals("nf")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_nf);
                                                                }
                                                                break;
                                                            case 3513:
                                                                if (!lowerCase.equals("ng")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ng);
                                                                }
                                                                break;
                                                            case 3515:
                                                                if (!lowerCase.equals("ni")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ni);
                                                                }
                                                                break;
                                                            case 3518:
                                                                if (!lowerCase.equals("nl")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_nl);
                                                                }
                                                                break;
                                                            case 3521:
                                                                if (!lowerCase.equals("no")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_no);
                                                                }
                                                                break;
                                                            case 3522:
                                                                if (!lowerCase.equals("np")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_np);
                                                                }
                                                                break;
                                                            case 3524:
                                                                if (!lowerCase.equals("nr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_nr);
                                                                }
                                                                break;
                                                            case 3527:
                                                                if (!lowerCase.equals("nu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_nu);
                                                                }
                                                                break;
                                                            case 3532:
                                                                if (!lowerCase.equals("nz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_nz);
                                                                }
                                                                break;
                                                            case 3550:
                                                                if (!lowerCase.equals("om")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_om);
                                                                }
                                                                break;
                                                            case 3569:
                                                                if (!lowerCase.equals(b.k)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pa);
                                                                }
                                                                break;
                                                            case 3573:
                                                                if (!lowerCase.equals("pe")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pe);
                                                                }
                                                                break;
                                                            case 3574:
                                                                if (!lowerCase.equals(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pf);
                                                                }
                                                                break;
                                                            case 3575:
                                                                if (!lowerCase.equals("pg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pg);
                                                                }
                                                                break;
                                                            case 3576:
                                                                if (!lowerCase.equals(UserDataStore.PHONE)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ph);
                                                                }
                                                                break;
                                                            case 3579:
                                                                if (!lowerCase.equals("pk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pk);
                                                                }
                                                                break;
                                                            case 3580:
                                                                if (!lowerCase.equals("pl")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pl);
                                                                }
                                                                break;
                                                            case 3581:
                                                                if (!lowerCase.equals("pm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pm);
                                                                }
                                                                break;
                                                            case 3582:
                                                                if (!lowerCase.equals("pn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pn);
                                                                }
                                                                break;
                                                            case RaceId.RACE_RESUME_DSP /* 3586 */:
                                                                if (!lowerCase.equals("pr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pr);
                                                                }
                                                                break;
                                                            case RaceId.DSP_REALTIME_PEQ /* 3587 */:
                                                                if (!lowerCase.equals("ps")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ps);
                                                                }
                                                                break;
                                                            case 3588:
                                                                if (!lowerCase.equals("pt")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pt);
                                                                }
                                                                break;
                                                            case 3591:
                                                                if (!lowerCase.equals("pw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_pw);
                                                                }
                                                                break;
                                                            case 3593:
                                                                if (!lowerCase.equals("py")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_py);
                                                                }
                                                                break;
                                                            case 3600:
                                                                if (!lowerCase.equals("qa")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_qa);
                                                                }
                                                                break;
                                                            case 3635:
                                                                if (!lowerCase.equals("re")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_re);
                                                                }
                                                                break;
                                                            case 3645:
                                                                if (!lowerCase.equals(Language.RO)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ro);
                                                                }
                                                                break;
                                                            case 3649:
                                                                if (!lowerCase.equals("rs")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_rs);
                                                                }
                                                                break;
                                                            case 3651:
                                                                if (!lowerCase.equals(HealthStateCardView.LANGUAGE_RU)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ru);
                                                                }
                                                                break;
                                                            case 3653:
                                                                if (!lowerCase.equals("rw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_rw);
                                                                }
                                                                break;
                                                            case 3662:
                                                                if (!lowerCase.equals("sa")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sa);
                                                                }
                                                                break;
                                                            case 3663:
                                                                if (!lowerCase.equals(DataConstant.KEY_SLEEP_STATE)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sb);
                                                                }
                                                                break;
                                                            case 3664:
                                                                if (!lowerCase.equals("sc")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sc);
                                                                }
                                                                break;
                                                            case 3665:
                                                                if (!lowerCase.equals("sd")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sd);
                                                                }
                                                                break;
                                                            case 3666:
                                                                if (!lowerCase.equals(com.twitter.sdk.android.core.internal.scribe.b.b)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_se);
                                                                }
                                                                break;
                                                            case 3668:
                                                                if (!lowerCase.equals("sg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sg);
                                                                }
                                                                break;
                                                            case 3669:
                                                                if (!lowerCase.equals("sh")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sh);
                                                                }
                                                                break;
                                                            case 3670:
                                                                if (!lowerCase.equals("si")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_si);
                                                                }
                                                                break;
                                                            case 3671:
                                                                if (!lowerCase.equals("sj")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sj);
                                                                }
                                                                break;
                                                            case 3672:
                                                                if (!lowerCase.equals("sk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sk);
                                                                }
                                                                break;
                                                            case 3673:
                                                                if (!lowerCase.equals("sl")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sl);
                                                                }
                                                                break;
                                                            case 3674:
                                                                if (!lowerCase.equals("sm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sm);
                                                                }
                                                                break;
                                                            case 3675:
                                                                if (!lowerCase.equals("sn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sn);
                                                                }
                                                                break;
                                                            case 3676:
                                                                if (!lowerCase.equals(Command.SCREEN_ON)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_so);
                                                                }
                                                                break;
                                                            case 3679:
                                                                if (!lowerCase.equals("sr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sr);
                                                                }
                                                                break;
                                                            case 3680:
                                                                if (!lowerCase.equals("ss")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ss);
                                                                }
                                                                break;
                                                            case 3681:
                                                                if (!lowerCase.equals(UserDataStore.STATE)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_st);
                                                                }
                                                                break;
                                                            case 3683:
                                                                if (!lowerCase.equals(a.r)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sv);
                                                                }
                                                                break;
                                                            case 3685:
                                                                if (!lowerCase.equals("sx")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sx);
                                                                }
                                                                break;
                                                            case 3686:
                                                                if (!lowerCase.equals("sy")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sy);
                                                                }
                                                                break;
                                                            case 3687:
                                                                if (!lowerCase.equals("sz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_sz);
                                                                }
                                                                break;
                                                            case 3695:
                                                                if (!lowerCase.equals("tc")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tc);
                                                                }
                                                                break;
                                                            case 3696:
                                                                if (!lowerCase.equals("td")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_td);
                                                                }
                                                                break;
                                                            case 3699:
                                                                if (!lowerCase.equals("tg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tg);
                                                                }
                                                                break;
                                                            case 3700:
                                                                if (!lowerCase.equals("th")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_th);
                                                                }
                                                                break;
                                                            case 3702:
                                                                if (!lowerCase.equals("tj")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tj);
                                                                }
                                                                break;
                                                            case 3703:
                                                                if (!lowerCase.equals(AuthHandler.c)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tk);
                                                                }
                                                                break;
                                                            case 3704:
                                                                if (!lowerCase.equals("tl")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tl);
                                                                }
                                                                break;
                                                            case 3705:
                                                                if (!lowerCase.equals("tm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tm);
                                                                }
                                                                break;
                                                            case 3706:
                                                                if (!lowerCase.equals("tn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tn);
                                                                }
                                                                break;
                                                            case 3707:
                                                                if (!lowerCase.equals("to")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_to);
                                                                }
                                                                break;
                                                            case 3710:
                                                                if (!lowerCase.equals("tr")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tr);
                                                                }
                                                                break;
                                                            case 3712:
                                                                if (!lowerCase.equals(com.google.android.exoplayer2.text.ttml.b.n)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tt);
                                                                }
                                                                break;
                                                            case 3714:
                                                                if (!lowerCase.equals(Configs.Params.TV)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tv);
                                                                }
                                                                break;
                                                            case 3715:
                                                                if (!lowerCase.equals("tw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tw);
                                                                }
                                                                break;
                                                            case 3718:
                                                                if (!lowerCase.equals("tz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_tz);
                                                                }
                                                                break;
                                                            case 3724:
                                                                if (!lowerCase.equals("ua")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ua);
                                                                }
                                                                break;
                                                            case 3730:
                                                                if (!lowerCase.equals("ug")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ug);
                                                                }
                                                                break;
                                                            case 3736:
                                                                if (!lowerCase.equals("um")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_um);
                                                                }
                                                                break;
                                                            case 3742:
                                                                if (!lowerCase.equals(Configs.Params.US)) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_us);
                                                                }
                                                                break;
                                                            case 3748:
                                                                if (!lowerCase.equals("uy")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_uy);
                                                                }
                                                                break;
                                                            case 3749:
                                                                if (!lowerCase.equals("uz")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_uz);
                                                                }
                                                                break;
                                                            case 3755:
                                                                if (!lowerCase.equals("va")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_va);
                                                                }
                                                                break;
                                                            case 3757:
                                                                if (!lowerCase.equals("vc")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_vc);
                                                                }
                                                                break;
                                                            case 3759:
                                                                if (!lowerCase.equals("ve")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ve);
                                                                }
                                                                break;
                                                            case 3761:
                                                                if (!lowerCase.equals("vg")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_vg);
                                                                }
                                                                break;
                                                            case 3763:
                                                                if (!lowerCase.equals("vi")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_vi);
                                                                }
                                                                break;
                                                            case 3768:
                                                                if (!lowerCase.equals("vn")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_vn);
                                                                }
                                                                break;
                                                            case 3775:
                                                                if (!lowerCase.equals("vu")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_vu);
                                                                }
                                                                break;
                                                            case 3791:
                                                                if (!lowerCase.equals("wf")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_wf);
                                                                }
                                                                break;
                                                            case 3804:
                                                                if (!lowerCase.equals("ws")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ws);
                                                                }
                                                                break;
                                                            case 3827:
                                                                if (!lowerCase.equals("xk")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_xk);
                                                                }
                                                                break;
                                                            case 3852:
                                                                if (!lowerCase.equals("ye")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_ye);
                                                                }
                                                                break;
                                                            case 3867:
                                                                if (!lowerCase.equals("yt")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_yt);
                                                                }
                                                                break;
                                                            case 3879:
                                                                if (!lowerCase.equals("za")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_za);
                                                                }
                                                                break;
                                                            case 3891:
                                                                if (!lowerCase.equals("zm")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_zm);
                                                                }
                                                                break;
                                                            case 3901:
                                                                if (!lowerCase.equals("zw")) {
                                                                    numValueOf = null;
                                                                } else {
                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_zw);
                                                                }
                                                                break;
                                                            default:
                                                                switch (lowerCase) {
                                                                    case 3121:
                                                                        if (!lowerCase.equals("ar")) {
                                                                            numValueOf = null;
                                                                        } else {
                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_ar);
                                                                        }
                                                                        break;
                                                                    case 3122:
                                                                        if (!lowerCase.equals(Constant.PAI_KEY_ACTIVITY_SCORES)) {
                                                                            numValueOf = null;
                                                                        } else {
                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_as);
                                                                        }
                                                                        break;
                                                                    case 3123:
                                                                        if (!lowerCase.equals("at")) {
                                                                            numValueOf = null;
                                                                        } else {
                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_at);
                                                                        }
                                                                        break;
                                                                    case 3124:
                                                                        if (!lowerCase.equals("au")) {
                                                                            numValueOf = null;
                                                                        } else {
                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_au);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (lowerCase) {
                                                                            case 3146:
                                                                                if (!lowerCase.equals("bl")) {
                                                                                    numValueOf = null;
                                                                                } else {
                                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bl);
                                                                                }
                                                                                break;
                                                                            case 3147:
                                                                                if (!lowerCase.equals("bm")) {
                                                                                    numValueOf = null;
                                                                                } else {
                                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bm);
                                                                                }
                                                                                break;
                                                                            case 3148:
                                                                                if (!lowerCase.equals("bn")) {
                                                                                    numValueOf = null;
                                                                                } else {
                                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bn);
                                                                                }
                                                                                break;
                                                                            case 3149:
                                                                                if (!lowerCase.equals("bo")) {
                                                                                    numValueOf = null;
                                                                                } else {
                                                                                    numValueOf = Integer.valueOf(R.string.account_ui_region_bo);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (lowerCase) {
                                                                                    case 3151:
                                                                                        if (!lowerCase.equals("bq")) {
                                                                                            numValueOf = null;
                                                                                        } else {
                                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_bq);
                                                                                        }
                                                                                        break;
                                                                                    case 3152:
                                                                                        if (!lowerCase.equals(com.google.android.exoplayer2.text.ttml.b.t)) {
                                                                                            numValueOf = null;
                                                                                        } else {
                                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_br);
                                                                                        }
                                                                                        break;
                                                                                    case 3153:
                                                                                        if (!lowerCase.equals("bs")) {
                                                                                            numValueOf = null;
                                                                                        } else {
                                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_bs);
                                                                                        }
                                                                                        break;
                                                                                    case 3154:
                                                                                        if (!lowerCase.equals("bt")) {
                                                                                            numValueOf = null;
                                                                                        } else {
                                                                                            numValueOf = Integer.valueOf(R.string.account_ui_region_bt);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        numValueOf = null;
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                }
                                            } else if (lowerCase.equals("cd")) {
                                                numValueOf = Integer.valueOf(R.string.account_ui_region_cd);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (lowerCase.equals("cc")) {
                                            numValueOf = Integer.valueOf(R.string.account_ui_region_cc);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (lowerCase.equals("bz")) {
                                        numValueOf = Integer.valueOf(R.string.account_ui_region_bz);
                                    } else {
                                        numValueOf = null;
                                    }
                                } else if (lowerCase.equals("by")) {
                                    numValueOf = Integer.valueOf(R.string.account_ui_region_by);
                                } else {
                                    numValueOf = null;
                                }
                            } else if (lowerCase.equals("bb")) {
                                numValueOf = Integer.valueOf(R.string.account_ui_region_bb);
                            } else {
                                numValueOf = null;
                            }
                        } else if (lowerCase.equals("ba")) {
                            numValueOf = Integer.valueOf(R.string.account_ui_region_ba);
                        } else {
                            numValueOf = null;
                        }
                    } else if (lowerCase.equals("ax")) {
                        numValueOf = Integer.valueOf(R.string.account_ui_region_ax);
                    } else {
                        numValueOf = null;
                    }
                } else if (lowerCase.equals("aw")) {
                    numValueOf = Integer.valueOf(R.string.account_ui_region_aw);
                } else {
                    numValueOf = null;
                }
            } else if (lowerCase.equals("am")) {
                numValueOf = Integer.valueOf(R.string.account_ui_region_am);
            } else {
                numValueOf = null;
            }
        } else if (lowerCase.equals("al")) {
            numValueOf = Integer.valueOf(R.string.account_ui_region_al);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return "UNKNOWN";
        }
        String string = AccountExternalsKt.getAppContext().getString(numValueOf.intValue());
        return string == null ? "UNKNOWN" : string;
    }
}
