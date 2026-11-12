package com.xiaomi.fitness.route.track.view;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.Lifecycle;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.track.view.TrackEditNameActivity;
import defpackage.bvi;
import defpackage.vri;
import defpackage.x0j;
import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002!$\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001dH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackEditNameActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "trackRepository", "Lcom/xiaomi/fitness/route/export/track/TrackNet;", "edit", "Landroidx/appcompat/widget/AppCompatEditText;", "getEdit", "()Landroidx/appcompat/widget/AppCompatEditText;", "setEdit", "(Landroidx/appcompat/widget/AppCompatEditText;)V", "save", "Landroid/widget/Button;", "getSave", "()Landroid/widget/Button;", "setSave", "(Landroid/widget/Button;)V", "limitText", "Landroid/widget/TextView;", "getLimitText", "()Landroid/widget/TextView;", "setLimitText", "(Landroid/widget/TextView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "textWatcher", "com/xiaomi/fitness/route/track/view/TrackEditNameActivity$textWatcher$1", "Lcom/xiaomi/fitness/route/track/view/TrackEditNameActivity$textWatcher$1;", "inputFilter", "com/xiaomi/fitness/route/track/view/TrackEditNameActivity$inputFilter$1", "Lcom/xiaomi/fitness/route/track/view/TrackEditNameActivity$inputFilter$1;", "setListener", "routeData", "Lcom/xiaomi/fitness/route/track/view/EditRouteBean;", LifecycleConstantKt.ON_DESTROY, "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackEditNameActivity extends Hilt_TrackEditNameActivity {

    @NotNull
    public static final String EDIT_NAME = "EDIT_NAME";

    @NotNull
    public static final String ROUTE_DATA = "ROUTE_DATA";

    @NotNull
    public static final String TAG = "TrackEditNameActivity";
    public static final int maxCount = 20;
    public AppCompatEditText edit;
    public TextView limitText;
    public Button save;

    @NotNull
    private final TrackNet trackRepository = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);

    @NotNull
    private final TrackEditNameActivity$textWatcher$1 textWatcher = new TextWatcher() { // from class: com.xiaomi.fitness.route.track.view.TrackEditNameActivity$textWatcher$1
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (s == null || s.length() < 20) {
                ViewExtKt.gone(this.this$0.getLimitText());
            } else {
                ViewExtKt.visible(this.this$0.getLimitText());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    };

    @NotNull
    private final TrackEditNameActivity$inputFilter$1 inputFilter = new InputFilter() { // from class: com.xiaomi.fitness.route.track.view.TrackEditNameActivity$inputFilter$1
        private final Pattern emoji = Pattern.compile("[\\uD83C-\\uDBFF\\uDC00-\\uDFFF\\u2600-\\u27BF\\u2B50\\u2934-\\u2935\\u2B05-\\u2B07\\u2194-\\u2199\\u23E9-\\u23EC\\u25AA-\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE\\u2600-\\u26FF\\u2700-\\u27BF\\u2B50\\u2934\\u2935\\u2B05\\u2B06\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55\\u3030\\u303D\\u3297\\u3299\\uFE0F\\u00A9\\u00AE\\u203C\\u2049\\u2122\\u2139\\u2194-\\u2199\\u21A9-\\u21AA\\u231A-\\u231B\\u23E9-\\u23EC\\u23F0\\u23F3\\u24C2\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE\\u2600-\\u2615\\u261D\\u263A-\\u2648\\u2653\\u2660-\\u2668\\u267B\\u267F\\u2692-\\u2697\\u2699\\u269B-\\u269C\\u26A0-\\u26A1\\u26AA-\\u26AB\\u26B0-\\u26B1\\u26BD-\\u26BE\\u26C4-\\u26C5\\u26C8-\\u26C8\\u26CE-\\u26CF\\u26D1-\\u26D1\\u26D3-\\u26D4\\u26E9-\\u26EA\\u26F0-\\u26F5\\u26F7-\\u26FA\\u26FD-\\u26FF\\u2702-\\u2705\\u2708-\\u270B\\u270C-\\u270F\\u2712\\u2714\\u2716\\u271D\\u2721\\u2728\\u2733-\\u2734\\u2744\\u2747\\u274C\\u274E\\u2753-\\u2755\\u2757\\u2763-\\u2764\\u2795-\\u2797\\u27A1\\u27B0\\u27BF\\u2934-\\u2935\\u2B05-\\u2B07\\u2B1B-\\u2B1C\\u2B50\\u2B55\\u3030\\u303D\\u3297\\u3299\\uFE0F]", 66);

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            if (this.emoji.matcher(source).find()) {
                return "";
            }
            return null;
        }
    };

    private final void setListener(final EditRouteBean routeData) {
        getSave().setOnClickListener(new View.OnClickListener() { // from class: qmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackEditNameActivity.setListener$lambda$0(this.f31666a, routeData, view);
            }
        });
        getEdit().addTextChangedListener(this.textWatcher);
        getEdit().setFilters(new InputFilter[]{this.inputFilter, new InputFilter.LengthFilter(20)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(TrackEditNameActivity this$0, EditRouteBean routeData, View view) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(routeData, "$routeData");
        Editable text = this$0.getEdit().getText();
        if (text != null && (string = text.toString()) != null && string.length() == 0) {
            ToastUtil.showShortToast(this$0.getString(x0j.x));
        } else {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
            ScopeExtKt.scopeLife$default(this$0, (Lifecycle.Event) null, (CoroutineDispatcher) null, new TrackEditNameActivity$setListener$1$1(routeData, this$0, null), 3, (Object) null);
        }
    }

    @NotNull
    public final AppCompatEditText getEdit() {
        AppCompatEditText appCompatEditText = this.edit;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edit");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bvi.f4641a;
    }

    @NotNull
    public final TextView getLimitText() {
        TextView textView = this.limitText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("limitText");
        return null;
    }

    @NotNull
    public final Button getSave() {
        Button button = this.save;
        if (button != null) {
            return button;
        }
        Intrinsics.throwUninitializedPropertyAccessException("save");
        return null;
    }

    @Override // com.xiaomi.fitness.route.track.view.Hilt_TrackEditNameActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(x0j.z));
        Bundle extras = getIntent().getExtras();
        Serializable serializable = extras != null ? extras.getSerializable(ROUTE_DATA) : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fitness.route.track.view.EditRouteBean");
        EditRouteBean editRouteBean = (EditRouteBean) serializable;
        setEdit((AppCompatEditText) findViewById(vri.l));
        setSave((Button) findViewById(vri.J));
        setLimitText((TextView) findViewById(vri.limitText));
        getEdit().setHint(editRouteBean.getRouteName());
        getEdit().setFilters(new EmojiExcludeFilter[]{new EmojiExcludeFilter()});
        getEdit().setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        setListener(editRouteBean);
    }

    @Override // com.xiaomi.fitness.route.track.view.Hilt_TrackEditNameActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getEdit().removeTextChangedListener(this.textWatcher);
    }

    public final void setEdit(@NotNull AppCompatEditText appCompatEditText) {
        Intrinsics.checkNotNullParameter(appCompatEditText, "<set-?>");
        this.edit = appCompatEditText;
    }

    public final void setLimitText(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.limitText = textView;
    }

    public final void setSave(@NotNull Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.save = button;
    }
}
