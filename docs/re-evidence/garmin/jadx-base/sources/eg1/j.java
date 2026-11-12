package eg1;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import f12.l;
import i3.e5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leg1/j;", "", "<init>", "()V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f64004a = new j();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f64006b;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.HR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.WIND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.POWER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f64005a = iArr;
            int[] iArr2 = new int[PrivacyType.values().length];
            try {
                iArr2[PrivacyType.ONLY_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PrivacyType.MY_CONNECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PrivacyType.MY_GROUPS_AND_CONNECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f64006b = iArr2;
        }
    }

    private j() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0286  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:108:0x02af  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:112:0x02db  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:122:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02f7 A[SYNTHETIC] */
    public static final void a(Activity activity, b.a aVar, d[] dVarArr, SegmentLeaderboardRowDTO segmentLeaderboardRowDTO, double d14, View view2) {
        String string;
        String string2;
        String str;
        String strB;
        d dVar;
        String string3;
        String string4;
        TextView textView;
        Activity activity2 = activity;
        SegmentLeaderboardRowDTO segmentLeaderboardRowDTO2 = segmentLeaderboardRowDTO;
        TextView[] textViewArr = aVar.f63983e;
        int i14 = segmentLeaderboardRowDTO2.f41239o;
        if (i14 <= 0 || i14 >= 1000) {
            TextView textView2 = aVar.f63979a;
            if (i14 >= 1000) {
                if (textView2 != null) {
                    textView2.setText(R.string.lbl_rank_over_999);
                }
                string = activity2.getString(R.string.string_colon_string_pattern, activity2.getString(R.string.challenge_place_label), activity2.getString(R.string.lbl_rank_over_999));
                string.getClass();
            } else {
                if (textView2 != null) {
                    textView2.setText(activity2.getString(R.string.no_value));
                }
                string = activity2.getString(R.string.string_colon_string_pattern, activity2.getString(R.string.challenge_place_label), activity2.getString(R.string.txt_empty_page_no_data));
                string.getClass();
            }
        } else {
            x0 x0Var = x0.f105818a;
            Locale locale = Locale.getDefault();
            String string5 = activity2.getString(R.string.format_decimal_value);
            string5.getClass();
            String str2 = String.format(locale, string5, Arrays.copyOf(new Object[]{Integer.valueOf(segmentLeaderboardRowDTO2.f41239o)}, 1));
            TextView textView3 = aVar.f63979a;
            if (textView3 != null) {
                textView3.setText(str2);
            }
            string = activity2.getString(R.string.string_colon_string_pattern, activity2.getString(R.string.challenge_place_label), str2);
            string.getClass();
        }
        String str3 = string;
        UserLevelImageView userLevelImageView = aVar.f63981c;
        if (userLevelImageView != null) {
            userLevelImageView.setProfileImageData(new b12.b(segmentLeaderboardRowDTO2.f41240p, null, null, null, null, 30, null));
        }
        if (TextUtils.isEmpty(segmentLeaderboardRowDTO2.f41242r)) {
            String str4 = segmentLeaderboardRowDTO2.f41241q;
            if (str4 == null) {
                str4 = "";
            }
            TextView textView4 = aVar.f63982d;
            if (textView4 != null) {
                textView4.setText(str4);
            }
            string2 = activity2.getString(R.string.string_colon_string_pattern, activity2.getString(R.string.lbl_name), str4);
            string2.getClass();
        } else {
            TextView textView5 = aVar.f63982d;
            if (textView5 != null) {
                textView5.setText(segmentLeaderboardRowDTO2.f41242r);
            }
            string2 = activity2.getString(R.string.string_colon_string_pattern, activity2.getString(R.string.lbl_name), segmentLeaderboardRowDTO2.f41242r);
            string2.getClass();
        }
        String str5 = string2;
        String str6 = segmentLeaderboardRowDTO2.f41241q;
        j jVar = f64004a;
        if (str6 != null && str6.equals(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
            TextView textView6 = aVar.f63982d;
            if (textView6 != null) {
                textView6.setTextColor(activity2.getColor(R.color.gcm3_text_orange));
            }
            PrivacyType.Companion companion = PrivacyType.INSTANCE;
            String str7 = segmentLeaderboardRowDTO2.f41246x;
            PrivacyType privacyType = PrivacyType.ONLY_ME;
            companion.getClass();
            PrivacyType privacyTypeA = PrivacyType.Companion.a(str7, privacyType);
            jVar.getClass();
            int i15 = a.f64006b[privacyTypeA.ordinal()];
            int i16 = 2;
            if (i15 == 1) {
                ImageView imageView = aVar.f63980b;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.gcm3_only_me_privacy);
                }
                ImageView imageView2 = aVar.f63980b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            } else if (i15 == 2) {
                ImageView imageView3 = aVar.f63980b;
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.gcm3_connections_only_privacy);
                }
                ImageView imageView4 = aVar.f63980b;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
            } else if (i15 == 3) {
                ImageView imageView5 = aVar.f63980b;
                if (imageView5 != null) {
                    imageView5.setImageResource(R.drawable.gcm3_connections_groups_privacy);
                }
                ImageView imageView6 = aVar.f63980b;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                }
            }
            ImageView imageView7 = aVar.f63980b;
            if (imageView7 != null) {
                imageView7.setOnClickListener(new bv2.j(activity2, i16, privacyTypeA, segmentLeaderboardRowDTO2));
            }
        }
        TextView textView7 = aVar.f63982d;
        if (textView7 != null) {
            textView7.setOnClickListener(new cw2.b(9, segmentLeaderboardRowDTO2, activity2));
        }
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        StringBuilder sb3 = new StringBuilder();
        int length = textViewArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            d dVar2 = dVarArr[i17];
            jVar.getClass();
            String strC = c(activity2, dVar2, segmentLeaderboardRowDTO2, d14, zY);
            d dVar3 = dVarArr[i17];
            switch (dVar3 == null ? -1 : a.f64005a[dVar3.ordinal()]) {
                case -1:
                    sb3 = sb3;
                    str = strC;
                    String string6 = activity2.getString(R.string.txt_empty_page_no_data);
                    string6.getClass();
                    strB = string6;
                    dVar = dVarArr[i17];
                    switch (dVar != null ? a.f64005a[dVar.ordinal()] : -1) {
                        case -1:
                            string3 = activity2.getString(R.string.txt_empty_page_no_data);
                            string3.getClass();
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string7 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string7.getClass();
                            StringBuilder sb4 = sb3;
                            sb4.append(string7);
                            sb4.append(". ");
                            sb3 = sb4;
                            break;
                        case 0:
                        default:
                            u0.r();
                            break;
                        case 1:
                            string4 = activity2.getString(R.string.lbl_time);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string8 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string8.getClass();
                            StringBuilder sb5 = sb3;
                            sb5.append(string8);
                            sb5.append(". ");
                            sb3 = sb5;
                            break;
                        case 2:
                            string4 = activity2.getString(R.string.lbl_speed);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string9 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string9.getClass();
                            StringBuilder sb6 = sb3;
                            sb6.append(string9);
                            sb6.append(". ");
                            sb3 = sb6;
                            break;
                        case 3:
                            string4 = activity2.getString(R.string.lbl_pace);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string10 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string10.getClass();
                            StringBuilder sb7 = sb3;
                            sb7.append(string10);
                            sb7.append(". ");
                            sb3 = sb7;
                            break;
                        case 4:
                            string4 = activity2.getString(R.string.lbl_heart_rate_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11.getClass();
                            StringBuilder sb8 = sb3;
                            sb8.append(string11);
                            sb8.append(". ");
                            sb3 = sb8;
                            break;
                        case 5:
                            string4 = activity2.getString(R.string.lbl_wind);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string12 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string12.getClass();
                            StringBuilder sb9 = sb3;
                            sb9.append(string12);
                            sb9.append(". ");
                            sb3 = sb9;
                            break;
                        case 6:
                            string4 = activity2.getString(R.string.common_data);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string13 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string13.getClass();
                            StringBuilder sb10 = sb3;
                            sb10.append(string13);
                            sb10.append(". ");
                            sb3 = sb10;
                            break;
                        case 7:
                            string4 = activity2.getString(R.string.lbl_power_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string14 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string14.getClass();
                            StringBuilder sb11 = sb3;
                            sb11.append(string14);
                            sb11.append(". ");
                            sb3 = sb11;
                            break;
                    }
                    break;
                case 0:
                default:
                    u0.r();
                    break;
                case 1:
                    sb3 = sb3;
                    str = strC;
                    strB = b(activity2, segmentLeaderboardRowDTO2.f41245w);
                    dVar = dVarArr[i17];
                    switch (dVar != null ? a.f64005a[dVar.ordinal()] : -1) {
                        case -1:
                            string3 = activity2.getString(R.string.txt_empty_page_no_data);
                            string3.getClass();
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string15 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string15.getClass();
                            StringBuilder sb12 = sb3;
                            sb12.append(string15);
                            sb12.append(". ");
                            sb3 = sb12;
                            break;
                        case 0:
                        default:
                            u0.r();
                            break;
                        case 1:
                            string4 = activity2.getString(R.string.lbl_time);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string16 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string16.getClass();
                            StringBuilder sb13 = sb3;
                            sb13.append(string16);
                            sb13.append(". ");
                            sb3 = sb13;
                            break;
                        case 2:
                            string4 = activity2.getString(R.string.lbl_speed);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string17 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string17.getClass();
                            StringBuilder sb14 = sb3;
                            sb14.append(string17);
                            sb14.append(". ");
                            sb3 = sb14;
                            break;
                        case 3:
                            string4 = activity2.getString(R.string.lbl_pace);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string18 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string18.getClass();
                            StringBuilder sb15 = sb3;
                            sb15.append(string18);
                            sb15.append(". ");
                            sb3 = sb15;
                            break;
                        case 4:
                            string4 = activity2.getString(R.string.lbl_heart_rate_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string19 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string19.getClass();
                            StringBuilder sb16 = sb3;
                            sb16.append(string19);
                            sb16.append(". ");
                            sb3 = sb16;
                            break;
                        case 5:
                            string4 = activity2.getString(R.string.lbl_wind);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string110 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string110.getClass();
                            StringBuilder sb17 = sb3;
                            sb17.append(string110);
                            sb17.append(". ");
                            sb3 = sb17;
                            break;
                        case 6:
                            string4 = activity2.getString(R.string.common_data);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string111 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string111.getClass();
                            StringBuilder sb18 = sb3;
                            sb18.append(string111);
                            sb18.append(". ");
                            sb3 = sb18;
                            break;
                        case 7:
                            string4 = activity2.getString(R.string.lbl_power_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string112 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string112.getClass();
                            StringBuilder sb19 = sb3;
                            sb19.append(string112);
                            sb19.append(". ");
                            sb3 = sb19;
                            break;
                    }
                    break;
                case 2:
                case 5:
                case 6:
                    sb3 = sb3;
                    str = strC;
                    strB = c(activity2, dVar3, segmentLeaderboardRowDTO2, d14, zY);
                    dVar = dVarArr[i17];
                    switch (dVar != null ? a.f64005a[dVar.ordinal()] : -1) {
                        case -1:
                            string3 = activity2.getString(R.string.txt_empty_page_no_data);
                            string3.getClass();
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string113 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string113.getClass();
                            StringBuilder sb110 = sb3;
                            sb110.append(string113);
                            sb110.append(". ");
                            sb3 = sb110;
                            break;
                        case 0:
                        default:
                            u0.r();
                            break;
                        case 1:
                            string4 = activity2.getString(R.string.lbl_time);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string114 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string114.getClass();
                            StringBuilder sb111 = sb3;
                            sb111.append(string114);
                            sb111.append(". ");
                            sb3 = sb111;
                            break;
                        case 2:
                            string4 = activity2.getString(R.string.lbl_speed);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string115 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string115.getClass();
                            StringBuilder sb112 = sb3;
                            sb112.append(string115);
                            sb112.append(". ");
                            sb3 = sb112;
                            break;
                        case 3:
                            string4 = activity2.getString(R.string.lbl_pace);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string116 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string116.getClass();
                            StringBuilder sb113 = sb3;
                            sb113.append(string116);
                            sb113.append(". ");
                            sb3 = sb113;
                            break;
                        case 4:
                            string4 = activity2.getString(R.string.lbl_heart_rate_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string117 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string117.getClass();
                            StringBuilder sb114 = sb3;
                            sb114.append(string117);
                            sb114.append(". ");
                            sb3 = sb114;
                            break;
                        case 5:
                            string4 = activity2.getString(R.string.lbl_wind);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string118 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string118.getClass();
                            StringBuilder sb115 = sb3;
                            sb115.append(string118);
                            sb115.append(". ");
                            sb3 = sb115;
                            break;
                        case 6:
                            string4 = activity2.getString(R.string.common_data);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string119 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string119.getClass();
                            StringBuilder sb116 = sb3;
                            sb116.append(string119);
                            sb116.append(". ");
                            sb3 = sb116;
                            break;
                        case 7:
                            string4 = activity2.getString(R.string.lbl_power_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1110 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1110.getClass();
                            StringBuilder sb117 = sb3;
                            sb117.append(string1110);
                            sb117.append(". ");
                            sb3 = sb117;
                            break;
                    }
                    break;
                case 3:
                    sb3 = sb3;
                    double d15 = d(segmentLeaderboardRowDTO, d14);
                    l3.a aVar2 = l3.f23124b;
                    String string20 = activity2.getString(R.string.no_duration_value);
                    string20.getClass();
                    aVar2.getClass();
                    str = strC;
                    strB = oi0.d.a(activity, aVar2.J1(activity, d15, false, zY, true, string20), new cg1.e(17));
                    activity2 = activity;
                    segmentLeaderboardRowDTO2 = segmentLeaderboardRowDTO;
                    dVar = dVarArr[i17];
                    switch (dVar != null ? a.f64005a[dVar.ordinal()] : -1) {
                        case -1:
                            string3 = activity2.getString(R.string.txt_empty_page_no_data);
                            string3.getClass();
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1111 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1111.getClass();
                            StringBuilder sb118 = sb3;
                            sb118.append(string1111);
                            sb118.append(". ");
                            sb3 = sb118;
                            break;
                        case 0:
                        default:
                            u0.r();
                            break;
                        case 1:
                            string4 = activity2.getString(R.string.lbl_time);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1112 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1112.getClass();
                            StringBuilder sb119 = sb3;
                            sb119.append(string1112);
                            sb119.append(". ");
                            sb3 = sb119;
                            break;
                        case 2:
                            string4 = activity2.getString(R.string.lbl_speed);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1113 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1113.getClass();
                            StringBuilder sb1110 = sb3;
                            sb1110.append(string1113);
                            sb1110.append(". ");
                            sb3 = sb1110;
                            break;
                        case 3:
                            string4 = activity2.getString(R.string.lbl_pace);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1114 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1114.getClass();
                            StringBuilder sb1111 = sb3;
                            sb1111.append(string1114);
                            sb1111.append(". ");
                            sb3 = sb1111;
                            break;
                        case 4:
                            string4 = activity2.getString(R.string.lbl_heart_rate_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1115 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1115.getClass();
                            StringBuilder sb1112 = sb3;
                            sb1112.append(string1115);
                            sb1112.append(". ");
                            sb3 = sb1112;
                            break;
                        case 5:
                            string4 = activity2.getString(R.string.lbl_wind);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1116 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1116.getClass();
                            StringBuilder sb1113 = sb3;
                            sb1113.append(string1116);
                            sb1113.append(". ");
                            sb3 = sb1113;
                            break;
                        case 6:
                            string4 = activity2.getString(R.string.common_data);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1117 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1117.getClass();
                            StringBuilder sb1114 = sb3;
                            sb1114.append(string1117);
                            sb1114.append(". ");
                            sb3 = sb1114;
                            break;
                        case 7:
                            string4 = activity2.getString(R.string.lbl_power_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1118 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1118.getClass();
                            StringBuilder sb1115 = sb3;
                            sb1115.append(string1118);
                            sb1115.append(". ");
                            sb3 = sb1115;
                            break;
                    }
                    break;
                case 4:
                    String strL0 = l3.a.l0(l3.f23124b, new l22.a(activity2), segmentLeaderboardRowDTO2.f41230f, true);
                    if (TextUtils.isEmpty(strL0)) {
                        strL0 = activity2.getString(R.string.no_value);
                        strL0.getClass();
                    }
                    strB = oi0.d.a(activity2, strL0, new cg1.e(18));
                    str = strC;
                    dVar = dVarArr[i17];
                    switch (dVar != null ? a.f64005a[dVar.ordinal()] : -1) {
                        case -1:
                            string3 = activity2.getString(R.string.txt_empty_page_no_data);
                            string3.getClass();
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string1119 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string1119.getClass();
                            StringBuilder sb1116 = sb3;
                            sb1116.append(string1119);
                            sb1116.append(". ");
                            sb3 = sb1116;
                            break;
                        case 0:
                        default:
                            u0.r();
                            break;
                        case 1:
                            string4 = activity2.getString(R.string.lbl_time);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11110 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11110.getClass();
                            StringBuilder sb1117 = sb3;
                            sb1117.append(string11110);
                            sb1117.append(". ");
                            sb3 = sb1117;
                            break;
                        case 2:
                            string4 = activity2.getString(R.string.lbl_speed);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11111 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11111.getClass();
                            StringBuilder sb1118 = sb3;
                            sb1118.append(string11111);
                            sb1118.append(". ");
                            sb3 = sb1118;
                            break;
                        case 3:
                            string4 = activity2.getString(R.string.lbl_pace);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11112 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11112.getClass();
                            StringBuilder sb1119 = sb3;
                            sb1119.append(string11112);
                            sb1119.append(". ");
                            sb3 = sb1119;
                            break;
                        case 4:
                            string4 = activity2.getString(R.string.lbl_heart_rate_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11113 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11113.getClass();
                            StringBuilder sb11110 = sb3;
                            sb11110.append(string11113);
                            sb11110.append(". ");
                            sb3 = sb11110;
                            break;
                        case 5:
                            string4 = activity2.getString(R.string.lbl_wind);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11114 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11114.getClass();
                            StringBuilder sb11111 = sb3;
                            sb11111.append(string11114);
                            sb11111.append(". ");
                            sb3 = sb11111;
                            break;
                        case 6:
                            string4 = activity2.getString(R.string.common_data);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11115 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11115.getClass();
                            StringBuilder sb11112 = sb3;
                            sb11112.append(string11115);
                            sb11112.append(". ");
                            sb3 = sb11112;
                            break;
                        case 7:
                            string4 = activity2.getString(R.string.lbl_power_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11116 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11116.getClass();
                            StringBuilder sb11113 = sb3;
                            sb11113.append(string11116);
                            sb11113.append(". ");
                            sb3 = sb11113;
                            break;
                    }
                    break;
                case 7:
                    String strF0 = l3.a.F0(l3.f23124b, activity2, segmentLeaderboardRowDTO2.f41232h, true);
                    if (TextUtils.isEmpty(strF0)) {
                        strF0 = activity2.getString(R.string.no_value);
                        strF0.getClass();
                    }
                    strB = oi0.d.a(activity2, strF0, new cg1.e(19));
                    str = strC;
                    dVar = dVarArr[i17];
                    switch (dVar != null ? a.f64005a[dVar.ordinal()] : -1) {
                        case -1:
                            string3 = activity2.getString(R.string.txt_empty_page_no_data);
                            string3.getClass();
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11117 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11117.getClass();
                            StringBuilder sb11114 = sb3;
                            sb11114.append(string11117);
                            sb11114.append(". ");
                            sb3 = sb11114;
                            break;
                        case 0:
                        default:
                            u0.r();
                            break;
                        case 1:
                            string4 = activity2.getString(R.string.lbl_time);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11118 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11118.getClass();
                            StringBuilder sb11115 = sb3;
                            sb11115.append(string11118);
                            sb11115.append(". ");
                            sb3 = sb11115;
                            break;
                        case 2:
                            string4 = activity2.getString(R.string.lbl_speed);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string11119 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string11119.getClass();
                            StringBuilder sb11116 = sb3;
                            sb11116.append(string11119);
                            sb11116.append(". ");
                            sb3 = sb11116;
                            break;
                        case 3:
                            string4 = activity2.getString(R.string.lbl_pace);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string111110 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string111110.getClass();
                            StringBuilder sb11117 = sb3;
                            sb11117.append(string111110);
                            sb11117.append(". ");
                            sb3 = sb11117;
                            break;
                        case 4:
                            string4 = activity2.getString(R.string.lbl_heart_rate_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string111111 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string111111.getClass();
                            StringBuilder sb11118 = sb3;
                            sb11118.append(string111111);
                            sb11118.append(". ");
                            sb3 = sb11118;
                            break;
                        case 5:
                            string4 = activity2.getString(R.string.lbl_wind);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string111112 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string111112.getClass();
                            StringBuilder sb11119 = sb3;
                            sb11119.append(string111112);
                            sb11119.append(". ");
                            sb3 = sb11119;
                            break;
                        case 6:
                            string4 = activity2.getString(R.string.common_data);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string111113 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string111113.getClass();
                            StringBuilder sb111110 = sb3;
                            sb111110.append(string111113);
                            sb111110.append(". ");
                            sb3 = sb111110;
                            break;
                        case 7:
                            string4 = activity2.getString(R.string.lbl_power_cap);
                            string4.getClass();
                            string3 = string4;
                            textView = textViewArr[i17];
                            if (textView != null) {
                                textView.setText(str);
                            }
                            String string111114 = activity2.getString(R.string.string_colon_string_pattern, string3, strB);
                            string111114.getClass();
                            StringBuilder sb111111 = sb3;
                            sb111111.append(string111114);
                            sb111111.append(". ");
                            sb3 = sb111111;
                            break;
                    }
                    break;
            }
            return;
        }
        view2.setContentDescription(str3 + ". " + str5 + ". " + ((Object) sb3));
    }

    public static final String b(Context context, long j8) {
        context.getClass();
        oi0.h hVar = new oi0.h(context);
        if (j8 > 0) {
            return hVar.d(Math.round(j8 / 1000), true);
        }
        String string = context.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        return string;
    }

    public static String c(Activity activity, d dVar, SegmentLeaderboardRowDTO segmentLeaderboardRowDTO, double d14, boolean z14) {
        switch (dVar == null ? -1 : a.f64005a[dVar.ordinal()]) {
            case -1:
                String string = activity.getString(R.string.no_value);
                string.getClass();
                return string;
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                long j8 = segmentLeaderboardRowDTO.f41245w;
                if (j8 > 0) {
                    l3.f23124b.getClass();
                    return l3.a.b1(j8);
                }
                String string2 = activity.getString(R.string.no_value);
                string2.getClass();
                return string2;
            case 2:
                double d15 = d(segmentLeaderboardRowDTO, d14);
                q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.f23124b.getClass();
                return l3.a.N0(activity, d15, q3Var, l3.f23130h, true, activity.getString(R.string.no_value));
            case 3:
                double d16 = d(segmentLeaderboardRowDTO, d14);
                l3.a aVar = l3.f23124b;
                String string3 = activity.getString(R.string.no_duration_value);
                string3.getClass();
                aVar.getClass();
                return aVar.J1(activity, d16, false, z14, true, string3);
            case 4:
                String strL0 = l3.a.l0(l3.f23124b, new l22.a(activity), segmentLeaderboardRowDTO.f41230f, true);
                if (!TextUtils.isEmpty(strL0)) {
                    return strL0;
                }
                String string4 = activity.getString(R.string.no_value);
                string4.getClass();
                return string4;
            case 5:
                double d17 = segmentLeaderboardRowDTO.f41235k;
                q3 q3Var2 = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.f23124b.getClass();
                return e5.g(l3.f23130h.format(Math.round(d17 * (z14 ? 1.609344d : 1.0d))), StringUtils.SPACE, activity.getString(q3Var2.f23223e));
            case 6:
                String str = segmentLeaderboardRowDTO.f41228d;
                str.getClass();
                try {
                    String str2 = new SimpleDateFormat("MM-dd-yyyy", Locale.getDefault()).format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str));
                    str2.getClass();
                    return str2;
                } catch (ParseException unused) {
                    String string5 = activity.getString(R.string.no_value);
                    string5.getClass();
                    return string5;
                }
            case 7:
                String strF0 = l3.a.F0(l3.f23124b, activity, segmentLeaderboardRowDTO.f41232h, true);
                if (!TextUtils.isEmpty(strF0)) {
                    return strF0;
                }
                String string6 = activity.getString(R.string.no_value);
                string6.getClass();
                return string6;
        }
    }

    public static double d(SegmentLeaderboardRowDTO segmentLeaderboardRowDTO, double d14) {
        long j8 = segmentLeaderboardRowDTO.f41245w;
        if (j8 == 0) {
            return 0.0d;
        }
        return (d14 * 1000.0d) / ((double) (j8 / 1000));
    }
}
