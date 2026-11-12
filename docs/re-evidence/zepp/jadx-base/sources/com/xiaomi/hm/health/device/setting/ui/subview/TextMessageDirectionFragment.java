package com.xiaomi.hm.health.device.setting.ui.subview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.phone_call.sms.PhoneCallReplyMsgActivity;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.xiaomi.hm.health.device.setting.ui.subview.TextMessageDirectionFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/TextMessageDirectionFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TextMessageDirectionFragment extends Fragment {
    private final void d() {
        View view = getView();
        ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.tv_quick_reply_sms))).setOnClickListener(new View.OnClickListener() { // from class: pn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TextMessageDirectionFragment.e(this.a, view2);
            }
        });
        View view2 = getView();
        ((AppCompatTextView) (view2 == null ? null : view2.findViewById(R.id.tv_contact))).setOnClickListener(new View.OnClickListener() { // from class: nn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TextMessageDirectionFragment.f(this.a, view3);
            }
        });
        View view3 = getView();
        ((AppCompatImageView) (view3 != null ? view3.findViewById(R.id.include) : null).findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() { // from class: on7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                TextMessageDirectionFragment.g(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TextMessageDirectionFragment textMessageDirectionFragment, View view) {
        PhoneCallReplyMsgActivity.INSTANCE.start(textMessageDirectionFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TextMessageDirectionFragment textMessageDirectionFragment, View view) {
        FragmentKt.findNavController(textMessageDirectionFragment).navigate(R.id.bt_phone_contact_fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(TextMessageDirectionFragment textMessageDirectionFragment, View view) {
        FragmentKt.findNavController(textMessageDirectionFragment).navigateUp();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text_message_direction, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ViewExKt.setVisible((AppCompatTextView) (view2 == null ? null : view2.findViewById(R.id.include)).findViewById(R.id.tv_device_custom_name), false);
        View view3 = getView();
        ((AppCompatTextView) (view3 == null ? null : view3.findViewById(R.id.include)).findViewById(R.id.tv_title)).setText(getString(R.string.app_sort_text_message));
        View view4 = getView();
        ViewExKt.setVisible((AppCompatImageView) (view4 != null ? view4.findViewById(R.id.include) : null).findViewById(R.id.btn_edit), false);
        d();
    }
}
