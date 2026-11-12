package com.huami.thirdparty.webauth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016Rk\u0010\u0017\u001aK\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/thirdparty/webauth/ActivityResultFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "targetIntent", "", "requestCode", "openForResult", "resultCode", "data", "onActivityResult", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "Lkotlin/jvm/functions/Function3;", "getPoster", "()Lkotlin/jvm/functions/Function3;", "setPoster", "(Lkotlin/jvm/functions/Function3;)V", "poster", "<init>", "()V", "Companion", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class ActivityResultFragment extends Fragment {
    public static final int defaultRequestCode = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super Intent, Unit> poster;
    private HashMap b;

    public static /* synthetic */ void openForResult$default(ActivityResultFragment activityResultFragment, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        activityResultFragment.openForResult(intent, i);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.b;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        View view = (View) this.b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.b.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Nullable
    public final Function3<Integer, Integer, Intent, Unit> getPoster() {
        return this.poster;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Function3<? super Integer, ? super Integer, ? super Intent, Unit> function3 = this.poster;
        if (function3 == null || function3 == null) {
            return;
        }
        function3.invoke(Integer.valueOf(requestCode), Integer.valueOf(resultCode), data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void openForResult(@NotNull Intent targetIntent, int requestCode) {
        startActivityForResult(targetIntent, requestCode);
    }

    public final void setPoster(@Nullable Function3<? super Integer, ? super Integer, ? super Intent, Unit> function3) {
        this.poster = function3;
    }
}
