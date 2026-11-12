package androidx.p004activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.p004activity.result.ActivityResult;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/activity/ActivityStart;", "Landroidx/fragment/app/Fragment;", "()V", AccountInteractActivity.KEY_REQUEST_CODE, "", "getRequestCode", "()Ljava/lang/Integer;", "setRequestCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "result", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "", "getResult", "()Lkotlin/jvm/functions/Function1;", "setResult", "(Lkotlin/jvm/functions/Function1;)V", StatConstants.PARAM_START, "Lkotlin/Function0;", "getStart", "()Lkotlin/jvm/functions/Function0;", "setStart", "(Lkotlin/jvm/functions/Function0;)V", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "Companion", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ActivityStart extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Nullable
    private Integer requestCode;

    @Nullable
    private Function1<? super ActivityResult, Unit> result;

    @Nullable
    private Function0<Unit> start;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¨\u0006\u000e"}, d2 = {"Landroidx/activity/ActivityStart$Companion;", "", "()V", "startActivityForResult", "", "context", "Landroidx/fragment/app/FragmentActivity;", "intent", "Landroid/content/Intent;", AccountInteractActivity.KEY_REQUEST_CODE, "", "result", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivityForResult(@NotNull FragmentActivity context, @NotNull final Intent intent, final int requestCode, @NotNull final Function1<? super ActivityResult, Unit> result) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(result, "result");
            final ActivityStart activityStart = new ActivityStart();
            context.getSupportFragmentManager().o().f(activityStart, Intrinsics.stringPlus("ResultReceiveFragment_", Integer.valueOf(requestCode))).m();
            activityStart.setStart(new Function0<Unit>() { // from class: androidx.activity.ActivityStart$Companion$startActivityForResult$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    activityStart.startActivityForResult(intent, requestCode);
                    activityStart.setRequestCode(Integer.valueOf(requestCode));
                    activityStart.setResult(result);
                }
            });
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View viewFindViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Nullable
    public final Integer getRequestCode() {
        return this.requestCode;
    }

    @Nullable
    public final Function1<ActivityResult, Unit> getResult() {
        return this.result;
    }

    @Nullable
    public final Function0<Unit> getStart() {
        return this.start;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Function1<? super ActivityResult, Unit> function1;
        k kVarO;
        super.onActivityResult(requestCode, resultCode, data);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && (kVarO = fragmentManager.o()) != null) {
            kVarO.v(this);
        }
        Integer num = this.requestCode;
        if (num == null || requestCode != num.intValue() || (function1 = this.result) == null) {
            return;
        }
        function1.invoke2(new ActivityResult(resultCode, data));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Function0<Unit> function0 = this.start;
        if (function0 != null) {
            function0.invoke();
        }
        this.start = null;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setRequestCode(@Nullable Integer num) {
        this.requestCode = num;
    }

    public final void setResult(@Nullable Function1<? super ActivityResult, Unit> function1) {
        this.result = function1;
    }

    public final void setStart(@Nullable Function0<Unit> function0) {
        this.start = function0;
    }
}
