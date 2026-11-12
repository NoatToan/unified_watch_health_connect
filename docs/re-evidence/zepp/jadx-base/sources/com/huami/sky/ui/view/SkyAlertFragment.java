package com.huami.sky.ui.view;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.sky.ui.R;
import com.huami.sky.ui.utils.ExtFuncKt;
import com.huami.sky.ui.view.SkyAlertFragment;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0099\u0001\u0010\u0016\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\t2+\b\u0002\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u00132)\u0010\u0015\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0016\u0010\u0017J¥\u0001\u0010\u0016\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u00182+\b\u0002\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u00132)\u0010\u0015\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0016\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010 R9\u0010/\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R9\u00101\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000ej\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.¨\u00064"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/view/View;", "initView", "", "hasPadding", "hasBackground", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "titleRes", "negativeTextRes", "positiveTextRes", "contentRes", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dialog", "", "Lcom/huami/sky/ui/view/dialogClick;", "negativeClick", "positiveClick", "showDialog", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/Integer;Ljava/lang/Integer;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "dialogTitle", "dialogContent", "dialogContentGravity", "dialogHeaderImageUrl", "positiveText", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "e", "Ljava/lang/String;", "headerImageUrl", "f", "title", "g", "content", "h", LogUtil.I, "contentGravity", "i", "negativeButtonText", z.j, "positiveButtonText", hl.k, "Lkotlin/jvm/functions/Function1;", "negativeClickedListener", "l", "positiveClickedListener", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyAlertFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String headerImageUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private String content = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int contentGravity = 17;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String negativeButtonText = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private String positiveButtonText = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Function1<? super SkyAlertFragment, Unit> negativeClickedListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Function1<? super SkyAlertFragment, Unit> positiveClickedListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "dialog", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            skyAlertFragment.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "dialog", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            skyAlertFragment.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SkyAlertFragment skyAlertFragment, View view) {
        Function1<? super SkyAlertFragment, Unit> function1 = skyAlertFragment.negativeClickedListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(skyAlertFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SkyAlertFragment skyAlertFragment, View view) {
        Function1<? super SkyAlertFragment, Unit> function1 = skyAlertFragment.positiveClickedListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(skyAlertFragment);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_sky_common, (ViewGroup) null);
        String str = this.title;
        if (str != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.title);
            textView.setVisibility(0);
            textView.setText(str);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.content);
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        textView2.setText(this.content);
        textView2.setGravity(this.contentGravity);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.negative_button);
        if (TextUtils.isEmpty(this.negativeButtonText)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(this.negativeButtonText);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: bx6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SkyAlertFragment.e(this.a, view);
                }
            });
        }
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.positive_button);
        if (TextUtils.isEmpty(this.positiveButtonText)) {
            textView4.setVisibility(8);
        } else {
            textView4.setText(this.positiveButtonText);
            textView4.setOnClickListener(new View.OnClickListener() { // from class: ax6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SkyAlertFragment.f(this.a, view);
                }
            });
        }
        viewInflate.findViewById(R.id.divider).setBackgroundColor(ExtFuncKt.addAlpha(ContextCompat.getColor(viewInflate.getContext(), R.color.s46), 0.05d));
        String str2 = this.headerImageUrl;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.header_image);
            appCompatImageView.setVisibility(0);
            Glide.with(appCompatImageView.getContext()).load(str2).apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).placeholder(R.drawable.ic_no_img_64)).into(appCompatImageView);
        }
        return viewInflate;
    }

    public final void showDialog(@NotNull AppCompatActivity activity, @StringRes @Nullable Integer titleRes, @StringRes @Nullable Integer negativeTextRes, @StringRes int positiveTextRes, @StringRes int contentRes, @Nullable Function1<? super SkyAlertFragment, Unit> negativeClick, @Nullable Function1<? super SkyAlertFragment, Unit> positiveClick) {
        if (titleRes != null) {
            this.title = activity.getString(titleRes.intValue());
        }
        if (negativeTextRes != null) {
            this.negativeButtonText = activity.getString(negativeTextRes.intValue());
        }
        this.positiveButtonText = activity.getString(positiveTextRes);
        this.content = activity.getString(contentRes);
        this.negativeClickedListener = negativeClick;
        this.positiveClickedListener = positiveClick;
        setCancelable(false);
        setGravity(17);
        show(activity.getSupportFragmentManager());
    }

    public final void showDialog(@NotNull AppCompatActivity activity, @Nullable String dialogTitle, @NotNull String dialogContent, int dialogContentGravity, @Nullable String dialogHeaderImageUrl, @StringRes @Nullable Integer negativeTextRes, @NotNull String positiveText, @Nullable Function1<? super SkyAlertFragment, Unit> negativeClick, @Nullable Function1<? super SkyAlertFragment, Unit> positiveClick) {
        this.title = dialogTitle;
        this.content = dialogContent;
        this.headerImageUrl = dialogHeaderImageUrl;
        this.contentGravity = dialogContentGravity;
        if (negativeTextRes != null) {
            this.negativeButtonText = activity.getString(negativeTextRes.intValue());
        }
        this.positiveButtonText = positiveText;
        this.negativeClickedListener = negativeClick;
        this.positiveClickedListener = positiveClick;
        setCancelable(false);
        setGravity(17);
        show(activity.getSupportFragmentManager());
    }
}
