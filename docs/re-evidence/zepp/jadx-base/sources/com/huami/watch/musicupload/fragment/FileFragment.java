package com.huami.watch.musicupload.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.OnBackPressedCallback;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.watch.musicupload.adapter.FileAdapter;
import com.huami.watch.musicupload.adapter.FileInfo;
import com.huami.watch.musicupload.adapter.FileItemInfo;
import com.huami.watch.musicupload.viewmodel.FileViewModel;
import com.huami.watch.wififtp.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00060\"R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001d\u0010'\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001d\u0010&¨\u0006,"}, d2 = {"Lcom/huami/watch/musicupload/fragment/FileFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "items", "e", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "getAllSelectedFiles", "", "getSelectedFileCounts", "clearAllSelectStatus", "", "backToRoot", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "getSelectedItemImageView", "Lcom/huami/watch/musicupload/adapter/FileAdapter;", "a", "Lcom/huami/watch/musicupload/adapter/FileAdapter;", "adapter", "Lcom/huami/watch/musicupload/viewmodel/FileViewModel;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/watch/musicupload/viewmodel/FileViewModel;", "viewModel", "Lcom/huami/watch/musicupload/fragment/FileFragment$BackPressHandler;", "Lcom/huami/watch/musicupload/fragment/FileFragment$BackPressHandler;", "backPressHandler", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "BackPressHandler", "FileItemClickListener", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class FileFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FileAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final BackPressHandler backPressHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy loadingDialog;
    private HashMap e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/musicupload/fragment/FileFragment$BackPressHandler;", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "<init>", "(Lcom/huami/watch/musicupload/fragment/FileFragment;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class BackPressHandler extends OnBackPressedCallback {
        public BackPressHandler() {
            super(false);
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackPressed() {
            FileFragment.this.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/watch/musicupload/fragment/FileFragment$FileItemClickListener;", "Lcom/huami/watch/musicupload/adapter/FileAdapter$ItemClickListener;", "", "position", "", "onItemClick", "<init>", "(Lcom/huami/watch/musicupload/fragment/FileFragment;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class FileItemClickListener implements FileAdapter.ItemClickListener {
        public FileItemClickListener() {
        }

        @Override // com.huami.watch.musicupload.adapter.FileAdapter.ItemClickListener
        public void onItemClick(int position) {
            FileItemInfo item = FileFragment.this.adapter.getItem(position);
            if (item != null) {
                if (item.getType() != 0 && item.getType() != 1) {
                    FileFragment.this.c().openFolder(item);
                    return;
                }
                if (item.getSelect()) {
                    FileFragment.this.c().unselectFile(item);
                } else {
                    FileFragment.this.c().selectFile(item);
                }
                FileFragment.this.adapter.notifyDataSetChanged();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "a", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(FileFragment.this.getContext());
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "kotlin.jvm.PlatformType", "items", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b<T> implements Observer<List<? extends FileItemInfo>> {
        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(List<FileItemInfo> list) {
            if (FileFragment.this.b().isShowing()) {
                FileFragment.this.b().dismiss();
            }
            if (list.isEmpty()) {
                FileFragment.this.d();
            } else {
                FileFragment.this.e(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isRoot", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<T> implements Observer<Boolean> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            FileFragment.this.backPressHandler.setEnabled(!bool.booleanValue());
        }
    }

    public FileFragment() {
        super(R.layout.fragment_file);
        this.adapter = new FileAdapter(new FileItemClickListener());
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FileViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.FileFragment$$special$$inlined$activityViewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.FileFragment$$special$$inlined$activityViewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.backPressHandler = new BackPressHandler();
        this.loadingDialog = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog b() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileViewModel c() {
        return (FileViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        ((LinearLayout) _$_findCachedViewById(R.id.layout_empty)).setVisibility(0);
        ((RecyclerView) _$_findCachedViewById(R.id.rv_file_browser)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<FileItemInfo> items) {
        ((LinearLayout) _$_findCachedViewById(R.id.layout_empty)).setVisibility(8);
        ((RecyclerView) _$_findCachedViewById(R.id.rv_file_browser)).setVisibility(0);
        this.adapter.setItems(items);
        this.adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressed() {
        if (backToRoot()) {
            return;
        }
        this.backPressHandler.setEnabled(false);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.e.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final boolean backToRoot() {
        return c().backToRoot();
    }

    public final void clearAllSelectStatus() {
        c().resetSelected();
        this.adapter.notifyDataSetChanged();
    }

    @NotNull
    public final List<FileInfo> getAllSelectedFiles() {
        return c().getSelected();
    }

    public final int getSelectedFileCounts() {
        return c().getSelectFileCount();
    }

    @NotNull
    public final List<View> getSelectedItemImageView() {
        return this.adapter.getSelectImageView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        c().getShowFilesLiveData().observe(getViewLifecycleOwner(), new b());
        c().getFolderChangeLiveData().observe(getViewLifecycleOwner(), new c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.backPressHandler);
        ((RecyclerView) _$_findCachedViewById(R.id.rv_file_browser)).setAdapter(this.adapter);
        b().show();
    }
}
