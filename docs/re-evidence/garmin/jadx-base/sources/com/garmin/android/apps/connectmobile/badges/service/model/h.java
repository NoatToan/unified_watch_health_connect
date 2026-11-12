package com.garmin.android.apps.connectmobile.badges.service.model;

import d53.w;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/h;", "", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f30584a;

    static {
        new a(null);
        f30584a = new String[]{"badge_title_", "badge_description_", "badge_challenge_rule_description_", "badge_challenge_rules_summary_", "badge_challenge_rule_earn_", "badge_challenge_reward_details_", "badge_challenge_reward_terms_", "badge_location_", "badge_range_", "badge_challenge_additional_rule_1_", "badge_challenge_additional_rule_2_", "badge_challenge_rules_summary_additional_subhead_1_", "badge_challenge_rules_summary_additional_section_1_", "expedition_details_desc_1_hike", "expedition_details_desc_1_climb", "expedition_details_desc_2", "expedition_details_desc_3", "badge_challenge_redeem_reward_header_", "badge_challenge_redeem_reward_message_", "badge_challenge_redeem_reward_footer_"};
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    public static k7.d a(String str, String str2) {
        String string;
        String string2;
        Collection collectionS0;
        if (w.z(str, str2, false)) {
            List listG = new d53.k("=").g(2, str.substring(str2.length()));
            if (!listG.isEmpty()) {
                ListIterator listIterator = listG.listIterator(listG.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionS0 = j0.f134944a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                collectionS0 = j0.f134944a;
                break;
            }
            String[] strArr = (String[]) collectionS0.toArray(new String[0]);
            if (strArr.length > 1) {
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i14 = 0;
                boolean z14 = false;
                while (i14 <= length) {
                    boolean z15 = p005kotlin.jvm.internal.s.h(str3.charAt(!z14 ? i14 : length), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        }
                        length--;
                    } else if (z15) {
                        i14++;
                    } else {
                        z14 = true;
                    }
                }
                string2 = str3.subSequence(i14, length + 1).toString();
                String str4 = strArr[1];
                int length2 = str4.length() - 1;
                int i15 = 0;
                boolean z16 = false;
                while (i15 <= length2) {
                    boolean z17 = p005kotlin.jvm.internal.s.h(str4.charAt(!z16 ? i15 : length2), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            break;
                        }
                        length2--;
                    } else if (z17) {
                        i15++;
                    } else {
                        z16 = true;
                    }
                }
                string = str4.subSequence(i15, length2 + 1).toString();
            } else {
                string = null;
                string2 = null;
            }
        } else {
            string = null;
            string2 = null;
        }
        if (string2 != null) {
            return new k7.d(string2, string);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EQUALS_SEPARATOR", "BADGE_TITLE_TYPE", "BADGE_LOCATION_TYPE", "BADGE_RANGE_TYPE", "BADGE_DESCRIPTION_TYPE", "CHALLENGE_RULE_DESCRIPTION_TYPE", "CHALLENGE_RULE_EARN_TYPE", "CHALLENGE_RULES_SUMMARY_TYPE", "CHALLENGE_REWARD_DETAILS", "CHALLENGE_REWARD_TERMS", "CHALLENGE_ADDITIONAL_RULE_1", "CHALLENGE_ADDITIONAL_RULE_2", "CHALLENGE_RULES_SUMMARY_ADDITIONAL_SUBHEAD_1", "CHALLENGE_RULES_SUMMARY_ADDITIONAL_SECTION_1", "EXPEDITION_DETAILS_DESC_1_HIKE", "EXPEDITION_DETAILS_DESC_1_CLIMB", "EXPEDITION_DETAILS_DESC_2", "EXPEDITION_DETAILS_DESC_3", "CHALLENGE_REDEEM_REWARD_HEADER", "CHALLENGE_REDEEM_REWARD_MESSAGE", "CHALLENGE_REDEEM_REWARD_FOOTER", "", "TRANSLATED_FIELDS", "[Ljava/lang/String;", "BADGES_LIST_TRANSLATIONS_URL", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
