package ch1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/w1;", "Lfb2/e;", "Lmh1/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w1 extends fb2.e<mh1.l> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27490e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GCMComplexTwoLineButton f27491d;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context) {
        super(context);
        context.getClass();
        this.f27491d = new GCMComplexTwoLineButton(context);
    }

    @Override // fb2.e
    public final View a() {
        return this.f27491d;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, mh1.l] */
    @Override // fb2.e
    public final boolean g(i.c cVar, mh1.l lVar) {
        mh1.l lVar2 = lVar;
        cVar.getClass();
        lVar2.getClass();
        this.f70344b = lVar2;
        p();
        return true;
    }

    @Override // fb2.e
    public final boolean h(mh1.l lVar) {
        lVar.getClass();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, mh1.l] */
    @Override // fb2.e
    public final boolean k(mh1.l lVar) {
        mh1.l lVar2 = lVar;
        lVar2.getClass();
        this.f70344b = lVar2;
        p();
        return true;
    }

    @Override // fb2.e
    public final void m(boolean z14) {
        super.m(z14);
        this.f27491d.setVisible(z14);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        mh1.l lVar = (mh1.l) this.f70344b;
        String str = lVar != null ? lVar.f118482a : null;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f27491d;
        gCMComplexTwoLineButton.setButtonTopLabel(str);
        gCMComplexTwoLineButton.e(false);
        gCMComplexTwoLineButton.c(true);
        mh1.l lVar2 = (mh1.l) this.f70344b;
        String strA = lVar2 != null ? lVar2.f118483b : "";
        if (!d53.w.z(strA, ".", false)) {
            strA = uv.j.a(strA);
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(c(R.string.device_settings_vector_firmware_version, strA));
        gCMComplexTwoLineButton.d(false);
        ViewGroup.LayoutParams buttonRightLayoutParams = gCMComplexTwoLineButton.getButtonRightLayoutParams();
        if (buttonRightLayoutParams != null) {
            buttonRightLayoutParams.width = -2;
        }
        gCMComplexTwoLineButton.setButtonRightLayoutParams(buttonRightLayoutParams);
        gCMComplexTwoLineButton.setButtonRightTextAppearance(R.style.Text_Body1_Medium_Primary);
        gCMComplexTwoLineButton.setButtonRightLabelTextColor(R.color.gcm_text_primary_action);
        if (strA.length() == 0) {
            gCMComplexTwoLineButton.setButtonRightLabel(-1);
        } else {
            int i14 = Integer.parseInt((String) p13.h0.b0(d53.w.W(strA, new String[]{"."})));
            j23.l lVar3 = new j23.l(0, 2);
            if (i14 > lVar3.f96797b || lVar3.f96796a > i14) {
                gCMComplexTwoLineButton.setButtonRightLabel(-1);
            } else {
                gCMComplexTwoLineButton.setButtonRightLabel(b(R.string.lbl_update_needed));
            }
        }
        gCMComplexTwoLineButton.setSecondActionOnClickListener(new a32.b(this, 26));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/w1$a;", "", "<init>", "()V", "", "MIN_UPDATABLE_INDEX_S2_MAJOR_FW_VERSION", "I", "MAX_UPDATABLE_INDEX_S2_MAJOR_FW_VERSION", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
