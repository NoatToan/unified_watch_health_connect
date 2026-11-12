package g10;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import o13.e;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010$\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010#R!\u0010,\u001a\u00020 8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010\f\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010#R\u001b\u0010/\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010#R\u001b\u00102\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010#R\u001b\u00105\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\f\u001a\u0004\b4\u0010#R\u001b\u0010:\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\f\u001a\u0004\bF\u0010\u0013R\u001b\u0010J\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\f\u001a\u0004\bI\u0010#R\u001b\u0010M\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\f\u001a\u0004\bL\u0010#¨\u0006N"}, d2 = {"Lg10/b;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/garmin/android/apps/connectmobile/view/UserLevelImageView;", "a", "Lo13/l;", "getProfilePic", "()Lcom/garmin/android/apps/connectmobile/view/UserLevelImageView;", "profilePic", "Landroid/view/View;", "b", "getConnectButton", "()Landroid/view/View;", "connectButton", "c", "getUnblockButton", "unblockButton", "Landroid/widget/Button;", "d", "getIgnoreButton", "()Landroid/widget/Button;", "ignoreButton", JWKParameterNames.RSA_EXPONENT, "getAcceptButton", "acceptButton", "Landroid/widget/TextView;", "f", "getDataLine1", "()Landroid/widget/TextView;", "dataLine1", "g", "getDataLine2", "dataLine2", "h", "getHeaderLetter", "getHeaderLetter$annotations", "()V", "headerLetter", IntegerTokenConverter.CONVERTER_KEY, "getAddText", "addText", "j", "getInviteTxt", "inviteTxt", JWKParameterNames.OCT_KEY_VALUE, "getAcceptedTxt", "acceptedTxt", "Landroid/view/ViewGroup;", "l", "getRequestsLayout", "()Landroid/view/ViewGroup;", "requestsLayout", "Landroid/widget/ProgressBar;", "m", "getActionProgress", "()Landroid/widget/ProgressBar;", "actionProgress", "Landroid/widget/ImageView;", JWKParameterNames.RSA_MODULUS, "getSelectedCheckmark", "()Landroid/widget/ImageView;", "selectedCheckmark", "o", "getFooter", "footer", "p", "getSectionFooter", "sectionFooter", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getSectionHeader", "sectionHeader", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f74810r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f74811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f74812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f74813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f74814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f74815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f74816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f74817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f74818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f74819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f74820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f74821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f74822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f74823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f74824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f74825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f74826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f74827q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        final int i15 = 0;
        this.f74811a = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                b bVar = this.f74809b;
                switch (i16) {
                    case 0:
                        int i17 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i18 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i19 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i24 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i25 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i16 = 15;
        this.f74812b = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                b bVar = this.f74809b;
                switch (i17) {
                    case 0:
                        int i18 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i19 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i110 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i24 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i25 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i17 = 16;
        this.f74813c = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                b bVar = this.f74809b;
                switch (i18) {
                    case 0:
                        int i19 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i110 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i111 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i24 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i25 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i18 = 1;
        this.f74814d = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                b bVar = this.f74809b;
                switch (i19) {
                    case 0:
                        int i110 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i111 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i24 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i25 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i19 = 2;
        this.f74815e = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i24 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i25 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i24 = 3;
        this.f74816f = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i24;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i25 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i25 = 4;
        this.f74817g = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i25;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i26 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i26 = 5;
        this.f74818h = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i26;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i27 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i27 = 6;
        this.f74819i = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i27;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i28 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i28 = 7;
        this.f74820j = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i28;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i29 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i29 = 8;
        this.f74821k = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i29;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i30 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i34 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i35 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i36 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i37 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i30 = 9;
        this.f74822l = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i30;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i34 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i35 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i36 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i37 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i38 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i39 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i310 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i34 = 10;
        this.f74823m = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i34;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i35 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i36 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i37 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i38 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i39 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i310 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i311 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i35 = 11;
        this.f74824n = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i35;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i36 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i37 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i38 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i39 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i310 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i311 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i312 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i36 = 12;
        this.f74825o = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i36;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i37 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i38 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i39 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i310 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i311 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i312 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i313 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i37 = 13;
        this.f74826p = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i37;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i38 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i39 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i310 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i311 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i312 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i313 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i314 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        final int i38 = 14;
        this.f74827q = m.b(new e23.a(this) { // from class: g10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f74809b;

            {
                this.f74809b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i38;
                b bVar = this.f74809b;
                switch (i110) {
                    case 0:
                        int i111 = b.f74810r;
                        return (UserLevelImageView) bVar.findViewById(R.id.profile_image_view);
                    case 1:
                        int i112 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsIgnoreRequestBtn);
                    case 2:
                        int i113 = b.f74810r;
                        return (Button) bVar.findViewById(R.id.connectionsAcceptRequestBtn);
                    case 3:
                        int i210 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.full_name_text_view);
                    case 4:
                        int i211 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_hint_text_view);
                    case 5:
                        int i212 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connectionHeaderLetter);
                    case 6:
                        int i213 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.request_sent_text_view);
                    case 7:
                        int i214 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_can_invite_to_add_index_scale);
                    case 8:
                        int i215 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.connection_accepted_invite_index_scale);
                    case 9:
                        int i39 = b.f74810r;
                        return (ViewGroup) bVar.findViewById(R.id.requests_layout);
                    case 10:
                        int i310 = b.f74810r;
                        return (ProgressBar) bVar.findViewById(R.id.connectionAddProgress);
                    case 11:
                        int i311 = b.f74810r;
                        return (ImageView) bVar.findViewById(R.id.connection_row_selected);
                    case 12:
                        int i312 = b.f74810r;
                        return bVar.findViewById(R.id.connectionFooter);
                    case 13:
                        int i313 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionFooter);
                    case 14:
                        int i314 = b.f74810r;
                        return (TextView) bVar.findViewById(R.id.sectionHeader);
                    case 15:
                        int i315 = b.f74810r;
                        return bVar.findViewById(R.id.connect_text_view);
                    default:
                        int i44 = b.f74810r;
                        return bVar.findViewById(R.id.unblock_text_view);
                }
            }
        });
        LayoutInflater.from(context).inflate(R.layout.gcm_connection_row_view, (ViewGroup) this, true);
        setOrientation(1);
        if (c22.b.e(context)) {
            Resources resources = context.getResources();
            resources.getClass();
            int iC = (int) c22.b.c(context, xy2.b.n(resources, 40.0f), 1.5f);
            getProfilePic().getLayoutParams().height = iC;
            getProfilePic().getLayoutParams().width = iC;
        }
    }

    @e
    public static /* synthetic */ void getHeaderLetter$annotations() {
    }

    public final Button getAcceptButton() {
        Object value = this.f74815e.getValue();
        value.getClass();
        return (Button) value;
    }

    public final TextView getAcceptedTxt() {
        Object value = this.f74821k.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final ProgressBar getActionProgress() {
        Object value = this.f74823m.getValue();
        value.getClass();
        return (ProgressBar) value;
    }

    public final TextView getAddText() {
        Object value = this.f74819i.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final View getConnectButton() {
        Object value = this.f74812b.getValue();
        value.getClass();
        return (View) value;
    }

    public final TextView getDataLine1() {
        Object value = this.f74816f.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final TextView getDataLine2() {
        Object value = this.f74817g.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final View getFooter() {
        Object value = this.f74825o.getValue();
        value.getClass();
        return (View) value;
    }

    public final TextView getHeaderLetter() {
        Object value = this.f74818h.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final Button getIgnoreButton() {
        Object value = this.f74814d.getValue();
        value.getClass();
        return (Button) value;
    }

    public final TextView getInviteTxt() {
        Object value = this.f74820j.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final UserLevelImageView getProfilePic() {
        Object value = this.f74811a.getValue();
        value.getClass();
        return (UserLevelImageView) value;
    }

    public final ViewGroup getRequestsLayout() {
        Object value = this.f74822l.getValue();
        value.getClass();
        return (ViewGroup) value;
    }

    public final TextView getSectionFooter() {
        Object value = this.f74826p.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final TextView getSectionHeader() {
        Object value = this.f74827q.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final ImageView getSelectedCheckmark() {
        Object value = this.f74824n.getValue();
        value.getClass();
        return (ImageView) value;
    }

    public final View getUnblockButton() {
        Object value = this.f74813c.getValue();
        value.getClass();
        return (View) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
