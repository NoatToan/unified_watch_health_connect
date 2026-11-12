package com.huami.pai.ui.sporthint;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.pai.lib.R;
import com.huami.pai.vo.PAIDataVo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.training.ui.activity.ActionDetailActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/pai/ui/sporthint/HintFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "", "source", "Landroid/text/Spanned;", "fromHtml", "Lcom/huami/pai/ui/sporthint/PaiSportHintModel;", "a", "Lcom/huami/pai/ui/sporthint/PaiSportHintModel;", "mPaiViewModel", "", "b", LogUtil.I, "MAX_MINUTES_GET_PAI", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HintFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PaiSportHintModel mPaiViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int MAX_MINUTES_GET_PAI = 120;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ PAIDataVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PAIDataVo pAIDataVo) {
            super(0);
            this.a = pAIDataVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
        }
    }

    @Nullable
    public final Spanned fromHtml(@NotNull String source) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(source, 0) : Html.fromHtml(source);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.mPaiViewModel = (PaiSportHintModel) new ViewModelProvider(requireActivity()).get(PaiSportHintModel.class);
        return inflater.inflate(R.layout.fragment_pai_sport_item, container, false);
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        final ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        final TextView textView = (TextView) view.findViewById(R.id.tv_hint1);
        final TextView textView2 = (TextView) view.findViewById(R.id.tv_hint2);
        Bundle arguments = getArguments();
        final PaiSportType paiSportType = PaiSportHintFragment.INSTANCE.getSportItems().get(arguments == null ? 0 : arguments.getInt(ActionDetailActivity.TRAINING_ACTION_CONTENT_POSITION, 0));
        imageView.setImageResource(paiSportType.getIconResId());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? string = getString(R.string.pai_hint_get_by_sport_suggest1, getString(paiSportType.getStrResId()), 0);
        objectRef.element = string;
        textView.setText(fromHtml((String) string));
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? string2 = getString(R.string.pai_hint_get_by_sport_suggest2, 0);
        objectRef2.element = string2;
        textView2.setText(fromHtml((String) string2));
        PaiSportHintModel paiSportHintModel = this.mPaiViewModel;
        Objects.requireNonNull(paiSportHintModel);
        paiSportHintModel.getMPaiGoalResult().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.sporthint.HintFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PaiSportGoalResult paiSportGoalResult = (PaiSportGoalResult) t;
                PaiSportHintModel paiSportHintModel2 = this.a.mPaiViewModel;
                Objects.requireNonNull(paiSportHintModel2);
                PAIDataVo value = paiSportHintModel2.getMPaiDataVo().getValue();
                HMLog.debug("PaiDataVo", new HintFragment.a(value));
                if (value != null) {
                    PaiSportType paiSportType2 = paiSportType;
                    if (paiSportGoalResult instanceof PaiSportGoalResult.PaiProgressGoal) {
                        imageView.setImageResource(paiSportType2.getIconResId());
                        PaiSportGoalUtil paiSportGoalUtil = PaiSportGoalUtil.INSTANCE;
                        int v2 = paiSportGoalUtil.getV2(paiSportType, value.getMaxHr(), value.getRestHr());
                        int v3ByPaiVo = paiSportGoalUtil.getV3ByPaiVo(value, ((PaiSportGoalResult.PaiProgressGoal) paiSportGoalResult).getTarget(), v2);
                        if (v3ByPaiVo <= this.a.MAX_MINUTES_GET_PAI) {
                            Ref.ObjectRef objectRef3 = objectRef;
                            HintFragment hintFragment = this.a;
                            objectRef3.element = (T) hintFragment.getString(R.string.pai_hint_get_by_sport_suggest1, hintFragment.getString(paiSportType2.getStrResId()), Integer.valueOf(v3ByPaiVo));
                            objectRef2.element = (T) this.a.getString(R.string.pai_hint_get_by_sport_suggest2, Integer.valueOf(v2));
                        } else {
                            int v4ByPaiVo$default = PaiSportGoalUtil.getV4ByPaiVo$default(paiSportGoalUtil, value, v2, 0, 4, null);
                            Ref.ObjectRef objectRef4 = objectRef;
                            HintFragment hintFragment2 = this.a;
                            objectRef4.element = (T) hintFragment2.getString(R.string.pai_hint_get_by_sport_suggest4, hintFragment2.getString(paiSportType2.getStrResId()), Integer.valueOf(v2));
                            objectRef2.element = (T) this.a.getString(R.string.pai_hint_get_by_sport_suggest5, Integer.valueOf(v4ByPaiVo$default));
                        }
                        textView.setText(this.a.fromHtml((String) objectRef.element));
                        textView2.setText(this.a.fromHtml((String) objectRef2.element));
                        return;
                    }
                    if (!(paiSportGoalResult instanceof PaiSportGoalResult.PaiRestGoal)) {
                        boolean z = paiSportGoalResult instanceof PaiSportGoalResult.PaiReachGoal;
                        return;
                    }
                    imageView.setImageResource(paiSportType2.getIconResId());
                    PaiSportGoalUtil paiSportGoalUtil2 = PaiSportGoalUtil.INSTANCE;
                    int v3 = paiSportGoalUtil2.getV2(paiSportType, value.getMaxHr(), value.getRestHr());
                    int v3ByPaiVo2 = paiSportGoalUtil2.getV3ByPaiVo(value, ((PaiSportGoalResult.PaiRestGoal) paiSportGoalResult).getTarget(), v3);
                    if (v3ByPaiVo2 <= this.a.MAX_MINUTES_GET_PAI) {
                        Ref.ObjectRef objectRef5 = objectRef;
                        HintFragment hintFragment3 = this.a;
                        objectRef5.element = (T) hintFragment3.getString(R.string.pai_hint_get_by_sport_suggest1, hintFragment3.getString(paiSportType2.getStrResId()), Integer.valueOf(v3ByPaiVo2));
                        objectRef2.element = (T) this.a.getString(R.string.pai_hint_get_by_sport_suggest2, Integer.valueOf(v3));
                    } else {
                        int v4ByPaiVo$default2 = PaiSportGoalUtil.getV4ByPaiVo$default(paiSportGoalUtil2, value, v3, 0, 4, null);
                        Ref.ObjectRef objectRef6 = objectRef;
                        HintFragment hintFragment4 = this.a;
                        objectRef6.element = (T) hintFragment4.getString(R.string.pai_hint_get_by_sport_suggest4, hintFragment4.getString(paiSportType2.getStrResId()), Integer.valueOf(v3));
                        objectRef2.element = (T) this.a.getString(R.string.pai_hint_get_by_sport_suggest5, Integer.valueOf(v4ByPaiVo$default2));
                    }
                    textView.setText(this.a.fromHtml((String) objectRef.element));
                    textView2.setText(this.a.fromHtml((String) objectRef2.element));
                }
            }
        });
    }
}
