package com.xiaomi.hm.health.ui.smartplay.alarm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010&\u001a\u00020!¢\u0006\u0004\b*\u0010+J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0017\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0004J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001a\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016R\u0019\u0010&\u001a\u00020!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/RepeatModeDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/IListDialog;", "", "refreshView", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", "itemData", "setData", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStart", "", "isFullScreen", "", "gravity", "setGravity", "Landroidx/fragment/app/FragmentManager;", "manager", "show", "", "tag", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;", "a", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;", "getAdapter", "()Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;", "adapter", "b", LogUtil.I, "mDialogGravity", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListDialogAdapter;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class RepeatModeDialogFragment extends DialogFragment implements IListDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ListDialogAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mDialogGravity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "BaseDialogFragment show Exception : " + this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepeatModeDialogFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RepeatModeDialogFragment(ListDialogAdapter listDialogAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ListDialogAdapter() : listDialogAdapter);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ListDialogAdapter getAdapter() {
        return this.adapter;
    }

    public boolean isFullScreen() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_repeat_mode, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.mDialogGravity;
            attributes.width = -1;
            if (isFullScreen()) {
                attributes.height = -1;
            } else {
                attributes.height = -2;
            }
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(this.adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IListDialog
    public void refreshView() {
        this.adapter.refreshView();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IListDialog
    public void setData(@NotNull List<ListItemData> itemData) {
        this.adapter.setData(itemData);
    }

    public final void setGravity(int gravity) {
        this.mDialogGravity = gravity;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IListDialog
    public void setOnItemClickListener(@NotNull ItemClickListener listener) {
        this.adapter.setOnItemClickListener(listener);
    }

    public void show(@NotNull FragmentManager manager) {
        show(manager, "ListDialogFragment");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        try {
            if (isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, tag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (Exception e) {
            HMLog.info("ListDialogFragment", new a(e));
            e.printStackTrace();
        }
    }

    public RepeatModeDialogFragment(@NotNull ListDialogAdapter listDialogAdapter) {
        this.adapter = listDialogAdapter;
        this.mDialogGravity = 80;
    }
}
