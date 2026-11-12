package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.service.LikeOnCommentService;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/z;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f155441a = 0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155442a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.MEMBER_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.GROUP_INVITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.GROUP_INVITE_ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n00.c.GROUP_JOIN_ADMIN_ACCEPTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n00.c.LIKED_ON_GROUP_ACTIVITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n00.c.LIKED_ON_GROUP_ACTIVITY_COMMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n00.c.COMMENTED_ON_GROUP_ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n00.c.ALSO_COMMENTED_ON_GROUP_ACTIVITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n00.c.GROUP_NEWS_POST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n00.c.LIKED_ON_GROUP_NEWS_POST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[n00.c.LIKED_ON_GROUP_NEWS_POST_COMMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[n00.c.COMMENTED_ON_GROUP_NEWS_POST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[n00.c.ALSO_COMMENTED_ON_GROUP_NEWS_POST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[n00.c.GROUP_ANNOUNCEMENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f155442a = iArr;
        }
    }

    static {
        new a(null);
    }

    public static z6.k f(Context context, String str, String str2) {
        po1.m.f139065a.getClass();
        str.getClass();
        int iHashCode = str.hashCode();
        Intent intent = new Intent(context, (Class<?>) LikeOnCommentService.class);
        intent.putExtra("GCM_conversation_comment_id", str2);
        intent.putExtra("extra.notification.id", iHashCode);
        return new z6.k(0, context.getString(R.string.lbl_like), PendingIntent.getService(context, iHashCode, intent, 201326592));
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        switch (b.f155442a[cVar.ordinal()]) {
            case 1:
                String string = bundle.getString("requestor-name");
                String string2 = bundle.getString("group-name");
                String string3 = bundle.getString("profileImage-url");
                String string4 = bundle.getString("framedProfileImage-url");
                String string5 = garminConnectMobileApp.getString(R.string.pn_member_request, string, string2);
                string5.getClass();
                String string6 = garminConnectMobileApp.getString(R.string.pn_new_member_request);
                string6.getClass();
                String string7 = bundle.getString("requestor-display-name");
                if (string7 != null) {
                    og2.k.z(garminConnectMobileApp, new x(garminConnectMobileApp, string7, string, string3, string5, string6), string4 == null ? string3 : string4);
                }
                break;
            case 2:
                String string8 = bundle.getString("group-name");
                String string9 = bundle.getString("group-id");
                String string10 = bundle.getString("invitor-name");
                String string11 = bundle.getString("profileImage-url");
                String string12 = bundle.getString("framedProfileImage-url");
                String string13 = garminConnectMobileApp.getString(R.string.pn_group_invite, string10, string8);
                string13.getClass();
                String string14 = garminConnectMobileApp.getString(R.string.pn_new_group_invitation);
                string14.getClass();
                if (string9 != null) {
                    og2.k.z(garminConnectMobileApp, new y(garminConnectMobileApp, string9, string8, string13, string14, 3), string12 == null ? string11 : string12);
                }
                break;
            case 3:
                String string15 = bundle.getString("group-name");
                String string16 = bundle.getString("group-id");
                String string17 = bundle.getString("invitee-name");
                String string18 = bundle.getString("profileImage-url");
                String string19 = bundle.getString("framedProfileImage-url");
                String string20 = garminConnectMobileApp.getString(R.string.pn_group_invite_accepted, string17, string15);
                string20.getClass();
                String string21 = garminConnectMobileApp.getString(R.string.pn_shareable_device_accept_title);
                string21.getClass();
                if (string16 != null) {
                    og2.k.z(garminConnectMobileApp, new y(garminConnectMobileApp, string16, string15, string20, string21, 5), string19 == null ? string18 : string19);
                }
                break;
            case 4:
                String string22 = bundle.getString("admin-name");
                String string23 = bundle.getString("group-name");
                String string24 = bundle.getString("group-id");
                String string25 = bundle.getString("profileImage-url");
                String string26 = bundle.getString("framedProfileImage-url");
                String string27 = garminConnectMobileApp.getString(R.string.pn_member_request_accepted_with_group_name, string22, string23);
                string27.getClass();
                String string28 = garminConnectMobileApp.getString(R.string.pn_group_request_accepted);
                string28.getClass();
                if (string24 != null) {
                    og2.k.z(garminConnectMobileApp, new y(garminConnectMobileApp, string24, string23, string27, string28, 2), string26 == null ? string25 : string26);
                }
                break;
            case 5:
                String string29 = bundle.getString("fromUser-name");
                String string30 = bundle.getString("group-name");
                String string31 = bundle.getString("group-id");
                String string32 = bundle.getString("profileImage-url");
                String string33 = bundle.getString("framedProfileImage-url");
                String string34 = bundle.getString("activity-id");
                String string35 = garminConnectMobileApp.getString(R.string.pn_group_activity_is_liked_with_dot, string29);
                string35.getClass();
                String string36 = garminConnectMobileApp.getString(R.string.pn_title_new_like_in_group, string30);
                string36.getClass();
                if (string34 != null) {
                    if (string33 == null) {
                        string33 = string32;
                    }
                    og2.k.z(garminConnectMobileApp, new y(string31, this, garminConnectMobileApp, string34, string35, string36, 1), string33);
                }
                break;
            case 6:
                String string37 = bundle.getString("fromUser-name");
                String string38 = bundle.getString("group-name");
                String string39 = bundle.getString("group-id");
                String string40 = bundle.getString("profileImage-url");
                String string41 = bundle.getString("framedProfileImage-url");
                String string42 = bundle.getString("activity-id");
                String string43 = bundle.getString("comment-uuid");
                String string44 = garminConnectMobileApp.getString(R.string.pn_group_activity_comment_is_liked, string37, bundle.getString("comment-text"));
                string44.getClass();
                String string45 = garminConnectMobileApp.getString(R.string.pn_title_new_like_in_group, string38);
                string45.getClass();
                if (string42 != null) {
                    if (string41 == null) {
                        string41 = string40;
                    }
                    og2.k.z(garminConnectMobileApp, new x(string39, this, garminConnectMobileApp, string42, string43, string44, string45, 2), string41);
                }
                break;
            case 7:
                String string46 = bundle.getString("fromUser-name");
                String string47 = bundle.getString("group-name");
                String string48 = bundle.getString("group-id");
                String string49 = bundle.getString("profileImage-url");
                String string50 = bundle.getString("framedProfileImage-url");
                String string51 = bundle.getString("activity-id");
                String string52 = bundle.getString("comment-uuid");
                String string53 = garminConnectMobileApp.getString(R.string.pn_commented_on_group_activity_format, string46, bundle.getString("comment-text"));
                string53.getClass();
                String string54 = garminConnectMobileApp.getString(R.string.pn_title_new_comment_in_group, string47);
                string54.getClass();
                if (string51 != null) {
                    if (string50 == null) {
                        string50 = string49;
                    }
                    og2.k.z(garminConnectMobileApp, new x(string48, string52, this, garminConnectMobileApp, string51, string53, string54, 5), string50);
                }
                break;
            case 8:
                String string55 = bundle.getString("fromUser-name");
                String string56 = bundle.getString("group-name");
                String string57 = bundle.getString("group-id");
                String string58 = bundle.getString("profileImage-url");
                String string59 = bundle.getString("framedProfileImage-url");
                String string60 = bundle.getString("activity-id");
                String string61 = bundle.getString("activity-name");
                String string62 = bundle.getString("comment-uuid");
                String string63 = bundle.getString("comment-text");
                String string64 = g22.n.d(string61) ? garminConnectMobileApp.getString(R.string.pn_commented_on_group_activity_thread_format, string55, string61, string63) : garminConnectMobileApp.getString(R.string.pn_commented_on_group_activity_thread_without_activity_name_format, string55, string63);
                string64.getClass();
                String string65 = garminConnectMobileApp.getString(R.string.pn_title_new_comment_in_group, string56);
                string65.getClass();
                if (string60 != null) {
                    if (string59 == null) {
                        string59 = string58;
                    }
                    og2.k.z(garminConnectMobileApp, new x(string57, string62, this, garminConnectMobileApp, string60, string64, string65, 4), string59);
                }
                break;
            case 9:
                String string66 = bundle.getString("fromUser-name");
                String string67 = bundle.getString("group-name");
                String string68 = bundle.getString("group-id");
                String string69 = bundle.getString("newspost-id");
                String string70 = bundle.getString(FirebaseAnalytics.Param.CONTENT);
                String string71 = bundle.getString("profileImage-url");
                String string72 = bundle.getString("framedProfileImage-url");
                String string73 = (string70 == null || d53.w.J(string70)) ? garminConnectMobileApp.getString(R.string.pn_pushnotification_group_post_without_text, string66) : garminConnectMobileApp.getString(R.string.pn_pushnotification_group_news_post, string66, string70);
                string73.getClass();
                String string74 = garminConnectMobileApp.getString(R.string.pn_new_post_in, string67);
                string74.getClass();
                if (string69 != null) {
                    og2.k.z(garminConnectMobileApp, new y(string68, this, garminConnectMobileApp, string69, string73, string74, 0), string72 == null ? string71 : string72);
                }
                break;
            case 10:
                String string75 = bundle.getString("fromUser-name");
                String string76 = bundle.getString("group-name");
                String string77 = bundle.getString("group-id");
                String string78 = bundle.getString("profileImage-url");
                String string79 = bundle.getString("framedProfileImage-url");
                String string80 = bundle.getString("newspost-id");
                String string81 = bundle.getString(FirebaseAnalytics.Param.CONTENT);
                String string82 = (string81 == null || d53.w.J(string81)) ? garminConnectMobileApp.getString(R.string.pn_pushnotification_liked_on_group_post_without_text, string75) : garminConnectMobileApp.getString(R.string.pn_pushnotification_liked_on_group_post, string75, string81);
                string82.getClass();
                String string83 = garminConnectMobileApp.getString(R.string.pn_title_new_like_in_group, string76);
                string83.getClass();
                if (string80 != null) {
                    if (string79 != null) {
                        string78 = string79;
                    }
                    og2.k.z(garminConnectMobileApp, new y(string77, this, garminConnectMobileApp, string80, string82, string83, 4), string78);
                }
                break;
            case 11:
                String string84 = bundle.getString("fromUser-name");
                String string85 = bundle.getString("group-name");
                String string86 = bundle.getString("group-id");
                String string87 = bundle.getString("profileImage-url");
                String string88 = bundle.getString("framedProfileImage-url");
                String string89 = bundle.getString("newspost-id");
                String string90 = bundle.getString("comment-uuid");
                String string91 = garminConnectMobileApp.getString(R.string.pn_pushnotification_liked_on_group_post_comment, string84, bundle.getString("comment-text"));
                string91.getClass();
                String string92 = garminConnectMobileApp.getString(R.string.pn_title_new_like_in_group, string85);
                string92.getClass();
                if (string89 != null) {
                    if (string88 == null) {
                        string88 = string87;
                    }
                    og2.k.z(garminConnectMobileApp, new x(string86, this, garminConnectMobileApp, string89, string90, string91, string92, 0), string88);
                }
                break;
            case 12:
                String string93 = bundle.getString("fromUser-name");
                String string94 = bundle.getString("group-name");
                String string95 = bundle.getString("group-id");
                String string96 = bundle.getString("profileImage-url");
                String string97 = bundle.getString("framedProfileImage-url");
                String string98 = bundle.getString("newspost-id");
                String string99 = bundle.getString("comment-uuid");
                String string100 = garminConnectMobileApp.getString(R.string.pn_pushnotification_commented_on_group_news_post, string93, bundle.getString("comment-text"));
                string100.getClass();
                String string101 = garminConnectMobileApp.getString(R.string.pn_title_new_comment_in_group, string94);
                string101.getClass();
                if (string98 != null) {
                    if (string97 == null) {
                        string97 = string96;
                    }
                    og2.k.z(garminConnectMobileApp, new x(string95, string99, this, garminConnectMobileApp, string98, string100, string101, 6), string97);
                }
                break;
            case 13:
                String string102 = bundle.getString("fromUser-name");
                String string103 = bundle.getString("group-name");
                String string104 = bundle.getString("group-id");
                String string105 = bundle.getString("profileImage-url");
                String string106 = bundle.getString("framedProfileImage-url");
                String string107 = bundle.getString("newspost-id");
                String string108 = bundle.getString("comment-uuid");
                String string109 = garminConnectMobileApp.getString(R.string.pn_pushnotification_also_commented_on_group_news_post, string102, bundle.getString("comment-text"));
                string109.getClass();
                String string110 = garminConnectMobileApp.getString(R.string.pn_title_new_comment_in_group, string103);
                string110.getClass();
                if (string107 != null) {
                    if (string106 == null) {
                        string106 = string105;
                    }
                    og2.k.z(garminConnectMobileApp, new x(string104, string108, this, garminConnectMobileApp, string107, string109, string110, 1), string106);
                }
                break;
            case 14:
                String string111 = bundle.getString("fromUser-name");
                String string112 = bundle.getString("group-name");
                String string113 = bundle.getString("group-id");
                String string114 = garminConnectMobileApp.getString(R.string.pn_pushnotification_group_announcement, string111, bundle.getString(FirebaseAnalytics.Param.CONTENT));
                string114.getClass();
                String string115 = garminConnectMobileApp.getString(R.string.pn_new_announcement_in_group, string112);
                string115.getClass();
                if (string113 != null) {
                    po1.l lVar = new po1.l(garminConnectMobileApp, string113, ((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).x(garminConnectMobileApp, string113, string112, Boolean.TRUE), null, string114, string115, null, 64, null);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(lVar);
                    ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                }
                break;
            default:
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "GroupPushNotificationHandler", "onPushNotificationReceived: " + cVar + " not handled");
                break;
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.GROUP_INVITE, n00.c.MEMBER_REQUEST, n00.c.GROUP_INVITE_ACCEPTED, n00.c.GROUP_JOIN_ADMIN_ACCEPTED, n00.c.LIKED_ON_GROUP_ACTIVITY, n00.c.LIKED_ON_GROUP_ACTIVITY_COMMENT, n00.c.COMMENTED_ON_GROUP_NEWS_POST, n00.c.COMMENTED_ON_GROUP_ACTIVITY, n00.c.ALSO_COMMENTED_ON_GROUP_NEWS_POST, n00.c.ALSO_COMMENTED_ON_GROUP_ACTIVITY, n00.c.GROUP_NEWS_POST, n00.c.GROUP_ANNOUNCEMENT, n00.c.LIKED_ON_GROUP_NEWS_POST, n00.c.LIKED_ON_GROUP_NEWS_POST_COMMENT};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Ls00/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_GROUP_ID", "KEY_GROUP_NAME", "KEY_REQUESTER_NAME", "KEY_REQUESTER_DISPLAY_NAME", "KEY_INVITOR_NAME", "KEY_INVITEE_NAME", "KEY_FROM_USER_NAME", "KEY_PROFILE_IMAGE_URL", "KEY_FRAMED_PROFILE_IMAGE_URL", "KEY_ACTIVITY_NAME", "KEY_ACTIVITY_ID", "KEY_COMMENT_ID", "KEY_COMMENT_TEXT", "KEY_POST_ID", "KEY_CONTENT", "KEY_POST_IMAGE_URL", "KEY_ADMIN_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
