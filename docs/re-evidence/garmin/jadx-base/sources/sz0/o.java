package sz0;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import c22.c3;
import c22.l3;
import c22.s3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import f72.a3;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v62.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f161466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f161467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f161468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f161469e;

        static {
            int[] iArr = new int[vz0.b.values().length];
            try {
                iArr[vz0.b.GROUP_JOIN_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vz0.b.GROUP_INVITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f161465a = iArr;
            int[] iArr2 = new int[ue0.c.values().length];
            try {
                iArr2[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f161466b = iArr2;
            int[] iArr3 = new int[uz0.k.values().length];
            try {
                iArr3[uz0.k.ALL_ACTIVITY_TYPE_PRIVACY_UPDATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[uz0.k.ACTIVITY_TYPE_PRIVACY_UPDATE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[uz0.k.ALL_ACTIVITY_TYPE_PRIVACY_UPDATE_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[uz0.k.ACTIVITY_TYPE_PRIVACY_UPDATE_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[uz0.k.AUTHORIZED_VIEWER_REMINDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[uz0.k.GEAR_END_OF_LIFE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[uz0.k.LIVETRACK_CONTACT_ACCEPT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[uz0.k.LIVETRACK_CONTACT_DECLINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[uz0.k.LIVETRACK_CONTACT_SMS_OPTOUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[uz0.k.MESSENGER_LIVETRACK_RECIPIENT_INVITE_ACCEPTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[uz0.k.MESSENGER_LIVETRACK_RECIPIENT_ACCOUNT_DELETED.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[uz0.k.MESSENGER_LIVETRACK_SENDER_ACCOUNT_DELETED.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[uz0.k.MESSENGER_LIVETRACK_SENDER_SMS_REMOVED.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[uz0.k.SHAREABLE_EVENT_UPDATED.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[uz0.k.SHAREABLE_EVENT_COURSE_UPDATED.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[uz0.k.SHAREABLE_EVENT_DELETED.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[uz0.k.TRAINING_NEW_PREMIUM_CONTENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[uz0.k.TRAINING_PLAN_PROGRESS_REPORT_AVAILABLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[uz0.k.EXCLUSIVE_DISCOUNTS.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[uz0.k.NEW_EXCLUSIVE_OFFERS.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[uz0.k.COMMENTED_ON_USER_ACTIVITY.ordinal()] = 21;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[uz0.k.TAGGED_ON_ACTIVITY_COMMENT.ordinal()] = 22;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[uz0.k.COMMENTED_ON_ACTIVITY_THREAD.ordinal()] = 23;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[uz0.k.CONNECTION_REQUEST_ACCEPTED.ordinal()] = 24;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[uz0.k.LIKED_ON_ACTIVITY.ordinal()] = 25;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[uz0.k.LIKED_ON_ACTIVITY_COMMENT.ordinal()] = 26;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[uz0.k.GROUP_NEWS_POST.ordinal()] = 27;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[uz0.k.COMMENTED_ON_GROUP_NEWS_POST.ordinal()] = 28;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[uz0.k.ALSO_COMMENTED_ON_GROUP_NEWS_POST.ordinal()] = 29;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[uz0.k.PRIVATE_GROUP_REQUEST_ACCEPTED.ordinal()] = 30;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[uz0.k.GROUP_INVITE_ACCEPTED.ordinal()] = 31;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[uz0.k.LIKED_ON_GROUP_POST.ordinal()] = 32;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[uz0.k.LIKED_ON_GROUP_POST_COMMENT.ordinal()] = 33;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[uz0.k.GROUP_ANNOUNCEMENT.ordinal()] = 34;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[uz0.k.AUTHORIZED_VIEWER_ACCEPTED.ordinal()] = 35;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[uz0.k.AUTHORIZED_VIEWER_DECLINED.ordinal()] = 36;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[uz0.k.AUTHORIZED_VIEWER_ENDED.ordinal()] = 37;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[uz0.k.AUTHORIZED_VIEWER_REMOVED.ordinal()] = 38;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[uz0.k.AUTHORIZED_VIEWER_RECEIVED.ordinal()] = 39;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[uz0.k.COMMENTED_ON_GROUP_ACTIVITY.ordinal()] = 40;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[uz0.k.ALSO_COMMENTED_ON_GROUP_ACTIVITY.ordinal()] = 41;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[uz0.k.LIKED_ON_GROUP_ACTIVITY.ordinal()] = 42;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr3[uz0.k.LIKED_ON_GROUP_ACTIVITY_COMMENT.ordinal()] = 43;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[uz0.k.FOLLOWED.ordinal()] = 44;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[uz0.k.FOLLOWING_REQUEST_ACCEPTED.ordinal()] = 45;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[uz0.k.MANAGED_ACCOUNTS_APPROVAL_REQUEST_RECEIVED.ordinal()] = 46;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr3[uz0.k.MANAGED_ACCOUNTS_ADMIN_REVOKED_CONSENT.ordinal()] = 47;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr3[uz0.k.MANAGED_ACCOUNTS_ADMIN_GRANTED_CONSENT.ordinal()] = 48;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr3[uz0.k.MANAGED_ACCOUNTS_CHILD_REVOKED_CONSENT.ordinal()] = 49;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr3[uz0.k.MANAGED_ACCOUNTS_CHILD_GRADUATED.ordinal()] = 50;
            } catch (NoSuchFieldError unused54) {
            }
            f161467c = iArr3;
            int[] iArr4 = new int[gg1.o0.values().length];
            try {
                iArr4[gg1.o0.STATUTE_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr4[gg1.o0.STATUTE_UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr4[gg1.o0.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused57) {
            }
            f161468d = iArr4;
            int[] iArr5 = new int[c80.w.values().length];
            try {
                iArr5[c80.w.Distance.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr5[c80.w.Duration.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr5[c80.w.Date.ordinal()] = 3;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr5[c80.w.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused61) {
            }
            f161469e = iArr5;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"sz0/o$b", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends MetricAffectingSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f161470a;

        public b(Typeface typeface) {
            this.f161470a = typeface;
        }

        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setTypeface(this.f161470a);
        }

        @Override // android.text.style.MetricAffectingSpan
        public final void updateMeasureState(TextPaint textPaint) {
            textPaint.getClass();
            textPaint.setTypeface(this.f161470a);
        }
    }

    public static final void a(uz0.j jVar, String... strArr) {
        List<String> listY;
        for (String str : strArr) {
            if (str != null && z0.m(str) != null && (listY = jVar.y()) != null) {
                listY.add(str);
            }
        }
    }

    public static final CharSequence b(Context context, String str, String... strArr) {
        context.getClass();
        Typeface typefaceA = h22.a.a("font/roboto_medium.ttf", context);
        if (typefaceA != null) {
            SpannableString spannableString = new SpannableString(str);
            for (String str2 : strArr) {
                int iH = d53.w.H(str, str2, 0, false, 6);
                Integer numValueOf = Integer.valueOf(iH);
                if (iH < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    spannableString.setSpan(new b(typefaceA), iIntValue, str2.length() + iIntValue, 33);
                }
            }
            return spannableString;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x019a  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x020f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0228  */
    /* JADX WARN: Code duplicated, block: B:139:0x022e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0234  */
    /* JADX WARN: Code duplicated, block: B:145:0x0248  */
    /* JADX WARN: Code duplicated, block: B:148:0x024f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0257  */
    /* JADX WARN: Code duplicated, block: B:152:0x025e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0266  */
    /* JADX WARN: Code duplicated, block: B:156:0x026d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0278  */
    /* JADX WARN: Code duplicated, block: B:160:0x027f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0287  */
    /* JADX WARN: Code duplicated, block: B:163:0x028d  */
    /* JADX WARN: Code duplicated, block: B:164:0x028f  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02de  */
    /* JADX WARN: Code duplicated, block: B:184:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:188:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:191:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:192:0x0304  */
    /* JADX WARN: Code duplicated, block: B:195:0x030b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0313  */
    /* JADX WARN: Code duplicated, block: B:198:0x0319  */
    /* JADX WARN: Code duplicated, block: B:199:0x031b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0331  */
    /* JADX WARN: Code duplicated, block: B:209:0x034c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0365  */
    /* JADX WARN: Code duplicated, block: B:219:0x036b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0371  */
    /* JADX WARN: Code duplicated, block: B:224:0x0380  */
    /* JADX WARN: Code duplicated, block: B:225:0x0388  */
    /* JADX WARN: Code duplicated, block: B:227:0x038e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0396  */
    /* JADX WARN: Code duplicated, block: B:230:0x039c  */
    /* JADX WARN: Code duplicated, block: B:231:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:233:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:234:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:236:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:237:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:239:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:240:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:250:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:258:0x041e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0436  */
    /* JADX WARN: Code duplicated, block: B:260:0x044e  */
    /* JADX WARN: Code duplicated, block: B:264:0x045a  */
    /* JADX WARN: Code duplicated, block: B:269:0x0467  */
    /* JADX WARN: Code duplicated, block: B:277:0x048e  */
    /* JADX WARN: Code duplicated, block: B:281:0x049a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:293:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:298:0x04da  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:303:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:308:0x0502  */
    /* JADX WARN: Code duplicated, block: B:316:0x051b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:320:0x0527  */
    /* JADX WARN: Code duplicated, block: B:325:0x0534  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:333:0x055b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:334:0x055c  */
    /* JADX WARN: Code duplicated, block: B:335:0x0574  */
    /* JADX WARN: Code duplicated, block: B:336:0x058c  */
    /* JADX WARN: Code duplicated, block: B:337:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:338:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:340:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:341:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:344:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:352:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:354:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:355:0x0603  */
    /* JADX WARN: Code duplicated, block: B:358:0x060a  */
    /* JADX WARN: Code duplicated, block: B:366:0x0634  */
    /* JADX WARN: Code duplicated, block: B:368:0x063a  */
    /* JADX WARN: Code duplicated, block: B:369:0x063f  */
    /* JADX WARN: Code duplicated, block: B:378:0x065f  */
    /* JADX WARN: Code duplicated, block: B:380:0x0665  */
    /* JADX WARN: Code duplicated, block: B:389:0x068f  */
    /* JADX WARN: Code duplicated, block: B:391:0x0695  */
    /* JADX WARN: Code duplicated, block: B:399:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:406:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:408:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:409:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:412:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:420:0x0721  */
    /* JADX WARN: Code duplicated, block: B:422:0x0727  */
    /* JADX WARN: Code duplicated, block: B:423:0x072c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0733  */
    /* JADX WARN: Code duplicated, block: B:434:0x075d  */
    /* JADX WARN: Code duplicated, block: B:436:0x0763  */
    /* JADX WARN: Code duplicated, block: B:437:0x0768  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:446:0x0788  */
    /* JADX WARN: Code duplicated, block: B:448:0x078e  */
    /* JADX WARN: Code duplicated, block: B:457:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:464:0x07de  */
    /* JADX WARN: Code duplicated, block: B:466:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:467:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:470:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:476:0x0817  */
    /* JADX WARN: Code duplicated, block: B:478:0x082f  */
    /* JADX WARN: Code duplicated, block: B:479:0x0847  */
    /* JADX WARN: Code duplicated, block: B:481:0x084d  */
    /* JADX WARN: Code duplicated, block: B:482:0x0852  */
    /* JADX WARN: Code duplicated, block: B:485:0x0867  */
    /* JADX WARN: Code duplicated, block: B:486:0x086c  */
    /* JADX WARN: Code duplicated, block: B:490:0x0875  */
    /* JADX WARN: Code duplicated, block: B:493:0x087c  */
    /* JADX WARN: Code duplicated, block: B:498:0x0894  */
    /* JADX WARN: Code duplicated, block: B:500:0x089a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:502:0x08a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:503:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:504:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:506:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:508:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:511:0x08de  */
    /* JADX WARN: Code duplicated, block: B:512:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:514:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:516:0x0903  */
    /* JADX WARN: Code duplicated, block: B:519:0x090d  */
    /* JADX WARN: Code duplicated, block: B:520:0x0919  */
    /* JADX WARN: Code duplicated, block: B:522:0x0931  */
    /* JADX WARN: Code duplicated, block: B:523:0x093d  */
    /* JADX WARN: Code duplicated, block: B:530:0x095b  */
    /* JADX WARN: Code duplicated, block: B:532:0x0961  */
    /* JADX WARN: Code duplicated, block: B:535:0x0976  */
    /* JADX WARN: Code duplicated, block: B:537:0x0981  */
    /* JADX WARN: Code duplicated, block: B:539:0x098c  */
    /* JADX WARN: Code duplicated, block: B:541:0x0992  */
    /* JADX WARN: Code duplicated, block: B:545:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:549:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:551:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:553:0x09df  */
    /* JADX WARN: Code duplicated, block: B:555:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:564:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:569:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:618:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:619:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:621:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:623:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:625:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:627:0x0c24  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:635:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:637:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:639:0x0c72  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c7e  */
    /* JADX WARN: Code duplicated, block: B:649:0x0cb8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:651:0x0cbb  */
    /* JADX WARN: Code duplicated, block: B:653:0x0cbe  */
    /* JADX WARN: Code duplicated, block: B:655:0x0cc9  */
    /* JADX WARN: Code duplicated, block: B:657:0x0ccc  */
    /* JADX WARN: Code duplicated, block: B:659:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:661:0x0cd2  */
    /* JADX WARN: Code duplicated, block: B:664:0x0cd7  */
    /* JADX WARN: Code duplicated, block: B:666:0x0cdb  */
    /* JADX WARN: Code duplicated, block: B:676:0x0d1d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:687:0x0d76  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:711:0x0e21  */
    /* JADX WARN: Code duplicated, block: B:712:0x0e24  */
    /* JADX WARN: Code duplicated, block: B:713:0x0e30  */
    /* JADX WARN: Code duplicated, block: B:714:0x0e3c  */
    /* JADX WARN: Code duplicated, block: B:716:0x0e44  */
    /* JADX WARN: Code duplicated, block: B:718:0x0e67  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:720:0x0e6d  */
    /* JADX WARN: Code duplicated, block: B:721:0x0e72  */
    /* JADX WARN: Code duplicated, block: B:728:0x0e8b  */
    /* JADX WARN: Code duplicated, block: B:736:0x0f15  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:741:0x0f2a  */
    /* JADX WARN: Code duplicated, block: B:752:0x0f73  */
    /* JADX WARN: Code duplicated, block: B:754:0x0f80  */
    /* JADX WARN: Code duplicated, block: B:756:0x0f88  */
    /* JADX WARN: Code duplicated, block: B:760:0x0fb1  */
    /* JADX WARN: Code duplicated, block: B:761:0x0fb7  */
    /* JADX WARN: Code duplicated, block: B:764:0x0fc9  */
    /* JADX WARN: Code duplicated, block: B:766:0x0ce5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x0189  */
    public static final NotificationItem.Activity c(uz0.g gVar, Context context, Boolean bool, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        int iValueOf;
        Integer num;
        uz0.k kVarI;
        int i14;
        uz0.j jVarH;
        c80.u uVarA;
        u4.d dVarA;
        String strG0;
        u4.d dVar;
        b12.b bVar;
        String str;
        String imageUrl;
        String strF;
        uz0.k kVarI2;
        int i15;
        boolean z14;
        uz0.k kVarI3;
        int i16;
        CharSequence string;
        uz0.j jVarH2;
        List<String> listY;
        uz0.j jVarH3;
        uz0.j jVarH4;
        List<String> listY2;
        ArrayList arrayList;
        Iterator<T> it;
        x0 x0VarM;
        String strA;
        c3 c3Var;
        uz0.j jVarH5;
        uz0.j jVarH6;
        String strF0;
        String string2;
        uz0.j jVarH7;
        c80.w wVar;
        int i17;
        String strC0;
        Double dF;
        String string3;
        String strE0;
        Long lJ;
        String strA0;
        String strI0;
        uz0.j jVarH8;
        List listW;
        String string4;
        String strN0;
        uz0.l lVarA0;
        String string5;
        uz0.j jVarH9;
        String strZ;
        String strD;
        String string6;
        String strD2;
        String strConcat;
        uz0.j jVarH10;
        String strF2;
        String strA2;
        uz0.j jVarH11;
        String strF3;
        boolean z15;
        String strD3;
        String string7;
        uz0.j jVarH12;
        String strF4;
        String strF5;
        String string8;
        uz0.j jVarH13;
        String strD4;
        uz0.j jVarH14;
        String strP0;
        String string9;
        uz0.j jVarH15;
        String strK0;
        uz0.j jVarH16;
        String strK1;
        uz0.j jVarH17;
        String strK2;
        uz0.j jVarH18;
        String strK3;
        uz0.j jVarH19;
        String strK4;
        uz0.j jVarH20;
        String strK5;
        uz0.j jVarH21;
        String strK6;
        uz0.j jVarH22;
        String strP1;
        String string10;
        uz0.j jVarH23;
        String strK7;
        uz0.j jVarH24;
        String strK8;
        uz0.j jVarH25;
        String strK9;
        uz0.j jVarH26;
        String strA3;
        uz0.j jVarH27;
        String strK10;
        uz0.j jVarH28;
        String strK11;
        uz0.j jVarH29;
        String strD5;
        uz0.j jVarH30;
        String strK12;
        uz0.j jVarH31;
        String strF6;
        uz0.j jVarH32;
        String strK13;
        uz0.j jVarH33;
        String strD6;
        uz0.j jVarH34;
        String strF7;
        uz0.j jVarH35;
        String strK14;
        uz0.j jVarH36;
        String strK15;
        uz0.j jVarH37;
        String strK16;
        uz0.j jVarH38;
        String strK17;
        uz0.j jVarH39;
        String strD7;
        uz0.j jVarH40;
        String strK18;
        String strG;
        String string11;
        String string12;
        uz0.j jVarH41;
        String string13;
        String strC;
        uz0.j jVarH42;
        String strC2;
        String strG2;
        String string14;
        uz0.j jVarH43;
        String strZ2;
        uz0.j jVarH44;
        String strF8;
        uz0.j jVarH45;
        String strK19;
        String strG3;
        String string15;
        int i18;
        String string16;
        uz0.j jVarH46;
        String strZ3;
        String strG4;
        String string17;
        uz0.j jVarH47;
        String strC3;
        uz0.j jVarH48;
        String strF9;
        uz0.j jVarH49;
        String strK20;
        Boolean boolJ;
        boolean z16;
        uz0.j jVarH50;
        String strC4;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        gVar.getClass();
        context.getClass();
        DateTime dateTimeL = c22.j0.L(gVar.getDateTimeString(), "yyyy-MM-dd HH:mm:ss", DateTimeZone.UTC);
        b63.o oVarB = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        String strQ = dateTimeL != null ? xy2.b.q(context, dateTimeL, false, 28) : null;
        String strQ2 = dateTimeL != null ? xy2.b.q(context, dateTimeL, true, 12) : null;
        uz0.k kVarI4 = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        int i19 = kVarI4 == null ? -1 : a.f161467c[kVarI4.ordinal()];
        if (i19 == 1 || i19 == 2) {
            iValueOf = 2131232700;
        } else {
            if (i19 != 3 && i19 != 4) {
                if (i19 != 5) {
                    num = null;
                } else {
                    iValueOf = Integer.valueOf(R.drawable.ic_icon_grey_circle_family_account);
                }
                kVarI = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                if (kVarI == null) {
                    i14 = -1;
                } else {
                    i14 = a.f161467c[kVarI.ordinal()];
                }
                switch (i14) {
                    case 6:
                        jVarH = gVar.getRelativeNameValue();
                        if (jVarH != null || (strG0 = jVarH.getGearType()) == null) {
                            uVarA = null;
                        } else {
                            c80.u.INSTANCE.getClass();
                            uVarA = c80.u.Companion.a(strG0);
                        }
                        if (uVarA != null || (dVarA = uVarA.getF25613a()) == null) {
                            dVarA = x3.a(o72.t.B(s62.a.f157643a));
                        }
                        dVar = dVarA;
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        dVarA = a3.a(oc.b.o(s62.a.f157643a));
                        dVar = dVarA;
                        break;
                    default:
                        dVar = null;
                        break;
                }
                str = "";
                bVar = new b12.b(((lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (imageUrl = profileImageUrls.getF46879h()) == null) && (imageUrl = gVar.getImageUrl()) == null) ? "" : imageUrl, num, null, null, null, 28, null);
                strF = gVar.getFullName();
                if (strF == null) {
                    strF = "";
                }
                kVarI2 = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                if (kVarI2 == null) {
                    i15 = -1;
                } else {
                    i15 = a.f161467c[kVarI2.ordinal()];
                }
                switch (i15) {
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        z14 = false;
                        break;
                    default:
                        z14 = true;
                        break;
                }
                kVarI3 = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                if (kVarI3 == null) {
                    i16 = -1;
                } else {
                    i16 = a.f161467c[kVarI3.ordinal()];
                }
                switch (i16) {
                    case -1:
                        p92.y.f136664a.getClass();
                        p92.y.a.c("NotificationsAdapterUtils", "Either api returned null for NotificationType or unsupported type is not filtered in the upstream");
                        return null;
                    case 0:
                    default:
                        u0.r();
                        return null;
                    case 1:
                        PrivacyType.Companion companion = PrivacyType.INSTANCE;
                        uz0.j jVarH51 = gVar.getRelativeNameValue();
                        String string18 = context.getString(PrivacyType.Companion.b(companion, jVarH51 != null ? jVarH51.getPrivacySetting() : null).getF28797a());
                        string18.getClass();
                        string = context.getString(R.string.all_activity_privacy_notification_success, string18);
                        string.getClass();
                        CharSequence charSequence = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 2:
                        jVarH2 = gVar.getRelativeNameValue();
                        if (jVarH2 != null) {
                            listY = jVarH2.y();
                        } else {
                            listY = null;
                        }
                        if (listY == null && (jVarH5 = gVar.getRelativeNameValue()) != null) {
                            jVarH5.C0(new ArrayList());
                            Unit unit = Unit.INSTANCE;
                        }
                        jVarH3 = gVar.getRelativeNameValue();
                        if (jVarH3 != null) {
                            a(jVarH3, gVar.getRelativeNameValue().getActivityType0(), gVar.getRelativeNameValue().getActivityType1(), gVar.getRelativeNameValue().getActivityType2(), gVar.getRelativeNameValue().getActivityType3(), gVar.getRelativeNameValue().getActivityType4(), gVar.getRelativeNameValue().getActivityType5(), gVar.getRelativeNameValue().getActivityType6(), gVar.getRelativeNameValue().getActivityType7(), gVar.getRelativeNameValue().getActivityType8(), gVar.getRelativeNameValue().getActivityType9(), gVar.getRelativeNameValue().getActivityType10(), gVar.getRelativeNameValue().getActivityType11());
                            Unit unit2 = Unit.INSTANCE;
                        }
                        jVarH4 = gVar.getRelativeNameValue();
                        if (jVarH4 != null && (listY2 = jVarH4.y()) != null) {
                            arrayList = new ArrayList(p13.y.r(listY2, 10));
                            it = listY2.iterator();
                            while (it.hasNext()) {
                                x0VarM = z0.m((String) it.next());
                                if (x0VarM != null || (c3Var = x0VarM.f4360c) == null) {
                                    strA = null;
                                } else {
                                    strA = dh.b.A(context, c3Var);
                                }
                                arrayList.add(strA);
                            }
                            arrayList2 = arrayList;
                        }
                        if (arrayList2 == null && (!arrayList2.isEmpty())) {
                            string = arrayList2.size() > 2 ? context.getString(R.string.specific_past_two_activity_types_notification_success, p13.h0.k0(p13.h0.V(1, arrayList2), ", ", null, null, null, 62), p13.h0.m0(arrayList2)) : context.getString(R.string.specific_past_activity_type_notification_success, p13.h0.b0(arrayList2));
                        } else {
                            string = context.getString(R.string.specific_past_activity_type_notification_success, "");
                        }
                        string.getClass();
                        CharSequence charSequence2 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence2, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 3:
                        PrivacyType.Companion companion2 = PrivacyType.INSTANCE;
                        uz0.j jVarH52 = gVar.getRelativeNameValue();
                        String string19 = context.getString(PrivacyType.Companion.b(companion2, jVarH52 != null ? jVarH52.getPrivacySetting() : null).getF28797a());
                        string19.getClass();
                        string = context.getString(R.string.all_past_activity_privacy_notification_failed, string19);
                        string.getClass();
                        CharSequence charSequence3 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence3, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 4:
                        string = context.getString(R.string.specific_past_activity_type_notification_failed);
                        string.getClass();
                        CharSequence charSequence4 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence4, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 5:
                        string = context.getString(R.string.you_have_authorized_viewers);
                        string.getClass();
                        CharSequence charSequence5 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence5, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 6:
                        jVarH6 = gVar.getRelativeNameValue();
                        if (jVarH6 != null || (strF0 = jVarH6.getGearName()) == null) {
                            strF0 = "";
                        }
                        string2 = context.getString(R.string.pn_reached_maximum_usage_for_gear, strF0);
                        string2.getClass();
                        jVarH7 = gVar.getRelativeNameValue();
                        if (jVarH7 != null || (strI0 = jVarH7.getGearUsageType()) == null) {
                            wVar = null;
                        } else {
                            wVar = (c80.w) n63.b.f123892d.c(new c80.x(), "\"" + strI0 + "\"");
                        }
                        if (wVar == null) {
                            i17 = -1;
                        } else {
                            i17 = a.f161469e[wVar.ordinal()];
                        }
                        if (i17 == -1) {
                            string = string2;
                        } else if (i17 != 1) {
                            strC0 = gVar.getRelativeNameValue().getGearMaxDistance();
                            if (strC0 != null || (dF = d53.s.f(strC0)) == null) {
                                string = string2;
                            } else {
                                double dDoubleValue = dF.doubleValue();
                                gg1.o0 o0VarG = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).g();
                                NumberFormat numberInstance = NumberFormat.getNumberInstance();
                                numberInstance.setMinimumFractionDigits(1);
                                numberInstance.setMaximumFractionDigits(1);
                                int i24 = a.f161468d[o0VarG.ordinal()];
                                if (i24 == 1 || i24 == 2) {
                                    l3.f23124b.getClass();
                                    double dL = l3.a.l(dDoubleValue);
                                    String str2 = numberInstance.format(dL);
                                    String string20 = dL == 1.0d ? context.getString(R.string.common_mile) : context.getString(R.string.common_lbl_miles);
                                    string20.getClass();
                                    string3 = context.getString(R.string.value_unit, str2, string20);
                                } else {
                                    if (i24 != 3) {
                                        u0.r();
                                        return null;
                                    }
                                    l3.f23124b.getClass();
                                    double dK = l3.a.k(dDoubleValue);
                                    String str3 = numberInstance.format(dK);
                                    String string21 = dK == 1.0d ? context.getString(R.string.lbl_kilometer_lower) : context.getString(R.string.common_lbl_kilometers);
                                    string21.getClass();
                                    string3 = context.getString(R.string.value_unit, str3, string21);
                                }
                                string3.getClass();
                                string = context.getString(R.string.reached_maximum_distance_num_for_item, string3, strF0);
                                if (string == null) {
                                    string = string2;
                                }
                            }
                        } else if (i17 != 2) {
                            if (i17 != 3) {
                                strA0 = gVar.getRelativeNameValue().getGearMaxDate();
                                if (strA0 != null) {
                                    try {
                                        oVarB = b63.o.Companion.b(b63.o.INSTANCE, strA0);
                                    } catch (Exception e4) {
                                        String strD8 = com.airbnb.lottie.animation.keyframe.a.d(e4, "Failed to parse date for gear inbox notification: ");
                                        i2.a aVar = i2.f36769a;
                                        a2 a2Var = a2.GENERAL;
                                        aVar.getClass();
                                        i2.a.p(a2Var, "NotificationsAdapterUtils", strD8);
                                    }
                                    if (oVarB != null || (string = context.getString(R.string.reached_maximum_date_num_for_item, new pi0.e(context).d(g22.l.h(oVarB), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY), strF0)) == null) {
                                    }
                                }
                            } else if (i17 != 4) {
                                u0.r();
                                return null;
                            }
                            string = string2;
                            break;
                        } else {
                            strE0 = gVar.getRelativeNameValue().getGearMaxDuration();
                            if (strE0 != null || (lJ = d53.t.j(strE0)) == null) {
                                string = string2;
                            } else {
                                long jLongValue = lJ.longValue();
                                e53.c.a aVar2 = e53.c.f63094b;
                                long j8 = e53.c.j(e53.e.f(jLongValue, e53.f.SECONDS), e53.f.HOURS);
                                String str4 = NumberFormat.getIntegerInstance().format(j8);
                                String string22 = j8 == 1 ? context.getString(R.string.lbl_plural_one_hour, str4) : context.getString(R.string.lbl_plural_more_than_one_hour, str4);
                                string22.getClass();
                                string = context.getString(R.string.reached_maximum_duration_num_for_item, string22, strF0);
                                if (string == null) {
                                    string = string2;
                                }
                            }
                        }
                        CharSequence charSequence6 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence6, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 7:
                        uz0.j jVarH53 = gVar.getRelativeNameValue();
                        string = context.getString(R.string.pn_livetrack_contact_accept_format, jVarH53 != null ? jVarH53.H() : null);
                        string.getClass();
                        CharSequence charSequence7 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence7, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 8:
                        uz0.j jVarH54 = gVar.getRelativeNameValue();
                        string = context.getString(R.string.pn_livetrack_contact_decline_format, jVarH54 != null ? jVarH54.H() : null);
                        string.getClass();
                        CharSequence charSequence8 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence8, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 9:
                        uz0.j jVarH55 = gVar.getRelativeNameValue();
                        string = context.getString(R.string.pn_livetrack_contact_sms_optout_format, jVarH55 != null ? jVarH55.H() : null);
                        string.getClass();
                        CharSequence charSequence9 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence9, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 10:
                        uz0.j jVarH56 = gVar.getRelativeNameValue();
                        string = context.getString(R.string.pn_messenger_livetrack_recipient_invite_accepted_format, jVarH56 != null ? jVarH56.H() : null);
                        string.getClass();
                        CharSequence charSequence10 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence10, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 11:
                        uz0.j jVarH57 = gVar.getRelativeNameValue();
                        string = context.getString(R.string.pn_messenger_livetrack_recipient_account_deleted_format, jVarH57 != null ? jVarH57.H() : null);
                        string.getClass();
                        CharSequence charSequence11 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 12:
                    case 13:
                        string = context.getString(R.string.pn_messenger_livetrack_sender_account_deleted_format);
                        string.getClass();
                        CharSequence charSequence12 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence12, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 14:
                        jVarH8 = gVar.getRelativeNameValue();
                        if (jVarH8 != null || (strN0 = jVarH8.getModifiedNames()) == null) {
                            listW = null;
                        } else {
                            listW = d53.w.W(strN0, new String[]{","});
                        }
                        if (gVar.getRelativeNameValue() != null || listW == null || listW.isEmpty()) {
                            p92.y.f136664a.getClass();
                            p92.y.a.c("NotificationsAdapterUtils", "Api returned null in modified event notification");
                            return null;
                        }
                        if (listW.size() == 1) {
                            String str5 = (String) listW.get(0);
                            if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_DATE.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_date_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_TIME.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_start_time_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_LOCATION.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_location_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_WEBSITE.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_website_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_NAME.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_name_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_TYPE.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_type_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.EVENT_NOTES.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_notes_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else if (p005kotlin.jvm.internal.s.g(str5, vz0.c.COMPLETION_TARGET.getF180889a())) {
                                string4 = context.getString(R.string.event_notification_duration_changed, gVar.getRelativeNameValue().getEventName());
                                string4.getClass();
                            } else {
                                string4 = "";
                            }
                        } else {
                            string4 = context.getString(R.string.event_notification_multiple_changes, gVar.getRelativeNameValue().getEventName());
                            string4.getClass();
                        }
                        String strK21 = gVar.getRelativeNameValue().getGroupName();
                        string = b(context, string4, strF, strK21 != null ? strK21 : "");
                        CharSequence charSequence13 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence13, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 15:
                        if (gVar.getRelativeNameValue() != null) {
                            p92.y.f136664a.getClass();
                            p92.y.a.c("NotificationsAdapterUtils", "Api returned null for course update notification");
                            return null;
                        }
                        String string23 = context.getString(R.string.event_notification_course_changed, gVar.getRelativeNameValue().getEventName());
                        string23.getClass();
                        String strK22 = gVar.getRelativeNameValue().getGroupName();
                        string = b(context, string23, strF, strK22 != null ? strK22 : "");
                        CharSequence charSequence14 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence14, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 16:
                        if (gVar.getRelativeNameValue() != null) {
                            p92.y.f136664a.getClass();
                            p92.y.a.c("NotificationsAdapterUtils", "Api returned null for event deleted notification");
                            return null;
                        }
                        String string24 = context.getString(R.string.event_notification_event_deleted, gVar.getRelativeNameValue().getEventName());
                        string24.getClass();
                        String strK23 = gVar.getRelativeNameValue().getGroupName();
                        string = b(context, string24, strF, strK23 != null ? strK23 : "");
                        CharSequence charSequence15 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence15, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 17:
                        if (gVar.getRelativeNameValue() != null) {
                            p92.y.f136664a.getClass();
                            p92.y.a.c("NotificationsAdapterUtils", "Api returned null for premium content notification");
                            return null;
                        }
                        lVarA0 = gVar.getRelativeNameValue().getTrainingType();
                        if (lVarA0 != null || (string5 = context.getString(lVarA0.getF173587b())) == null) {
                            string5 = context.getString(R.string.garmin_coach_plan);
                            string5.getClass();
                        }
                        String string25 = context.getString(R.string.new_training_guidance_available, string5);
                        string25.getClass();
                        String strK24 = gVar.getRelativeNameValue().getGroupName();
                        string = b(context, string25, strF, strK24 != null ? strK24 : "");
                        CharSequence charSequence16 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence16, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 18:
                        if (gVar.getRelativeNameValue() != null) {
                            p92.y.f136664a.getClass();
                            p92.y.a.c("NotificationsAdapterUtils", "Error occurred getting notification values for Training plan progress report");
                            return null;
                        }
                        String string26 = context.getString(R.string.final_report_inbox_notification);
                        string26.getClass();
                        String strK25 = gVar.getRelativeNameValue().getGroupName();
                        string = b(context, string26, strF, strK25 != null ? strK25 : "");
                        CharSequence charSequence17 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence17, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 19:
                        jVarH9 = gVar.getRelativeNameValue();
                        if (jVarH9 != null && (strZ = jVarH9.getExclusiveOfferOffer()) != null) {
                            str = strZ;
                        }
                        string = context.getString(R.string.pn_exclusive_discounts_format, str);
                        string.getClass();
                        CharSequence charSequence18 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence18, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 20:
                        string = context.getString(R.string.pn_new_exclusive_offers_format);
                        string.getClass();
                        CharSequence charSequence19 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence19, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 21:
                        uz0.j jVarH58 = gVar.getRelativeNameValue();
                        strD = jVarH58 != null ? jVarH58.getCommentText() : null;
                        if (g22.n.d(strD)) {
                            string6 = context.getString(R.string.pn_commented_on_activity_with_text, strF, strD);
                        } else {
                            string6 = context.getString(R.string.lbl_commented_on_your_activity, strF);
                        }
                        string6.getClass();
                        string = b(context, string6, strF);
                        CharSequence charSequence110 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 22:
                        uz0.j jVarH59 = gVar.getRelativeNameValue();
                        strD2 = jVarH59 != null ? jVarH59.getCommentText() : null;
                        if (g22.n.d(strD2)) {
                            strConcat = context.getString(R.string.pn_someone_tagged_you, strF, strD2);
                        } else {
                            strConcat = strF.concat(" tagged you in a comment.");
                        }
                        strConcat.getClass();
                        string = b(context, strConcat, strF);
                        CharSequence charSequence111 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 23:
                        jVarH10 = gVar.getRelativeNameValue();
                        if (jVarH10 != null) {
                            strF2 = jVarH10.getActivityName();
                        } else {
                            strF2 = null;
                        }
                        strA2 = new mn.a(new l22.a(context)).a(strF2);
                        jVarH11 = gVar.getRelativeNameValue();
                        if (jVarH11 != null) {
                            strF3 = jVarH11.getActivityName();
                        } else {
                            strF3 = null;
                        }
                        z15 = strF3 != null || strF3.length() == 0;
                        uz0.j jVarH60 = gVar.getRelativeNameValue();
                        strD3 = jVarH60 != null ? jVarH60.getCommentText() : null;
                        if (!g22.n.d(strD3) && !z15) {
                            string7 = context.getString(R.string.pn_commented_on_activity_thread_with_text, strF, strA2, strD3);
                        } else if (!g22.n.d(strD3) && z15) {
                            string7 = context.getString(R.string.pn_commented_on_group_activity_thread_without_activity_name_format, strF, strD3);
                        } else if (z15) {
                            string7 = context.getString(R.string.lbl_also_commented_on_an_activity, strF);
                        } else {
                            string7 = context.getString(R.string.lbl_commented_on, strF, strA2);
                        }
                        string7.getClass();
                        string = b(context, string7, strF);
                        CharSequence charSequence112 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 24:
                        String string27 = context.getString(R.string.pn_connection_request_accepted_message, strF);
                        string27.getClass();
                        string = b(context, string27, strF);
                        CharSequence charSequence113 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 25:
                        jVarH12 = gVar.getRelativeNameValue();
                        if (jVarH12 != null) {
                            strF4 = jVarH12.getActivityName();
                        } else {
                            strF4 = null;
                        }
                        String strA4 = new mn.a(new l22.a(context)).a(strF4);
                        uz0.j jVarH61 = gVar.getRelativeNameValue();
                        strF5 = jVarH61 != null ? jVarH61.getActivityName() : null;
                        if (strF5 != null || strF5.length() == 0) {
                            string8 = context.getString(R.string.pn_group_activity_is_liked_with_dot, strF);
                        } else {
                            string8 = context.getString(R.string.pn_activity_is_liked_with_dot, strF, strA4);
                        }
                        string8.getClass();
                        string = b(context, string8, strF);
                        CharSequence charSequence114 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 26:
                        jVarH13 = gVar.getRelativeNameValue();
                        if (jVarH13 != null && (strD4 = jVarH13.getCommentText()) != null) {
                            str = strD4;
                        }
                        String string28 = context.getString(R.string.pn_comment_is_liked, strF, str);
                        string28.getClass();
                        string = b(context, string28, strF);
                        CharSequence charSequence115 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 27:
                        jVarH14 = gVar.getRelativeNameValue();
                        if (jVarH14 != null) {
                            strP0 = jVarH14.getNewsPostText();
                        } else {
                            strP0 = null;
                        }
                        if (strP0 != null || d53.w.J(strP0)) {
                            uz0.j jVarH62 = gVar.getRelativeNameValue();
                            string9 = context.getString(R.string.pn_inbox_group_new_post_without_text, strF, jVarH62 != null ? jVarH62.getGroupName() : null);
                        } else {
                            uz0.j jVarH63 = gVar.getRelativeNameValue();
                            string9 = context.getString(R.string.pn_inbox_group_new_post, strF, jVarH63 != null ? jVarH63.getGroupName() : null, strP0);
                        }
                        string9.getClass();
                        jVarH15 = gVar.getRelativeNameValue();
                        if (jVarH15 != null && (strK0 = jVarH15.getGroupName()) != null) {
                            str = strK0;
                        }
                        string = b(context, string9, strF, str);
                        CharSequence charSequence116 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 28:
                        jVarH16 = gVar.getRelativeNameValue();
                        if (jVarH16 != null) {
                            strK1 = jVarH16.getGroupName();
                        } else {
                            strK1 = null;
                        }
                        uz0.j jVarH64 = gVar.getRelativeNameValue();
                        String string29 = context.getString(R.string.pn_inbox_commented_on_group_post, strF, strK1, jVarH64 != null ? jVarH64.getCommentText() : null);
                        string29.getClass();
                        jVarH17 = gVar.getRelativeNameValue();
                        if (jVarH17 != null && (strK2 = jVarH17.getGroupName()) != null) {
                            str = strK2;
                        }
                        string = b(context, string29, strF, str);
                        CharSequence charSequence117 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 29:
                        jVarH18 = gVar.getRelativeNameValue();
                        if (jVarH18 != null) {
                            strK3 = jVarH18.getGroupName();
                        } else {
                            strK3 = null;
                        }
                        uz0.j jVarH65 = gVar.getRelativeNameValue();
                        String string30 = context.getString(R.string.pn_inbox_also_commented_on_group_post, strF, strK3, jVarH65 != null ? jVarH65.getCommentText() : null);
                        string30.getClass();
                        jVarH19 = gVar.getRelativeNameValue();
                        if (jVarH19 != null && (strK4 = jVarH19.getGroupName()) != null) {
                            str = strK4;
                        }
                        string = b(context, string30, strF, str);
                        CharSequence charSequence118 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 30:
                        jVarH20 = gVar.getRelativeNameValue();
                        if (jVarH20 != null && (strK5 = jVarH20.getGroupName()) != null) {
                            str = strK5;
                        }
                        String string31 = context.getString(R.string.pn_member_request_accepted_with_group_name, strF, str);
                        string31.getClass();
                        string = b(context, string31, strF, str);
                        CharSequence charSequence119 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 31:
                        uz0.j jVarH66 = gVar.getRelativeNameValue();
                        String string32 = context.getString(R.string.pn_group_invite_accepted, strF, jVarH66 != null ? jVarH66.getGroupName() : null);
                        string32.getClass();
                        jVarH21 = gVar.getRelativeNameValue();
                        if (jVarH21 != null && (strK6 = jVarH21.getGroupName()) != null) {
                            str = strK6;
                        }
                        string = b(context, string32, strF, str);
                        CharSequence charSequence1110 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 32:
                        jVarH22 = gVar.getRelativeNameValue();
                        if (jVarH22 != null) {
                            strP1 = jVarH22.getNewsPostText();
                        } else {
                            strP1 = null;
                        }
                        if (strP1 != null || d53.w.J(strP1)) {
                            uz0.j jVarH67 = gVar.getRelativeNameValue();
                            string10 = context.getString(R.string.social_inbox_post_without_text_liked, strF, jVarH67 != null ? jVarH67.getGroupName() : null);
                        } else {
                            uz0.j jVarH68 = gVar.getRelativeNameValue();
                            string10 = context.getString(R.string.social_inbox_post_liked, strF, jVarH68 != null ? jVarH68.getGroupName() : null, strP1);
                        }
                        string10.getClass();
                        jVarH23 = gVar.getRelativeNameValue();
                        if (jVarH23 != null && (strK7 = jVarH23.getGroupName()) != null) {
                            str = strK7;
                        }
                        string = b(context, string10, strF, str);
                        CharSequence charSequence1111 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 33:
                        jVarH24 = gVar.getRelativeNameValue();
                        if (jVarH24 != null) {
                            strK8 = jVarH24.getGroupName();
                        } else {
                            strK8 = null;
                        }
                        uz0.j jVarH69 = gVar.getRelativeNameValue();
                        String string33 = context.getString(R.string.social_inbox_group_comment_liked, strF, strK8, jVarH69 != null ? jVarH69.getCommentText() : null);
                        string33.getClass();
                        jVarH25 = gVar.getRelativeNameValue();
                        if (jVarH25 != null && (strK9 = jVarH25.getGroupName()) != null) {
                            str = strK9;
                        }
                        string = b(context, string33, strF, str);
                        CharSequence charSequence1112 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 34:
                        jVarH26 = gVar.getRelativeNameValue();
                        if (jVarH26 != null) {
                            strA3 = jVarH26.getAnnouncementText();
                        } else {
                            strA3 = null;
                        }
                        uz0.j jVarH70 = gVar.getRelativeNameValue();
                        String string34 = context.getString(R.string.pn_inbox_group_announcement, strF, jVarH70 != null ? jVarH70.getGroupName() : null, strA3);
                        string34.getClass();
                        jVarH27 = gVar.getRelativeNameValue();
                        if (jVarH27 != null && (strK10 = jVarH27.getGroupName()) != null) {
                            str = strK10;
                        }
                        string = b(context, string34, strF, str);
                        CharSequence charSequence1113 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 35:
                        String string35 = context.getString(R.string.name_accepted_request_authorized_viewer, strF);
                        string35.getClass();
                        string = b(context, string35, strF);
                        CharSequence charSequence1114 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 36:
                        String string36 = context.getString(R.string.name_declined_request_authorized_viewer, strF);
                        string36.getClass();
                        string = b(context, string36, strF);
                        CharSequence charSequence1115 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 37:
                        String string37 = context.getString(R.string.name_no_longer_authorized_viewer, strF);
                        string37.getClass();
                        string = b(context, string37, strF);
                        CharSequence charSequence1116 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 38:
                        String string38 = context.getString(R.string.name_removed_you_authorized_viewer, strF);
                        string38.getClass();
                        string = b(context, string38, strF);
                        CharSequence charSequence1117 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 39:
                        return null;
                    case 40:
                        jVarH28 = gVar.getRelativeNameValue();
                        if (jVarH28 != null || (strK11 = jVarH28.getGroupName()) == null) {
                            strK11 = "";
                        }
                        jVarH29 = gVar.getRelativeNameValue();
                        if (jVarH29 != null || (strD5 = jVarH29.getCommentText()) == null) {
                            strD5 = "";
                        }
                        String string39 = context.getString(R.string.pn_inbox_commented_on_group_activity, strF, strK11, strD5);
                        string39.getClass();
                        jVarH30 = gVar.getRelativeNameValue();
                        if (jVarH30 != null && (strK12 = jVarH30.getGroupName()) != null) {
                            str = strK12;
                        }
                        string = b(context, string39, strF, str);
                        CharSequence charSequence1118 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 41:
                        jVarH31 = gVar.getRelativeNameValue();
                        if (jVarH31 != null || (strF6 = jVarH31.getActivityName()) == null) {
                            strF6 = "";
                        }
                        jVarH32 = gVar.getRelativeNameValue();
                        if (jVarH32 != null || (strK13 = jVarH32.getGroupName()) == null) {
                            strK13 = "";
                        }
                        jVarH33 = gVar.getRelativeNameValue();
                        if (jVarH33 != null || (strD6 = jVarH33.getCommentText()) == null) {
                            strD6 = "";
                        }
                        String string40 = context.getString(R.string.pn_inbox_also_commented_on_group_activity, strF, strF6, strK13, strD6);
                        string40.getClass();
                        jVarH34 = gVar.getRelativeNameValue();
                        if (jVarH34 != null || (strF7 = jVarH34.getActivityName()) == null) {
                            strF7 = "";
                        }
                        jVarH35 = gVar.getRelativeNameValue();
                        if (jVarH35 != null && (strK14 = jVarH35.getGroupName()) != null) {
                            str = strK14;
                        }
                        string = b(context, string40, strF, strF7, str);
                        CharSequence charSequence1119 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence1119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 42:
                        jVarH36 = gVar.getRelativeNameValue();
                        if (jVarH36 != null || (strK15 = jVarH36.getGroupName()) == null) {
                            strK15 = "";
                        }
                        String string41 = context.getString(R.string.social_inbox_group_activity_liked, strF, strK15);
                        string41.getClass();
                        jVarH37 = gVar.getRelativeNameValue();
                        if (jVarH37 != null && (strK16 = jVarH37.getGroupName()) != null) {
                            str = strK16;
                        }
                        string = b(context, string41, strF, str);
                        CharSequence charSequence11110 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 43:
                        jVarH38 = gVar.getRelativeNameValue();
                        if (jVarH38 != null || (strK17 = jVarH38.getGroupName()) == null) {
                            strK17 = "";
                        }
                        jVarH39 = gVar.getRelativeNameValue();
                        if (jVarH39 != null || (strD7 = jVarH39.getCommentText()) == null) {
                            strD7 = "";
                        }
                        String string42 = context.getString(R.string.social_inbox_group_comment_liked, strF, strK17, strD7);
                        string42.getClass();
                        jVarH40 = gVar.getRelativeNameValue();
                        if (jVarH40 != null && (strK18 = jVarH40.getGroupName()) != null) {
                            str = strK18;
                        }
                        string = b(context, string42, strF, str);
                        CharSequence charSequence11111 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 44:
                        String string43 = context.getString(R.string.msg_started_following_you, strF);
                        string43.getClass();
                        string = b(context, string43, strF);
                        CharSequence charSequence11112 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 45:
                        String string44 = context.getString(R.string.follow_request_accepted_message, strF);
                        string44.getClass();
                        string = b(context, string44, strF);
                        CharSequence charSequence11113 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 46:
                        uz0.j jVarH71 = gVar.getRelativeNameValue();
                        strG = jVarH71 != null ? jVarH71.getConsentType() : null;
                        if (strG == null) {
                            strG = "";
                        }
                        string11 = d53.w.i0(strG).toString();
                        if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_LIVETRACK")) {
                            string12 = context.getString(R.string.title_live_track);
                        } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                            string12 = context.getString(R.string.lbl_adaptive_training_plan);
                        } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_UPLOAD")) {
                            string12 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                        } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_INSIGHTS")) {
                            string12 = context.getString(R.string.title_insights);
                        } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                            string12 = context.getString(R.string.lbl_auto_activity_detection);
                        } else if (p005kotlin.jvm.internal.s.g(string11, q92.x.DI_CONNECT_CIQ_PRIVACY.f143819a)) {
                            string12 = context.getString(R.string.lbl_connect_iq_privacy_policy);
                        } else {
                            string12 = "";
                        }
                        string12.getClass();
                        if (p005kotlin.jvm.internal.s.g(string11, q92.x.DI_CONNECT_CIQ_PRIVACY.f143819a)) {
                            jVarH42 = gVar.getRelativeNameValue();
                            if (jVarH42 != null && (strC2 = jVarH42.getChildName()) != null) {
                                str = strC2;
                            }
                            string13 = context.getString(R.string.pn_review_and_approval_requested, str, string12);
                        } else {
                            jVarH41 = gVar.getRelativeNameValue();
                            if (jVarH41 != null && (strC = jVarH41.getChildName()) != null) {
                                str = strC;
                            }
                            string13 = context.getString(R.string.pn_permission_requested, str, string12);
                        }
                        string13.getClass();
                        string = b(context, string13, new String[0]);
                        CharSequence charSequence11114 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 47:
                        uz0.j jVarH72 = gVar.getRelativeNameValue();
                        strG2 = jVarH72 != null ? jVarH72.getConsentType() : null;
                        if (strG2 == null) {
                            strG2 = "";
                        }
                        switch (d53.w.i0(strG2).toString()) {
                            case "DI_CONNECT_ADAPTIVE_TRAINING_PLAN":
                                string14 = context.getString(R.string.lbl_adaptive_training_plan);
                                break;
                            case "DI_CONNECT_LIVETRACK":
                                string14 = context.getString(R.string.title_live_track);
                                break;
                            case "DI_CONNECT_AUTO_ACTIVITY_DETECTION":
                                string14 = context.getString(R.string.lbl_auto_activity_detection);
                                break;
                            case "DI_CONNECT_INSIGHTS":
                                string14 = context.getString(R.string.title_insights);
                                break;
                            case "DI_CONNECT_UPLOAD":
                                string14 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                                break;
                            default:
                                string14 = "";
                                break;
                        }
                        string14.getClass();
                        jVarH43 = gVar.getRelativeNameValue();
                        if (jVarH43 != null || (strZ2 = jVarH43.getAdminName()) == null) {
                            strZ2 = "";
                        }
                        String string45 = context.getString(R.string.pn_permission_revoked, strZ2, string14);
                        string45.getClass();
                        jVarH44 = gVar.getRelativeNameValue();
                        if (jVarH44 != null || (strF8 = jVarH44.getActivityName()) == null) {
                            strF8 = "";
                        }
                        jVarH45 = gVar.getRelativeNameValue();
                        if (jVarH45 != null && (strK19 = jVarH45.getGroupName()) != null) {
                            str = strK19;
                        }
                        string = b(context, string45, strF, strF8, str);
                        CharSequence charSequence11115 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 48:
                        uz0.j jVarH73 = gVar.getRelativeNameValue();
                        strG3 = jVarH73 != null ? jVarH73.getConsentType() : null;
                        if (strG3 == null) {
                            strG3 = "";
                        }
                        string15 = d53.w.i0(strG3).toString();
                        i18 = R.string.pn_permission_granted;
                        switch (string15) {
                            case "DI_CONNECT_ADAPTIVE_TRAINING_PLAN":
                                string16 = context.getString(R.string.lbl_adaptive_training_plan);
                                break;
                            case "DI_CONNECT_LIVETRACK":
                                string16 = context.getString(R.string.title_live_track);
                                break;
                            case "DI_CONNECT_AUTO_ACTIVITY_DETECTION":
                                string16 = context.getString(R.string.lbl_auto_activity_detection);
                                i18 = R.string.pn_aad_permission_granted;
                                break;
                            case "DI_CONNECT_INSIGHTS":
                                string16 = context.getString(R.string.title_insights);
                                break;
                            case "DI_CONNECT_UPLOAD":
                                string16 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                                break;
                            default:
                                string16 = "";
                                break;
                        }
                        string16.getClass();
                        jVarH46 = gVar.getRelativeNameValue();
                        if (jVarH46 != null && (strZ3 = jVarH46.getAdminName()) != null) {
                            str = strZ3;
                        }
                        String string46 = context.getString(i18, str, string16);
                        string46.getClass();
                        string = b(context, string46, new String[0]);
                        CharSequence charSequence11116 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 49:
                        uz0.j jVarH74 = gVar.getRelativeNameValue();
                        strG4 = jVarH74 != null ? jVarH74.getConsentType() : null;
                        if (strG4 == null) {
                            strG4 = "";
                        }
                        switch (d53.w.i0(strG4).toString()) {
                            case "DI_CONNECT_ADAPTIVE_TRAINING_PLAN":
                                string17 = context.getString(R.string.lbl_adaptive_training_plan);
                                break;
                            case "DI_CONNECT_LIVETRACK":
                                string17 = context.getString(R.string.title_live_track);
                                break;
                            case "DI_CONNECT_AUTO_ACTIVITY_DETECTION":
                                string17 = context.getString(R.string.lbl_auto_activity_detection);
                                break;
                            case "DI_CONNECT_INSIGHTS":
                                string17 = context.getString(R.string.title_insights);
                                break;
                            case "DI_CONNECT_UPLOAD":
                                string17 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                                break;
                            default:
                                string17 = "";
                                break;
                        }
                        string17.getClass();
                        jVarH47 = gVar.getRelativeNameValue();
                        if (jVarH47 != null || (strC3 = jVarH47.getChildName()) == null) {
                            strC3 = "";
                        }
                        String string47 = context.getString(R.string.pn_permission_child_revoked, strC3, string17);
                        string47.getClass();
                        jVarH48 = gVar.getRelativeNameValue();
                        if (jVarH48 != null || (strF9 = jVarH48.getActivityName()) == null) {
                            strF9 = "";
                        }
                        jVarH49 = gVar.getRelativeNameValue();
                        if (jVarH49 != null && (strK20 = jVarH49.getGroupName()) != null) {
                            str = strK20;
                        }
                        string = b(context, string47, strF, strF9, str);
                        CharSequence charSequence11117 = string;
                        if (bool == null) {
                            boolJ = gVar.getViewed();
                        } else {
                            boolJ = bool;
                        }
                        return new NotificationItem.Activity(bVar, charSequence11117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                    case 50:
                        s3.f23252a.getClass();
                        if (!s3.c() || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("child_account_graduation_ui_enabled")) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        bv.b.f21239a.getClass();
                        if (((kd0.m) bv.b.a()).l().r() && z16) {
                            jVarH50 = gVar.getRelativeNameValue();
                            if (jVarH50 != null && (strC4 = jVarH50.getChildName()) != null) {
                                strF = strC4;
                            }
                            String string48 = context.getString(R.string.you_are_no_longer_admin_for, strF);
                            string48.getClass();
                            string = b(context, string48, new String[0]);
                            CharSequence charSequence11118 = string;
                            if (bool == null) {
                                boolJ = gVar.getViewed();
                            } else {
                                boolJ = bool;
                            }
                            return new NotificationItem.Activity(bVar, charSequence11118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                        }
                        return null;
                }
            }
            iValueOf = 2131232699;
        }
        num = iValueOf;
        kVarI = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        if (kVarI == null) {
            i14 = -1;
        } else {
            i14 = a.f161467c[kVarI.ordinal()];
        }
        switch (i14) {
            case 6:
                jVarH = gVar.getRelativeNameValue();
                if (jVarH != null) {
                    uVarA = null;
                } else {
                    uVarA = null;
                }
                if (uVarA != null) {
                    dVarA = x3.a(o72.t.B(s62.a.f157643a));
                } else {
                    dVarA = x3.a(o72.t.B(s62.a.f157643a));
                }
                dVar = dVarA;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                dVarA = a3.a(oc.b.o(s62.a.f157643a));
                dVar = dVarA;
                break;
            default:
                dVar = null;
                break;
        }
        str = "";
        bVar = new b12.b(((lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (imageUrl = profileImageUrls.getF46879h()) == null) && (imageUrl = gVar.getImageUrl()) == null) ? "" : imageUrl, num, null, null, null, 28, null);
        strF = gVar.getFullName();
        if (strF == null) {
            strF = "";
        }
        kVarI2 = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        if (kVarI2 == null) {
            i15 = -1;
        } else {
            i15 = a.f161467c[kVarI2.ordinal()];
        }
        switch (i15) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                z14 = false;
                break;
            default:
                z14 = true;
                break;
        }
        kVarI3 = gVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        if (kVarI3 == null) {
            i16 = -1;
        } else {
            i16 = a.f161467c[kVarI3.ordinal()];
        }
        switch (i16) {
            case -1:
                p92.y.f136664a.getClass();
                p92.y.a.c("NotificationsAdapterUtils", "Either api returned null for NotificationType or unsupported type is not filtered in the upstream");
                return null;
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                PrivacyType.Companion companion3 = PrivacyType.INSTANCE;
                uz0.j jVarH510 = gVar.getRelativeNameValue();
                String string110 = context.getString(PrivacyType.Companion.b(companion3, jVarH510 != null ? jVarH510.getPrivacySetting() : null).getF28797a());
                string110.getClass();
                string = context.getString(R.string.all_activity_privacy_notification_success, string110);
                string.getClass();
                CharSequence charSequence11119 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 2:
                jVarH2 = gVar.getRelativeNameValue();
                if (jVarH2 != null) {
                    listY = jVarH2.y();
                } else {
                    listY = null;
                }
                if (listY == null) {
                    jVarH5.C0(new ArrayList());
                    Unit unit3 = Unit.INSTANCE;
                }
                jVarH3 = gVar.getRelativeNameValue();
                if (jVarH3 != null) {
                    a(jVarH3, gVar.getRelativeNameValue().getActivityType0(), gVar.getRelativeNameValue().getActivityType1(), gVar.getRelativeNameValue().getActivityType2(), gVar.getRelativeNameValue().getActivityType3(), gVar.getRelativeNameValue().getActivityType4(), gVar.getRelativeNameValue().getActivityType5(), gVar.getRelativeNameValue().getActivityType6(), gVar.getRelativeNameValue().getActivityType7(), gVar.getRelativeNameValue().getActivityType8(), gVar.getRelativeNameValue().getActivityType9(), gVar.getRelativeNameValue().getActivityType10(), gVar.getRelativeNameValue().getActivityType11());
                    Unit unit4 = Unit.INSTANCE;
                }
                jVarH4 = gVar.getRelativeNameValue();
                if (jVarH4 != null) {
                    arrayList = new ArrayList(p13.y.r(listY2, 10));
                    it = listY2.iterator();
                    while (it.hasNext()) {
                        x0VarM = z0.m((String) it.next());
                        if (x0VarM != null) {
                            strA = null;
                        } else {
                            strA = null;
                        }
                        arrayList.add(strA);
                    }
                    arrayList2 = arrayList;
                }
                if (arrayList2 == null) {
                    string = context.getString(R.string.specific_past_activity_type_notification_success, "");
                } else {
                    string = context.getString(R.string.specific_past_activity_type_notification_success, "");
                }
                string.getClass();
                CharSequence charSequence111110 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 3:
                PrivacyType.Companion companion4 = PrivacyType.INSTANCE;
                uz0.j jVarH511 = gVar.getRelativeNameValue();
                String string111 = context.getString(PrivacyType.Companion.b(companion4, jVarH511 != null ? jVarH511.getPrivacySetting() : null).getF28797a());
                string111.getClass();
                string = context.getString(R.string.all_past_activity_privacy_notification_failed, string111);
                string.getClass();
                CharSequence charSequence111111 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 4:
                string = context.getString(R.string.specific_past_activity_type_notification_failed);
                string.getClass();
                CharSequence charSequence111112 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 5:
                string = context.getString(R.string.you_have_authorized_viewers);
                string.getClass();
                CharSequence charSequence111113 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 6:
                jVarH6 = gVar.getRelativeNameValue();
                if (jVarH6 != null) {
                    strF0 = "";
                } else {
                    strF0 = "";
                }
                string2 = context.getString(R.string.pn_reached_maximum_usage_for_gear, strF0);
                string2.getClass();
                jVarH7 = gVar.getRelativeNameValue();
                if (jVarH7 != null) {
                    wVar = null;
                } else {
                    wVar = null;
                }
                if (wVar == null) {
                    i17 = -1;
                } else {
                    i17 = a.f161469e[wVar.ordinal()];
                }
                if (i17 == -1) {
                    string = string2;
                } else if (i17 != 1) {
                    strC0 = gVar.getRelativeNameValue().getGearMaxDistance();
                    if (strC0 != null) {
                        string = string2;
                    } else {
                        string = string2;
                    }
                } else if (i17 != 2) {
                    if (i17 != 3) {
                        strA0 = gVar.getRelativeNameValue().getGearMaxDate();
                        if (strA0 != null) {
                            oVarB = b63.o.Companion.b(b63.o.INSTANCE, strA0);
                            if (oVarB != null) {
                            }
                        }
                    } else if (i17 != 4) {
                        u0.r();
                        return null;
                    }
                    string = string2;
                    break;
                } else {
                    strE0 = gVar.getRelativeNameValue().getGearMaxDuration();
                    if (strE0 != null) {
                        string = string2;
                    } else {
                        string = string2;
                    }
                }
                CharSequence charSequence111114 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 7:
                uz0.j jVarH512 = gVar.getRelativeNameValue();
                string = context.getString(R.string.pn_livetrack_contact_accept_format, jVarH512 != null ? jVarH512.H() : null);
                string.getClass();
                CharSequence charSequence111115 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 8:
                uz0.j jVarH513 = gVar.getRelativeNameValue();
                string = context.getString(R.string.pn_livetrack_contact_decline_format, jVarH513 != null ? jVarH513.H() : null);
                string.getClass();
                CharSequence charSequence111116 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 9:
                uz0.j jVarH514 = gVar.getRelativeNameValue();
                string = context.getString(R.string.pn_livetrack_contact_sms_optout_format, jVarH514 != null ? jVarH514.H() : null);
                string.getClass();
                CharSequence charSequence111117 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 10:
                uz0.j jVarH515 = gVar.getRelativeNameValue();
                string = context.getString(R.string.pn_messenger_livetrack_recipient_invite_accepted_format, jVarH515 != null ? jVarH515.H() : null);
                string.getClass();
                CharSequence charSequence111118 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 11:
                uz0.j jVarH516 = gVar.getRelativeNameValue();
                string = context.getString(R.string.pn_messenger_livetrack_recipient_account_deleted_format, jVarH516 != null ? jVarH516.H() : null);
                string.getClass();
                CharSequence charSequence111119 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 12:
            case 13:
                string = context.getString(R.string.pn_messenger_livetrack_sender_account_deleted_format);
                string.getClass();
                CharSequence charSequence1111110 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 14:
                jVarH8 = gVar.getRelativeNameValue();
                if (jVarH8 != null) {
                    listW = null;
                } else {
                    listW = null;
                }
                if (gVar.getRelativeNameValue() != null) {
                }
                p92.y.f136664a.getClass();
                p92.y.a.c("NotificationsAdapterUtils", "Api returned null in modified event notification");
                return null;
            case 15:
                if (gVar.getRelativeNameValue() != null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.c("NotificationsAdapterUtils", "Api returned null for course update notification");
                    return null;
                }
                String string210 = context.getString(R.string.event_notification_course_changed, gVar.getRelativeNameValue().getEventName());
                string210.getClass();
                String strK26 = gVar.getRelativeNameValue().getGroupName();
                string = b(context, string210, strF, strK26 != null ? strK26 : "");
                CharSequence charSequence1111111 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 16:
                if (gVar.getRelativeNameValue() != null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.c("NotificationsAdapterUtils", "Api returned null for event deleted notification");
                    return null;
                }
                String string211 = context.getString(R.string.event_notification_event_deleted, gVar.getRelativeNameValue().getEventName());
                string211.getClass();
                String strK27 = gVar.getRelativeNameValue().getGroupName();
                string = b(context, string211, strF, strK27 != null ? strK27 : "");
                CharSequence charSequence1111112 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 17:
                if (gVar.getRelativeNameValue() != null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.c("NotificationsAdapterUtils", "Api returned null for premium content notification");
                    return null;
                }
                lVarA0 = gVar.getRelativeNameValue().getTrainingType();
                if (lVarA0 != null) {
                    string5 = context.getString(R.string.garmin_coach_plan);
                    string5.getClass();
                } else {
                    string5 = context.getString(R.string.garmin_coach_plan);
                    string5.getClass();
                }
                String string212 = context.getString(R.string.new_training_guidance_available, string5);
                string212.getClass();
                String strK28 = gVar.getRelativeNameValue().getGroupName();
                string = b(context, string212, strF, strK28 != null ? strK28 : "");
                CharSequence charSequence1111113 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 18:
                if (gVar.getRelativeNameValue() != null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.c("NotificationsAdapterUtils", "Error occurred getting notification values for Training plan progress report");
                    return null;
                }
                String string213 = context.getString(R.string.final_report_inbox_notification);
                string213.getClass();
                String strK29 = gVar.getRelativeNameValue().getGroupName();
                string = b(context, string213, strF, strK29 != null ? strK29 : "");
                CharSequence charSequence1111114 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 19:
                jVarH9 = gVar.getRelativeNameValue();
                if (jVarH9 != null) {
                    str = strZ;
                }
                string = context.getString(R.string.pn_exclusive_discounts_format, str);
                string.getClass();
                CharSequence charSequence1111115 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 20:
                string = context.getString(R.string.pn_new_exclusive_offers_format);
                string.getClass();
                CharSequence charSequence1111116 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 21:
                uz0.j jVarH517 = gVar.getRelativeNameValue();
                if (jVarH517 != null) {
                }
                if (g22.n.d(strD)) {
                    string6 = context.getString(R.string.pn_commented_on_activity_with_text, strF, strD);
                } else {
                    string6 = context.getString(R.string.lbl_commented_on_your_activity, strF);
                }
                string6.getClass();
                string = b(context, string6, strF);
                CharSequence charSequence1111117 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 22:
                uz0.j jVarH518 = gVar.getRelativeNameValue();
                if (jVarH518 != null) {
                }
                if (g22.n.d(strD2)) {
                    strConcat = context.getString(R.string.pn_someone_tagged_you, strF, strD2);
                } else {
                    strConcat = strF.concat(" tagged you in a comment.");
                }
                strConcat.getClass();
                string = b(context, strConcat, strF);
                CharSequence charSequence1111118 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 23:
                jVarH10 = gVar.getRelativeNameValue();
                if (jVarH10 != null) {
                    strF2 = jVarH10.getActivityName();
                } else {
                    strF2 = null;
                }
                strA2 = new mn.a(new l22.a(context)).a(strF2);
                jVarH11 = gVar.getRelativeNameValue();
                if (jVarH11 != null) {
                    strF3 = jVarH11.getActivityName();
                } else {
                    strF3 = null;
                }
                if (strF3 != null) {
                }
                uz0.j jVarH610 = gVar.getRelativeNameValue();
                if (jVarH610 != null) {
                }
                if (!g22.n.d(strD3)) {
                    if (!g22.n.d(strD3)) {
                        if (z15) {
                            string7 = context.getString(R.string.lbl_commented_on, strF, strA2);
                        } else {
                            string7 = context.getString(R.string.lbl_also_commented_on_an_activity, strF);
                        }
                    } else if (z15) {
                        string7 = context.getString(R.string.lbl_commented_on, strF, strA2);
                    } else {
                        string7 = context.getString(R.string.lbl_also_commented_on_an_activity, strF);
                    }
                } else if (!g22.n.d(strD3)) {
                    if (z15) {
                        string7 = context.getString(R.string.lbl_commented_on, strF, strA2);
                    } else {
                        string7 = context.getString(R.string.lbl_also_commented_on_an_activity, strF);
                    }
                } else if (z15) {
                    string7 = context.getString(R.string.lbl_commented_on, strF, strA2);
                } else {
                    string7 = context.getString(R.string.lbl_also_commented_on_an_activity, strF);
                }
                string7.getClass();
                string = b(context, string7, strF);
                CharSequence charSequence1111119 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 24:
                String string214 = context.getString(R.string.pn_connection_request_accepted_message, strF);
                string214.getClass();
                string = b(context, string214, strF);
                CharSequence charSequence11111110 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 25:
                jVarH12 = gVar.getRelativeNameValue();
                if (jVarH12 != null) {
                    strF4 = jVarH12.getActivityName();
                } else {
                    strF4 = null;
                }
                String strA5 = new mn.a(new l22.a(context)).a(strF4);
                uz0.j jVarH611 = gVar.getRelativeNameValue();
                if (jVarH611 != null) {
                }
                if (strF5 != null) {
                    string8 = context.getString(R.string.pn_group_activity_is_liked_with_dot, strF);
                } else {
                    string8 = context.getString(R.string.pn_group_activity_is_liked_with_dot, strF);
                }
                string8.getClass();
                string = b(context, string8, strF);
                CharSequence charSequence11111111 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 26:
                jVarH13 = gVar.getRelativeNameValue();
                if (jVarH13 != null) {
                    str = strD4;
                }
                String string215 = context.getString(R.string.pn_comment_is_liked, strF, str);
                string215.getClass();
                string = b(context, string215, strF);
                CharSequence charSequence11111112 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 27:
                jVarH14 = gVar.getRelativeNameValue();
                if (jVarH14 != null) {
                    strP0 = jVarH14.getNewsPostText();
                } else {
                    strP0 = null;
                }
                if (strP0 != null) {
                    uz0.j jVarH612 = gVar.getRelativeNameValue();
                    string9 = context.getString(R.string.pn_inbox_group_new_post_without_text, strF, jVarH612 != null ? jVarH612.getGroupName() : null);
                } else {
                    uz0.j jVarH613 = gVar.getRelativeNameValue();
                    string9 = context.getString(R.string.pn_inbox_group_new_post_without_text, strF, jVarH613 != null ? jVarH613.getGroupName() : null);
                }
                string9.getClass();
                jVarH15 = gVar.getRelativeNameValue();
                if (jVarH15 != null) {
                    str = strK0;
                }
                string = b(context, string9, strF, str);
                CharSequence charSequence11111113 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 28:
                jVarH16 = gVar.getRelativeNameValue();
                if (jVarH16 != null) {
                    strK1 = jVarH16.getGroupName();
                } else {
                    strK1 = null;
                }
                uz0.j jVarH614 = gVar.getRelativeNameValue();
                String string216 = context.getString(R.string.pn_inbox_commented_on_group_post, strF, strK1, jVarH614 != null ? jVarH614.getCommentText() : null);
                string216.getClass();
                jVarH17 = gVar.getRelativeNameValue();
                if (jVarH17 != null) {
                    str = strK2;
                }
                string = b(context, string216, strF, str);
                CharSequence charSequence11111114 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 29:
                jVarH18 = gVar.getRelativeNameValue();
                if (jVarH18 != null) {
                    strK3 = jVarH18.getGroupName();
                } else {
                    strK3 = null;
                }
                uz0.j jVarH615 = gVar.getRelativeNameValue();
                String string310 = context.getString(R.string.pn_inbox_also_commented_on_group_post, strF, strK3, jVarH615 != null ? jVarH615.getCommentText() : null);
                string310.getClass();
                jVarH19 = gVar.getRelativeNameValue();
                if (jVarH19 != null) {
                    str = strK4;
                }
                string = b(context, string310, strF, str);
                CharSequence charSequence11111115 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 30:
                jVarH20 = gVar.getRelativeNameValue();
                if (jVarH20 != null) {
                    str = strK5;
                }
                String string311 = context.getString(R.string.pn_member_request_accepted_with_group_name, strF, str);
                string311.getClass();
                string = b(context, string311, strF, str);
                CharSequence charSequence11111116 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 31:
                uz0.j jVarH616 = gVar.getRelativeNameValue();
                String string312 = context.getString(R.string.pn_group_invite_accepted, strF, jVarH616 != null ? jVarH616.getGroupName() : null);
                string312.getClass();
                jVarH21 = gVar.getRelativeNameValue();
                if (jVarH21 != null) {
                    str = strK6;
                }
                string = b(context, string312, strF, str);
                CharSequence charSequence11111117 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 32:
                jVarH22 = gVar.getRelativeNameValue();
                if (jVarH22 != null) {
                    strP1 = jVarH22.getNewsPostText();
                } else {
                    strP1 = null;
                }
                if (strP1 != null) {
                    uz0.j jVarH617 = gVar.getRelativeNameValue();
                    string10 = context.getString(R.string.social_inbox_post_without_text_liked, strF, jVarH617 != null ? jVarH617.getGroupName() : null);
                } else {
                    uz0.j jVarH618 = gVar.getRelativeNameValue();
                    string10 = context.getString(R.string.social_inbox_post_without_text_liked, strF, jVarH618 != null ? jVarH618.getGroupName() : null);
                }
                string10.getClass();
                jVarH23 = gVar.getRelativeNameValue();
                if (jVarH23 != null) {
                    str = strK7;
                }
                string = b(context, string10, strF, str);
                CharSequence charSequence11111118 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 33:
                jVarH24 = gVar.getRelativeNameValue();
                if (jVarH24 != null) {
                    strK8 = jVarH24.getGroupName();
                } else {
                    strK8 = null;
                }
                uz0.j jVarH619 = gVar.getRelativeNameValue();
                String string313 = context.getString(R.string.social_inbox_group_comment_liked, strF, strK8, jVarH619 != null ? jVarH619.getCommentText() : null);
                string313.getClass();
                jVarH25 = gVar.getRelativeNameValue();
                if (jVarH25 != null) {
                    str = strK9;
                }
                string = b(context, string313, strF, str);
                CharSequence charSequence11111119 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence11111119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 34:
                jVarH26 = gVar.getRelativeNameValue();
                if (jVarH26 != null) {
                    strA3 = jVarH26.getAnnouncementText();
                } else {
                    strA3 = null;
                }
                uz0.j jVarH75 = gVar.getRelativeNameValue();
                String string314 = context.getString(R.string.pn_inbox_group_announcement, strF, jVarH75 != null ? jVarH75.getGroupName() : null, strA3);
                string314.getClass();
                jVarH27 = gVar.getRelativeNameValue();
                if (jVarH27 != null) {
                    str = strK10;
                }
                string = b(context, string314, strF, str);
                CharSequence charSequence111111110 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 35:
                String string315 = context.getString(R.string.name_accepted_request_authorized_viewer, strF);
                string315.getClass();
                string = b(context, string315, strF);
                CharSequence charSequence111111111 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 36:
                String string316 = context.getString(R.string.name_declined_request_authorized_viewer, strF);
                string316.getClass();
                string = b(context, string316, strF);
                CharSequence charSequence111111112 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 37:
                String string317 = context.getString(R.string.name_no_longer_authorized_viewer, strF);
                string317.getClass();
                string = b(context, string317, strF);
                CharSequence charSequence111111113 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 38:
                String string318 = context.getString(R.string.name_removed_you_authorized_viewer, strF);
                string318.getClass();
                string = b(context, string318, strF);
                CharSequence charSequence111111114 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 39:
                return null;
            case 40:
                jVarH28 = gVar.getRelativeNameValue();
                if (jVarH28 != null) {
                    strK11 = "";
                } else {
                    strK11 = "";
                }
                jVarH29 = gVar.getRelativeNameValue();
                if (jVarH29 != null) {
                    strD5 = "";
                } else {
                    strD5 = "";
                }
                String string319 = context.getString(R.string.pn_inbox_commented_on_group_activity, strF, strK11, strD5);
                string319.getClass();
                jVarH30 = gVar.getRelativeNameValue();
                if (jVarH30 != null) {
                    str = strK12;
                }
                string = b(context, string319, strF, str);
                CharSequence charSequence111111115 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 41:
                jVarH31 = gVar.getRelativeNameValue();
                if (jVarH31 != null) {
                    strF6 = "";
                } else {
                    strF6 = "";
                }
                jVarH32 = gVar.getRelativeNameValue();
                if (jVarH32 != null) {
                    strK13 = "";
                } else {
                    strK13 = "";
                }
                jVarH33 = gVar.getRelativeNameValue();
                if (jVarH33 != null) {
                    strD6 = "";
                } else {
                    strD6 = "";
                }
                String string49 = context.getString(R.string.pn_inbox_also_commented_on_group_activity, strF, strF6, strK13, strD6);
                string49.getClass();
                jVarH34 = gVar.getRelativeNameValue();
                if (jVarH34 != null) {
                    strF7 = "";
                } else {
                    strF7 = "";
                }
                jVarH35 = gVar.getRelativeNameValue();
                if (jVarH35 != null) {
                    str = strK14;
                }
                string = b(context, string49, strF, strF7, str);
                CharSequence charSequence111111116 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111116, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 42:
                jVarH36 = gVar.getRelativeNameValue();
                if (jVarH36 != null) {
                    strK15 = "";
                } else {
                    strK15 = "";
                }
                String string410 = context.getString(R.string.social_inbox_group_activity_liked, strF, strK15);
                string410.getClass();
                jVarH37 = gVar.getRelativeNameValue();
                if (jVarH37 != null) {
                    str = strK16;
                }
                string = b(context, string410, strF, str);
                CharSequence charSequence111111117 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111117, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 43:
                jVarH38 = gVar.getRelativeNameValue();
                if (jVarH38 != null) {
                    strK17 = "";
                } else {
                    strK17 = "";
                }
                jVarH39 = gVar.getRelativeNameValue();
                if (jVarH39 != null) {
                    strD7 = "";
                } else {
                    strD7 = "";
                }
                String string411 = context.getString(R.string.social_inbox_group_comment_liked, strF, strK17, strD7);
                string411.getClass();
                jVarH40 = gVar.getRelativeNameValue();
                if (jVarH40 != null) {
                    str = strK18;
                }
                string = b(context, string411, strF, str);
                CharSequence charSequence111111118 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111118, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 44:
                String string412 = context.getString(R.string.msg_started_following_you, strF);
                string412.getClass();
                string = b(context, string412, strF);
                CharSequence charSequence111111119 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence111111119, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 45:
                String string413 = context.getString(R.string.follow_request_accepted_message, strF);
                string413.getClass();
                string = b(context, string413, strF);
                CharSequence charSequence1111111110 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111111110, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 46:
                uz0.j jVarH76 = gVar.getRelativeNameValue();
                if (jVarH76 != null) {
                }
                if (strG == null) {
                    strG = "";
                }
                string11 = d53.w.i0(strG).toString();
                if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_LIVETRACK")) {
                    string12 = context.getString(R.string.title_live_track);
                } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                    string12 = context.getString(R.string.lbl_adaptive_training_plan);
                } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_UPLOAD")) {
                    string12 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_INSIGHTS")) {
                    string12 = context.getString(R.string.title_insights);
                } else if (p005kotlin.jvm.internal.s.g(string11, "DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                    string12 = context.getString(R.string.lbl_auto_activity_detection);
                } else if (p005kotlin.jvm.internal.s.g(string11, q92.x.DI_CONNECT_CIQ_PRIVACY.f143819a)) {
                    string12 = context.getString(R.string.lbl_connect_iq_privacy_policy);
                } else {
                    string12 = "";
                }
                string12.getClass();
                if (p005kotlin.jvm.internal.s.g(string11, q92.x.DI_CONNECT_CIQ_PRIVACY.f143819a)) {
                    jVarH42 = gVar.getRelativeNameValue();
                    if (jVarH42 != null) {
                        str = strC2;
                    }
                    string13 = context.getString(R.string.pn_review_and_approval_requested, str, string12);
                } else {
                    jVarH41 = gVar.getRelativeNameValue();
                    if (jVarH41 != null) {
                        str = strC;
                    }
                    string13 = context.getString(R.string.pn_permission_requested, str, string12);
                }
                string13.getClass();
                string = b(context, string13, new String[0]);
                CharSequence charSequence1111111111 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111111111, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 47:
                uz0.j jVarH77 = gVar.getRelativeNameValue();
                if (jVarH77 != null) {
                }
                if (strG2 == null) {
                    strG2 = "";
                }
                switch (d53.w.i0(strG2).toString()) {
                    case -1709024396:
                        if (r2.equals("DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                            string14 = context.getString(R.string.lbl_adaptive_training_plan);
                        }
                        break;
                    case -1139160752:
                        if (r2.equals("DI_CONNECT_LIVETRACK")) {
                            string14 = context.getString(R.string.title_live_track);
                        }
                        break;
                    case 1165328790:
                        if (r2.equals("DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                            string14 = context.getString(R.string.lbl_auto_activity_detection);
                        }
                        break;
                    case 1722149930:
                        if (r2.equals("DI_CONNECT_INSIGHTS")) {
                            string14 = context.getString(R.string.title_insights);
                        }
                        break;
                    case 2014023184:
                        if (r2.equals("DI_CONNECT_UPLOAD")) {
                            string14 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                        }
                        break;
                    default:
                        string14 = "";
                        break;
                }
                string14.getClass();
                jVarH43 = gVar.getRelativeNameValue();
                if (jVarH43 != null) {
                    strZ2 = "";
                } else {
                    strZ2 = "";
                }
                String string414 = context.getString(R.string.pn_permission_revoked, strZ2, string14);
                string414.getClass();
                jVarH44 = gVar.getRelativeNameValue();
                if (jVarH44 != null) {
                    strF8 = "";
                } else {
                    strF8 = "";
                }
                jVarH45 = gVar.getRelativeNameValue();
                if (jVarH45 != null) {
                    str = strK19;
                }
                string = b(context, string414, strF, strF8, str);
                CharSequence charSequence1111111112 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111111112, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 48:
                uz0.j jVarH78 = gVar.getRelativeNameValue();
                if (jVarH78 != null) {
                }
                if (strG3 == null) {
                    strG3 = "";
                }
                string15 = d53.w.i0(strG3).toString();
                i18 = R.string.pn_permission_granted;
                switch (string15) {
                    case -1709024396:
                        if (string15.equals("DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                            string16 = context.getString(R.string.lbl_adaptive_training_plan);
                        }
                        break;
                    case -1139160752:
                        if (string15.equals("DI_CONNECT_LIVETRACK")) {
                            string16 = context.getString(R.string.title_live_track);
                        }
                        break;
                    case 1165328790:
                        if (string15.equals("DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                            string16 = context.getString(R.string.lbl_auto_activity_detection);
                            i18 = R.string.pn_aad_permission_granted;
                        }
                        break;
                    case 1722149930:
                        if (string15.equals("DI_CONNECT_INSIGHTS")) {
                            string16 = context.getString(R.string.title_insights);
                        }
                        break;
                    case 2014023184:
                        if (string15.equals("DI_CONNECT_UPLOAD")) {
                            string16 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                        }
                        break;
                    default:
                        string16 = "";
                        break;
                }
                string16.getClass();
                jVarH46 = gVar.getRelativeNameValue();
                if (jVarH46 != null) {
                    str = strZ3;
                }
                String string415 = context.getString(i18, str, string16);
                string415.getClass();
                string = b(context, string415, new String[0]);
                CharSequence charSequence1111111113 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111111113, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 49:
                uz0.j jVarH79 = gVar.getRelativeNameValue();
                if (jVarH79 != null) {
                }
                if (strG4 == null) {
                    strG4 = "";
                }
                switch (d53.w.i0(strG4).toString()) {
                    case -1709024396:
                        if (r2.equals("DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                            string17 = context.getString(R.string.lbl_adaptive_training_plan);
                        }
                        break;
                    case -1139160752:
                        if (r2.equals("DI_CONNECT_LIVETRACK")) {
                            string17 = context.getString(R.string.title_live_track);
                        }
                        break;
                    case 1165328790:
                        if (r2.equals("DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                            string17 = context.getString(R.string.lbl_auto_activity_detection);
                        }
                        break;
                    case 1722149930:
                        if (r2.equals("DI_CONNECT_INSIGHTS")) {
                            string17 = context.getString(R.string.title_insights);
                        }
                        break;
                    case 2014023184:
                        if (r2.equals("DI_CONNECT_UPLOAD")) {
                            string17 = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                        }
                        break;
                    default:
                        string17 = "";
                        break;
                }
                string17.getClass();
                jVarH47 = gVar.getRelativeNameValue();
                if (jVarH47 != null) {
                    strC3 = "";
                } else {
                    strC3 = "";
                }
                String string416 = context.getString(R.string.pn_permission_child_revoked, strC3, string17);
                string416.getClass();
                jVarH48 = gVar.getRelativeNameValue();
                if (jVarH48 != null) {
                    strF9 = "";
                } else {
                    strF9 = "";
                }
                jVarH49 = gVar.getRelativeNameValue();
                if (jVarH49 != null) {
                    str = strK20;
                }
                string = b(context, string416, strF, strF9, str);
                CharSequence charSequence1111111114 = string;
                if (bool == null) {
                    boolJ = gVar.getViewed();
                } else {
                    boolJ = bool;
                }
                return new NotificationItem.Activity(bVar, charSequence1111111114, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
            case 50:
                s3.f23252a.getClass();
                if (s3.c()) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                bv.b.f21239a.getClass();
                if (((kd0.m) bv.b.a()).l().r()) {
                    jVarH50 = gVar.getRelativeNameValue();
                    if (jVarH50 != null) {
                        strF = strC4;
                    }
                    String string417 = context.getString(R.string.you_are_no_longer_admin_for, strF);
                    string417.getClass();
                    string = b(context, string417, new String[0]);
                    CharSequence charSequence1111111115 = string;
                    if (bool == null) {
                        boolJ = gVar.getViewed();
                    } else {
                        boolJ = bool;
                    }
                    return new NotificationItem.Activity(bVar, charSequence1111111115, new NotificationItem.Activity.a(strQ, strQ2, false, boolJ, 4, null), gVar, dVar, true, z14);
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final NotificationItem.Request d(com.garmin.android.apps.connectmobile.smartscale.model.b bVar, Context context, Boolean bool, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        String invitorProfilePicURL;
        String invitorProfilePicURL2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        bVar.getClass();
        context.getClass();
        String invitorName = bVar.getInvitorName();
        if (invitorName == null) {
            invitorName = "";
        }
        String productDisplayName = bVar.getProductDisplayName();
        if (productDisplayName == null) {
            productDisplayName = "";
        }
        String string = context.getString(R.string.msg_user_invitation_to_device, invitorName, productDisplayName);
        string.getClass();
        String invitorName2 = bVar.getInvitorName();
        CharSequence charSequenceB = b(context, string, invitorName2 != null ? invitorName2 : "");
        Long inviteDate = bVar.getInviteDate();
        String strQ = inviteDate != null ? xy2.b.q(context, new DateTime(inviteDate.longValue()), false, 28) : null;
        if (lVar == null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null || (invitorProfilePicURL = profileImageUrls2.f46879h) == null) {
            invitorProfilePicURL = bVar.getInvitorProfilePicURL();
        }
        bVar.f44443p = new b12.b(invitorProfilePicURL, null, null, null, null, 30, null);
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (invitorProfilePicURL2 = profileImageUrls.f46879h) == null) {
            invitorProfilePicURL2 = bVar.getInvitorProfilePicURL();
        }
        return new NotificationItem.Request(new b12.b(invitorProfilePicURL2, null, null, null, null, 30, null), charSequenceB, new NotificationItem.Request.a(null, null, context.getString(R.string.lbl_accept), context.getString(R.string.btn_decline_request), false, strQ, bool == null ? bVar.getRequestViewed() : bool, 18, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar, null, null, 216, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final NotificationItem.Request e(ue0.n nVar, Context context, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        boolean z14;
        String string;
        String strA1;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        nVar.getClass();
        context.getClass();
        String string2 = context.getString(R.string.name_added_you_authorized_viewer, nVar.getFullName());
        string2.getClass();
        String fullName = nVar.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        CharSequence charSequenceB = b(context, string2, fullName);
        ue0.c status = nVar.getStatus();
        int i14 = status == null ? -1 : a.f161466b[status.ordinal()];
        if (i14 == -1) {
            z14 = false;
        } else if (i14 != 1) {
            if (i14 != 2) {
                u0.r();
                return null;
            }
            z14 = false;
        } else {
            z14 = true;
        }
        ue0.c status2 = nVar.getStatus();
        int i15 = status2 == null ? -1 : a.f161466b[status2.ordinal()];
        if (i15 == -1) {
            string = context.getString(R.string.request_declined);
        } else if (i15 == 1) {
            string = null;
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            string = context.getString(R.string.social_request_accepted);
        }
        DateTime inviteDate = nVar.getInviteDate();
        String strQ = inviteDate != null ? xy2.b.q(context, inviteDate, false, 28) : null;
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (strA1 = profileImageUrls.f46879h) == null) {
            strA1 = nVar.A1();
        }
        return new NotificationItem.Request(new b12.b(strA1, null, null, null, null, 30, null), charSequenceB, new NotificationItem.Request.a(string, null, context.getString(R.string.lbl_accept), context.getString(R.string.btn_decline_request), z14, strQ, Boolean.FALSE, 2, null), null, 0 == true ? 1 : 0, null, null, nVar, 120, null);
    }

    public static final NotificationItem.Request f(uz0.b bVar, Context context, vz0.b bVar2, Boolean bool, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        CharSequence charSequenceB;
        String profileImageUrlSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        bVar.getClass();
        context.getClass();
        bVar2.getClass();
        int i14 = a.f161465a[bVar2.ordinal()];
        String str = "";
        if (i14 == 1) {
            String fullName = bVar.getFullName();
            if (fullName == null) {
                fullName = bVar.getDisplayName();
            }
            String string = context.getString(R.string.pn_member_request, fullName, bVar.getGroupName());
            string.getClass();
            if (fullName == null) {
                fullName = "";
            }
            String groupName = bVar.getGroupName();
            String str2 = str;
            if (groupName != null) {
                str2 = groupName;
            }
            charSequenceB = b(context, string, fullName, str2);
        } else if (i14 == 2) {
            String fullName2 = bVar.getFullName();
            if (fullName2 == null) {
                charSequenceB = str;
                fullName2 = bVar.getDisplayName();
            }
            charSequenceB = str;
            String fullName3 = bVar.getFullName();
            if (fullName3 == null) {
                fullName3 = bVar.getDisplayName();
            }
            String string2 = context.getString(R.string.pn_group_invite, fullName3, bVar.getGroupName());
            string2.getClass();
            if (fullName2 == null) {
                fullName2 = "";
            }
            String groupName2 = bVar.getGroupName();
            String str3 = str;
            if (groupName2 != null) {
                str3 = groupName2;
            }
            charSequenceB = b(context, string2, fullName2, str3);
        }
        charSequenceB = str;
        CharSequence charSequence = charSequenceB;
        DateTime createDate = bVar.getCreateDate();
        String strQ = createDate != null ? xy2.b.q(context, createDate, false, 28) : null;
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlSmall = profileImageUrls.f46879h) == null) {
            profileImageUrlSmall = bVar.getProfileImageUrlSmall();
        }
        return new NotificationItem.Request(new b12.b(profileImageUrlSmall, null, null, null, null, 30, null), charSequence, new NotificationItem.Request.a(null, null, context.getString(R.string.lbl_accept), null, false, strQ, bool == null ? bVar.getRequestViewed() : bool, 26, null), bVar2, false ? 1 : 0, null, bVar, null, SyslogConstants.LOG_LOCAL6, null);
    }

    public static final NotificationItem.Request g(uz0.m mVar, Context context, Boolean bool, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        String profileImageUrlMedium;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        mVar.getClass();
        context.getClass();
        String fullName = mVar.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        String string = context.getString(R.string.follow_request_message, fullName);
        string.getClass();
        String fullName2 = mVar.getFullName();
        CharSequence charSequenceB = b(context, string, fullName2 != null ? fullName2 : "");
        DateTime requestStartTime = mVar.getRequestStartTime();
        String strQ = requestStartTime != null ? xy2.b.q(context, requestStartTime, false, 28) : null;
        if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls.f46879h) == null) {
            profileImageUrlMedium = mVar.getProfileImageUrlMedium();
        }
        return new NotificationItem.Request(new b12.b(profileImageUrlMedium, null, null, null, null, 30, null), charSequenceB, new NotificationItem.Request.a("", null, context.getString(R.string.lbl_accept), context.getString(R.string.btn_decline_request), false, strQ, bool == null ? mVar.getRequestViewed() : bool, 18, null), null, mVar, null, null, null, 232, null);
    }
}
