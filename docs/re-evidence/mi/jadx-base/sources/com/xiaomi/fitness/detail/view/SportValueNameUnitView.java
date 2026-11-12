package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.detail.view.SportValueNameUnitView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import defpackage.av6;
import defpackage.bsi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.w4j;
import defpackage.x44;
import defpackage.z4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u00101\u001a\u000202H\u0014J\u001e\u00103\u001a\u0002022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205J\u001a\u00103\u001a\u0002022\u0006\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;J\u0012\u0010<\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u00010;H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "txtValue", "Landroid/widget/TextView;", "getTxtValue", "()Landroid/widget/TextView;", "setTxtValue", "(Landroid/widget/TextView;)V", "txtTitle", "txtUnit", "getTxtUnit", "setTxtUnit", "levelIcon", "getLevelIcon", "setLevelIcon", "learnMore", "Landroid/widget/ImageView;", "getLearnMore", "()Landroid/widget/ImageView;", "setLearnMore", "(Landroid/widget/ImageView;)V", "txtValueColor", "getTxtValueColor", "()I", "setTxtValueColor", "(I)V", "txtNameColor", "getTxtNameColor", "setTxtNameColor", "txtValueSize", "", "getTxtValueSize", "()F", "setTxtValueSize", "(F)V", "txtNameSize", "getTxtNameSize", "setTxtNameSize", "txtValueFount", "getTxtValueFount", "setTxtValueFount", "onFinishInflate", "", "bindData", "titleStr", "", "valueStr", "unitStr", "behaviorModel", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "showDeleteConfirmDialog", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportValueNameUnitView extends RelativeLayout {

    @Nullable
    private ImageView learnMore;

    @Nullable
    private TextView levelIcon;
    private int txtNameColor;
    private float txtNameSize;

    @Nullable
    private TextView txtTitle;

    @Nullable
    private TextView txtUnit;

    @Nullable
    private TextView txtValue;
    private int txtValueColor;
    private int txtValueFount;
    private float txtValueSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportValueNameUnitView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bindData$default(SportValueNameUnitView sportValueNameUnitView, SportBehaviorModel sportBehaviorModel, FragmentActivity fragmentActivity, int i, Object obj) {
        if ((i & 2) != 0) {
            fragmentActivity = null;
        }
        sportValueNameUnitView.bindData(sportBehaviorModel, fragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0(SportValueNameUnitView this$0, FragmentActivity fragmentActivity, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteConfirmDialog(fragmentActivity);
    }

    private final void showDeleteConfirmDialog(final FragmentActivity activity) {
        new CommonDialog.c("show desc").setDialogTitle(j1j.t1).setDialogDescription(j1j.v1).setPositiveText(j1j.u1).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.detail.view.SportValueNameUnitView.showDeleteConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    Logger.i("delete sport record", new Object[0]);
                    FragmentActivity fragmentActivity = activity;
                    if (fragmentActivity != null) {
                        fragmentActivity.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goHrAndPaceAllRecordPage(null));
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
    }

    public final void bindData(@NotNull String titleStr, @NotNull String valueStr, @NotNull String unitStr) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        Intrinsics.checkNotNullParameter(valueStr, "valueStr");
        Intrinsics.checkNotNullParameter(unitStr, "unitStr");
        TextView textView = this.txtTitle;
        if (textView != null) {
            textView.setText(titleStr);
        }
        TextView textView2 = this.txtValue;
        if (textView2 != null) {
            textView2.setText(valueStr);
        }
        TextView textView3 = this.txtUnit;
        if (textView3 != null) {
            textView3.setText(unitStr);
        }
    }

    @Nullable
    public final ImageView getLearnMore() {
        return this.learnMore;
    }

    @Nullable
    public final TextView getLevelIcon() {
        return this.levelIcon;
    }

    public final int getTxtNameColor() {
        return this.txtNameColor;
    }

    public final float getTxtNameSize() {
        return this.txtNameSize;
    }

    @Nullable
    public final TextView getTxtUnit() {
        return this.txtUnit;
    }

    @Nullable
    public final TextView getTxtValue() {
        return this.txtValue;
    }

    public final int getTxtValueColor() {
        return this.txtValueColor;
    }

    public final int getTxtValueFount() {
        return this.txtValueFount;
    }

    public final float getTxtValueSize() {
        return this.txtValueSize;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.txtValue = (TextView) findViewById(bsi.L9);
        this.txtTitle = (TextView) findViewById(bsi.J9);
        this.txtUnit = (TextView) findViewById(bsi.K9);
        this.levelIcon = (TextView) findViewById(bsi.H3);
        this.learnMore = (ImageView) findViewById(bsi.D3);
        TextView textView = this.txtValue;
        if (textView != null) {
            textView.setTextColor(this.txtValueColor);
        }
        TextView textView2 = this.txtTitle;
        if (textView2 != null) {
            textView2.setTextColor(this.txtNameColor);
        }
        TextView textView3 = this.txtValue;
        if (textView3 != null) {
            textView3.setTextSize(0, this.txtValueSize);
        }
        TextView textView4 = this.txtTitle;
        if (textView4 != null) {
            textView4.setTextSize(0, this.txtNameSize);
        }
        if (this.txtValueFount > 0) {
            Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(getContext(), this.txtValueFount);
            TextView textView5 = this.txtValue;
            if (textView5 != null) {
                textView5.setTypeface(typefaceAsResourceId);
            }
        }
    }

    public final void setLearnMore(@Nullable ImageView imageView) {
        this.learnMore = imageView;
    }

    public final void setLevelIcon(@Nullable TextView textView) {
        this.levelIcon = textView;
    }

    public final void setTxtNameColor(int i) {
        this.txtNameColor = i;
    }

    public final void setTxtNameSize(float f) {
        this.txtNameSize = f;
    }

    public final void setTxtUnit(@Nullable TextView textView) {
        this.txtUnit = textView;
    }

    public final void setTxtValue(@Nullable TextView textView) {
        this.txtValue = textView;
    }

    public final void setTxtValueColor(int i) {
        this.txtValueColor = i;
    }

    public final void setTxtValueFount(int i) {
        this.txtValueFount = i;
    }

    public final void setTxtValueSize(float f) {
        this.txtValueSize = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportValueNameUnitView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportValueNameUnitView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportValueNameUnitView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(ivi.F2, this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.h4);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.txtValueColor = typedArrayObtainStyledAttributes.getColor(w4j.j4, x44.a(dki.G0));
            this.txtNameColor = typedArrayObtainStyledAttributes.getColor(z4j.A5, x44.a(dki.L0));
            this.txtValueSize = typedArrayObtainStyledAttributes.getDimension(w4j.l4, DisplayUtil.sp2px(24.0f));
            this.txtNameSize = typedArrayObtainStyledAttributes.getDimension(w4j.i4, DisplayUtil.sp2px(12.0f));
            this.txtValueFount = typedArrayObtainStyledAttributes.getResourceId(w4j.k4, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void bindData(@NotNull SportBehaviorModel behaviorModel, @Nullable final FragmentActivity activity) {
        String string;
        int i;
        int i2;
        String string2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(behaviorModel, "behaviorModel");
        TextView textView = this.txtTitle;
        if (textView != null) {
            textView.setText(behaviorModel.g);
        }
        TextView textView2 = this.txtValue;
        if (textView2 != null) {
            textView2.setText(behaviorModel.e);
        }
        TextView textView3 = this.txtUnit;
        if (textView3 != null) {
            textView3.setText(behaviorModel.f);
        }
        if (behaviorModel.i == 1) {
            ImageView imageView = this.learnMore;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.learnMore;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: p5o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SportValueNameUnitView.bindData$lambda$0(this.f30037a, activity, view);
                    }
                });
            }
        } else {
            ImageView imageView3 = this.learnMore;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        int i5 = behaviorModel.c;
        if (i5 != -1 && i5 != 0) {
            TextView textView4 = this.levelIcon;
            if (textView4 != null) {
                ViewExtKt.visible(textView4);
            }
            String str = behaviorModel.g;
            if (Intrinsics.areEqual(str, ApplicationExtKt.getApplication().getString(j1j.Da))) {
                switch (behaviorModel.c) {
                    case 1:
                        string2 = ResourceExtKt.getString(j1j.C6);
                        i3 = hoi.e;
                        i4 = dki.d;
                        break;
                    case 2:
                        string2 = ResourceExtKt.getString(j1j.x6);
                        i3 = hoi.e;
                        i4 = dki.d;
                        break;
                    case 3:
                        string2 = ResourceExtKt.getString(j1j.z6);
                        i3 = hoi.e;
                        i4 = dki.d;
                        break;
                    case 4:
                        string2 = ResourceExtKt.getString(j1j.u6);
                        i3 = hoi.h;
                        i4 = dki.g;
                        break;
                    case 5:
                        string2 = ResourceExtKt.getString(j1j.p6);
                        i3 = hoi.h;
                        i4 = dki.g;
                        break;
                    case 6:
                        string2 = ResourceExtKt.getString(j1j.r6);
                        i3 = hoi.g;
                        i4 = dki.f;
                        break;
                    case 7:
                        string2 = ResourceExtKt.getString(j1j.w6);
                        i3 = hoi.g;
                        i4 = dki.f;
                        break;
                    default:
                        string2 = ResourceExtKt.getString(j1j.C6);
                        i3 = hoi.e;
                        i4 = dki.d;
                        break;
                }
                TextView textView5 = this.levelIcon;
                if (textView5 != null) {
                    textView5.setContentDescription(string2);
                }
                TextView textView6 = this.levelIcon;
                if (textView6 != null) {
                    textView6.setText(string2);
                }
                TextView textView7 = this.levelIcon;
                if (textView7 != null) {
                    textView7.setBackground(ViewExtKt.getDrawable(this, i3));
                }
                TextView textView8 = this.levelIcon;
                if (textView8 != null) {
                    textView8.setTextColor(ViewExtKt.getColor(this, i4));
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, ApplicationExtKt.getApplication().getString(j1j.ya))) {
                int i6 = behaviorModel.c;
                if (i6 == 1) {
                    string = ResourceExtKt.getString(j1j.s6);
                    i = hoi.f;
                    i2 = dki.e;
                } else if (i6 == 2) {
                    string = ResourceExtKt.getString(j1j.p6);
                    i = hoi.h;
                    i2 = dki.g;
                } else if (i6 == 3) {
                    string = ResourceExtKt.getString(j1j.B6);
                    i = hoi.f;
                    i2 = dki.e;
                } else if (i6 != 4) {
                    string = ResourceExtKt.getString(j1j.s6);
                    i = hoi.f;
                    i2 = dki.e;
                } else {
                    string = ResourceExtKt.getString(j1j.A6);
                    i = hoi.f;
                    i2 = dki.e;
                }
                TextView textView9 = this.levelIcon;
                if (textView9 != null) {
                    textView9.setContentDescription(string);
                }
                TextView textView10 = this.levelIcon;
                if (textView10 != null) {
                    textView10.setText(string);
                }
                TextView textView11 = this.levelIcon;
                if (textView11 != null) {
                    textView11.setBackground(ViewExtKt.getDrawable(this, i));
                }
                TextView textView12 = this.levelIcon;
                if (textView12 != null) {
                    textView12.setTextColor(ViewExtKt.getColor(this, i2));
                    return;
                }
                return;
            }
            TextView textView13 = this.levelIcon;
            if (textView13 != null) {
                ViewExtKt.gone(textView13);
                return;
            }
            return;
        }
        TextView textView14 = this.levelIcon;
        if (textView14 != null) {
            ViewExtKt.gone(textView14);
        }
    }
}
