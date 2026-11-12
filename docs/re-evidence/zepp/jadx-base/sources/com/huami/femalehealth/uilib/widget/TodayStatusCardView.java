package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.uilib.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\f¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J#\u0010\u000e\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\fR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/TodayStatusCardView;", "Landroid/widget/FrameLayout;", "", "a", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "painSelect", "bloodSelect", "moodSelect", "initSelect", "", "Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView;", "viewGroup", "", "select", "groupSelect", "([Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView;I)V", "selectChange", "Lcom/huami/femalehealth/uilib/widget/TodayStatusCardView$OnSelectListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectListener", "index", "getDegree", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", "Landroid/view/View;", "b", "Landroid/view/View;", "mFrameLayout", "c", "[Lcom/huami/femalehealth/uilib/widget/StatusChooseItemView;", "mPainViewGroup", GoogleApiAvailabilityLight.a, "mBloodViewGroup", "e", "mMoodViewGroup", "f", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "mPainDegree", "g", "mBloodDegree", "h", "mMoodDegree", "i", "Lcom/huami/femalehealth/uilib/widget/TodayStatusCardView$OnSelectListener;", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnSelectListener", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class TodayStatusCardView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View mFrameLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private StatusChooseItemView[] mPainViewGroup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private StatusChooseItemView[] mBloodViewGroup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private StatusChooseItemView[] mMoodViewGroup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private Degree mPainDegree;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Degree mBloodDegree;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private Degree mMoodDegree;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private OnSelectListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/TodayStatusCardView$OnSelectListener;", "", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "painSelect", "bloodSelect", "moodSelect", "", "select", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public interface OnSelectListener {
        void select(@NotNull Degree painSelect, @NotNull Degree bloodSelect, @NotNull Degree moodSelect);
    }

    @JvmOverloads
    public TodayStatusCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public TodayStatusCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TodayStatusCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        View viewInflate = View.inflate(this.mContext, R.layout.fh_view_period_status, this);
        this.mFrameLayout = viewInflate;
        final int i = 0;
        this.mPainViewGroup = new StatusChooseItemView[]{(StatusChooseItemView) viewInflate.findViewById(R.id.sv_pain_group_first), (StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_pain_group_second), (StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_pain_group_third)};
        this.mBloodViewGroup = new StatusChooseItemView[]{(StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_blood_group_first), (StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_blood_group_second), (StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_blood_group_third)};
        this.mMoodViewGroup = new StatusChooseItemView[]{(StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_mood_group_first), (StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_mood_group_second), (StatusChooseItemView) this.mFrameLayout.findViewById(R.id.sv_mood_group_third)};
        int length = this.mPainViewGroup.length - 1;
        if (length >= 0) {
            final int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                this.mPainViewGroup[i2].setOnSelectChangeListener(new StatusChooseItemView.OnSelectChangeListener() { // from class: com.huami.femalehealth.uilib.widget.TodayStatusCardView$init$1
                    @Override // com.huami.femalehealth.uilib.widget.StatusChooseItemView.OnSelectChangeListener
                    public void selectChange(boolean select) {
                        int length2 = this.a.mPainViewGroup.length - 1;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                if (i4 != i2) {
                                    this.a.mPainViewGroup[i4].select(false);
                                }
                                if (i5 > length2) {
                                    break;
                                } else {
                                    i4 = i5;
                                }
                            }
                        }
                        StatusChooseItemView[] statusChooseItemViewArr = this.a.mPainViewGroup;
                        int i6 = i2;
                        StatusChooseItemView statusChooseItemView = statusChooseItemViewArr[i6];
                        TodayStatusCardView todayStatusCardView = this.a;
                        if (statusChooseItemView.getMSelect()) {
                            todayStatusCardView.mPainDegree = todayStatusCardView.getDegree(i6);
                        } else {
                            todayStatusCardView.mPainDegree = Degree.UNSPECIFIED;
                        }
                        this.a.selectChange();
                    }
                });
                if (i3 > length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        int length2 = this.mBloodViewGroup.length - 1;
        if (length2 >= 0) {
            final int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                this.mBloodViewGroup[i4].setOnSelectChangeListener(new StatusChooseItemView.OnSelectChangeListener() { // from class: com.huami.femalehealth.uilib.widget.TodayStatusCardView$init$2
                    @Override // com.huami.femalehealth.uilib.widget.StatusChooseItemView.OnSelectChangeListener
                    public void selectChange(boolean select) {
                        int length3 = this.a.mBloodViewGroup.length - 1;
                        if (length3 >= 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                if (i6 != i4) {
                                    this.a.mBloodViewGroup[i6].select(false);
                                }
                                if (i7 > length3) {
                                    break;
                                } else {
                                    i6 = i7;
                                }
                            }
                        }
                        StatusChooseItemView[] statusChooseItemViewArr = this.a.mBloodViewGroup;
                        int i8 = i4;
                        StatusChooseItemView statusChooseItemView = statusChooseItemViewArr[i8];
                        TodayStatusCardView todayStatusCardView = this.a;
                        if (statusChooseItemView.getMSelect()) {
                            todayStatusCardView.mBloodDegree = todayStatusCardView.getDegree(i8);
                        } else {
                            todayStatusCardView.mBloodDegree = Degree.UNSPECIFIED;
                        }
                        this.a.selectChange();
                    }
                });
                if (i5 > length2) {
                    break;
                } else {
                    i4 = i5;
                }
            }
        }
        int length3 = this.mMoodViewGroup.length - 1;
        if (length3 < 0) {
            return;
        }
        while (true) {
            int i6 = i + 1;
            this.mMoodViewGroup[i].setOnSelectChangeListener(new StatusChooseItemView.OnSelectChangeListener() { // from class: com.huami.femalehealth.uilib.widget.TodayStatusCardView$init$3
                @Override // com.huami.femalehealth.uilib.widget.StatusChooseItemView.OnSelectChangeListener
                public void selectChange(boolean select) {
                    int length4 = this.a.mMoodViewGroup.length - 1;
                    if (length4 >= 0) {
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            if (i7 != i) {
                                this.a.mMoodViewGroup[i7].select(false);
                            }
                            if (i8 > length4) {
                                break;
                            } else {
                                i7 = i8;
                            }
                        }
                    }
                    StatusChooseItemView[] statusChooseItemViewArr = this.a.mMoodViewGroup;
                    int i9 = i;
                    StatusChooseItemView statusChooseItemView = statusChooseItemViewArr[i9];
                    TodayStatusCardView todayStatusCardView = this.a;
                    if (statusChooseItemView.getMSelect()) {
                        todayStatusCardView.mMoodDegree = todayStatusCardView.getDegree(i9);
                    } else {
                        todayStatusCardView.mMoodDegree = Degree.UNSPECIFIED;
                    }
                    this.a.selectChange();
                }
            });
            if (i6 > length3) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Degree getDegree(int index) {
        if (index == 0) {
            return Degree.LIGHT;
        }
        if (index != 1) {
            return index != 2 ? Degree.UNSPECIFIED : Degree.HEAVY;
        }
        return Degree.MIDDLE;
    }

    public final void groupSelect(@NotNull StatusChooseItemView[] viewGroup, int select) {
        int length = viewGroup.length;
        int i = 0;
        while (i < length) {
            StatusChooseItemView statusChooseItemView = viewGroup[i];
            i++;
            statusChooseItemView.select(false);
        }
        if (select >= 0) {
            viewGroup[select].select(true);
        }
    }

    public final void initSelect(@NotNull Degree painSelect, @NotNull Degree bloodSelect, @NotNull Degree moodSelect) {
        this.mPainDegree = painSelect;
        this.mBloodDegree = bloodSelect;
        this.mMoodDegree = moodSelect;
        groupSelect(this.mPainViewGroup, painSelect.getValue() - 1);
        groupSelect(this.mBloodViewGroup, bloodSelect.getValue() - 1);
        groupSelect(this.mMoodViewGroup, moodSelect.getValue() - 1);
    }

    public final void selectChange() {
        OnSelectListener onSelectListener = this.listener;
        if (onSelectListener == null) {
            return;
        }
        onSelectListener.select(this.mPainDegree, this.mBloodDegree, this.mMoodDegree);
    }

    public final void setOnSelectListener(@NotNull OnSelectListener listener) {
        this.listener = listener;
    }

    @JvmOverloads
    public TodayStatusCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        Degree degree = Degree.UNSPECIFIED;
        this.mPainDegree = degree;
        this.mBloodDegree = degree;
        this.mMoodDegree = degree;
        a();
    }
}
