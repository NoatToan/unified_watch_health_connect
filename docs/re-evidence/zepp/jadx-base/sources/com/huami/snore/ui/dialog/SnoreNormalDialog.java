package com.huami.snore.ui.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.R;
import com.huami.snore.ui.base.BaseDialogFragment;
import com.huami.snore.ui.dialog.SnoreNormalDialog;
import com.huami.snore.ui.util.CommonUiUtil;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0002STB\u0007¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010'\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010K\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010FR\u0016\u0010M\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010P\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lcom/huami/snore/ui/dialog/SnoreNormalDialog;", "Lcom/huami/snore/ui/base/BaseDialogFragment;", "", "hasPadding", "Landroid/view/View;", "initView", "", "onStart", "", "e", "Ljava/lang/String;", "getMTitle", "()Ljava/lang/String;", "setMTitle", "(Ljava/lang/String;)V", "mTitle", "f", "getMDesc", "setMDesc", "mDesc", "g", "getMOkText", "setMOkText", "mOkText", "h", "getMCancelText", "setMCancelText", "mCancelText", "", "i", "Ljava/lang/Integer;", "getMOkTextColor", "()Ljava/lang/Integer;", "setMOkTextColor", "(Ljava/lang/Integer;)V", "mOkTextColor", z.j, "getMCancelTextColor", "setMCancelTextColor", "mCancelTextColor", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", hl.k, "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", "getMTitleStyle", "()Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", "setMTitleStyle", "(Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;)V", "mTitleStyle", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "l", "Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "getMButtonStyle", "()Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "setMButtonStyle", "(Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;)V", "mButtonStyle", "Lkotlin/Function0;", "m", "Lkotlin/jvm/functions/Function0;", "getMOkListener", "()Lkotlin/jvm/functions/Function0;", "setMOkListener", "(Lkotlin/jvm/functions/Function0;)V", "mOkListener", GoogleApiAvailabilityLight.b, "getMCancelListener", "setMCancelListener", "mCancelListener", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "titleTv", b.r, "descTv", DTransferConstants.SEARCH_KEY, "btnOk", "r", "btnCancel", SOAP.XMLNS, "Landroid/view/View;", "bottomLine", "<init>", "()V", "ButtonStyle", "TileStyle", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreNormalDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Integer mOkTextColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Integer mCancelTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> mOkListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> mCancelListener;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private TextView titleTv;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private TextView descTv;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private TextView btnOk;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private TextView btnCancel;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private View bottomLine;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String mTitle = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String mDesc = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String mOkText = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String mCancelText = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private TileStyle mTitleStyle = TileStyle.NO_TITLE;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private ButtonStyle mButtonStyle = ButtonStyle.TWO;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/snore/ui/dialog/SnoreNormalDialog$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ONE", "TWO", "snore_release"}, k = 1, mv = {1, 5, 1})
    public enum ButtonStyle {
        ONE,
        TWO
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/snore/ui/dialog/SnoreNormalDialog$TileStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NO_TITLE", ShareConstants.TITLE, "snore_release"}, k = 1, mv = {1, 5, 1})
    public enum TileStyle {
        NO_TITLE,
        TITLE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TileStyle.values().length];
            iArr[TileStyle.TITLE.ordinal()] = 1;
            iArr[TileStyle.NO_TITLE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            iArr2[ButtonStyle.ONE.ordinal()] = 1;
            iArr2[ButtonStyle.TWO.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SnoreNormalDialog snoreNormalDialog, View view) {
        snoreNormalDialog.dismiss();
        Function0<Unit> mOkListener = snoreNormalDialog.getMOkListener();
        if (mOkListener == null) {
            return;
        }
        mOkListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SnoreNormalDialog snoreNormalDialog, View view) {
        snoreNormalDialog.dismiss();
        Function0<Unit> mCancelListener = snoreNormalDialog.getMCancelListener();
        if (mCancelListener == null) {
            return;
        }
        mCancelListener.invoke();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ButtonStyle getMButtonStyle() {
        return this.mButtonStyle;
    }

    @Nullable
    public final Function0<Unit> getMCancelListener() {
        return this.mCancelListener;
    }

    @Nullable
    public final String getMCancelText() {
        return this.mCancelText;
    }

    @Nullable
    public final Integer getMCancelTextColor() {
        return this.mCancelTextColor;
    }

    @Nullable
    public final String getMDesc() {
        return this.mDesc;
    }

    @Nullable
    public final Function0<Unit> getMOkListener() {
        return this.mOkListener;
    }

    @Nullable
    public final String getMOkText() {
        return this.mOkText;
    }

    @Nullable
    public final Integer getMOkTextColor() {
        return this.mOkTextColor;
    }

    @Nullable
    public final String getMTitle() {
        return this.mTitle;
    }

    @NotNull
    public final TileStyle getMTitleStyle() {
        return this.mTitleStyle;
    }

    @Override // com.huami.snore.ui.base.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.snore.ui.base.BaseDialogFragment
    @NotNull
    public View initView() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = R.layout.dialog_snore_function_intro_layout;
        View view = getView();
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflater.inflate(i, (ViewGroup) view, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        this.titleTv = textView;
        Objects.requireNonNull(textView);
        textView.setText(this.mTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.desc);
        this.descTv = textView2;
        Objects.requireNonNull(textView2);
        textView2.setText(this.mDesc);
        this.btnOk = (TextView) viewInflate.findViewById(R.id.btnOk);
        this.bottomLine = viewInflate.findViewById(R.id.midLine);
        TextView textView3 = this.btnOk;
        Objects.requireNonNull(textView3);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: z57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnoreNormalDialog.e(this.a, view2);
            }
        });
        Integer num = this.mOkTextColor;
        if (num != null) {
            num.intValue();
            TextView textView4 = this.btnOk;
            Objects.requireNonNull(textView4);
            textView4.setTextColor(ContextCompat.getColor(requireContext(), getMOkTextColor().intValue()));
        }
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.btnCancel);
        this.btnCancel = textView5;
        Objects.requireNonNull(textView5);
        textView5.setOnClickListener(new View.OnClickListener() { // from class: a67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnoreNormalDialog.f(this.a, view2);
            }
        });
        TextView textView6 = this.btnOk;
        Objects.requireNonNull(textView6);
        textView6.setText(this.mOkText);
        TextView textView7 = this.btnCancel;
        Objects.requireNonNull(textView7);
        textView7.setText(this.mCancelText);
        Integer num2 = this.mCancelTextColor;
        if (num2 != null) {
            num2.intValue();
            TextView textView8 = this.btnCancel;
            Objects.requireNonNull(textView8);
            textView8.setTextColor(ContextCompat.getColor(requireContext(), getMCancelTextColor().intValue()));
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.mTitleStyle.ordinal()];
        if (i2 == 1) {
            TextView textView9 = this.titleTv;
            Objects.requireNonNull(textView9);
            textView9.setVisibility(0);
        } else if (i2 == 2) {
            TextView textView10 = this.titleTv;
            Objects.requireNonNull(textView10);
            textView10.setVisibility(8);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[this.mButtonStyle.ordinal()];
        if (i3 == 1) {
            TextView textView11 = this.btnCancel;
            Objects.requireNonNull(textView11);
            textView11.setVisibility(8);
            TextView textView12 = this.btnOk;
            Objects.requireNonNull(textView12);
            textView12.setVisibility(0);
            View view2 = this.bottomLine;
            Objects.requireNonNull(view2);
            view2.setVisibility(8);
        } else if (i3 == 2) {
            TextView textView13 = this.btnCancel;
            Objects.requireNonNull(textView13);
            textView13.setVisibility(0);
            TextView textView14 = this.btnOk;
            Objects.requireNonNull(textView14);
            textView14.setVisibility(0);
            View view3 = this.bottomLine;
            Objects.requireNonNull(view3);
            view3.setVisibility(0);
        }
        return viewInflate;
    }

    @Override // com.huami.snore.ui.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = CommonUiUtil.INSTANCE.getInstance().dip2px(getContext(), 300.0f);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public final void setMButtonStyle(@NotNull ButtonStyle buttonStyle) {
        this.mButtonStyle = buttonStyle;
    }

    public final void setMCancelListener(@Nullable Function0<Unit> function0) {
        this.mCancelListener = function0;
    }

    public final void setMCancelText(@Nullable String str) {
        this.mCancelText = str;
    }

    public final void setMCancelTextColor(@Nullable Integer num) {
        this.mCancelTextColor = num;
    }

    public final void setMDesc(@Nullable String str) {
        this.mDesc = str;
    }

    public final void setMOkListener(@Nullable Function0<Unit> function0) {
        this.mOkListener = function0;
    }

    public final void setMOkText(@Nullable String str) {
        this.mOkText = str;
    }

    public final void setMOkTextColor(@Nullable Integer num) {
        this.mOkTextColor = num;
    }

    public final void setMTitle(@Nullable String str) {
        this.mTitle = str;
    }

    public final void setMTitleStyle(@NotNull TileStyle tileStyle) {
        this.mTitleStyle = tileStyle;
    }
}
