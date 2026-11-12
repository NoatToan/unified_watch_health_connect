package com.xiaomi.fitness.track;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.track.ExportTrackActivity;
import com.xiaomi.fitness.track.viewmodel.ExportTrackViewModel;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.trail.export.track.TrackData;
import com.xiaomi.fitness.util.FileNativeShareUtil;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.o3r;
import defpackage.qv1;
import defpackage.skp;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000278B\u0007¢\u0006\u0004\b6\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/track/viewmodel/ExportTrackViewModel;", "Lskp;", "", "setListener", "()V", "", "fileType", "exportTrackDataDownload", "(Ljava/lang/String;)V", "exportTrackDataDownloadForShare", "(Ljava/lang/String;)Ljava/lang/String;", "dismissShareTrackDialog", "showShareTrackDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lkotlin/collections/ArrayList;", "receivedTracks", "Ljava/util/ArrayList;", "", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "list", "Ljava/util/List;", "currentSelectItem", "Lcom/xiaomi/fitness/track/ExportTrackSupportTypeData;", "Lcom/xiaomi/fitness/track/ExportTrackAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/track/ExportTrackAdapter;", "adapter", "trackName", "Ljava/lang/String;", "", "hasGps", "Z", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "layoutId", "I", "getLayoutId", "()I", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mShareTrackDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getViewModelId", "viewModelId", "<init>", "ShareTrackDialogListener", "ShareTrackDialog", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nExportTrackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportTrackActivity.kt\ncom/xiaomi/fitness/track/ExportTrackActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1863#2,2:235\n*S KotlinDebug\n*F\n+ 1 ExportTrackActivity.kt\ncom/xiaomi/fitness/track/ExportTrackActivity\n*L\n50#1:235,2\n*E\n"})
public final class ExportTrackActivity extends BaseBindingActivity<ExportTrackViewModel, skp> {

    @Nullable
    private ExportTrackSupportTypeData currentSelectItem;
    private boolean hasGps;

    @Nullable
    private List<? extends ExportTrackSupportTypeData> list;

    @Nullable
    private SportBasicReport mBasicReport;

    @Nullable
    private CommonDialog<?> mShareTrackDialog;

    @Nullable
    private ArrayList<CommonTrackData> receivedTracks;

    @Nullable
    private String trackName;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sj8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExportTrackActivity.adapter_delegate$lambda$0(this.f33701a);
        }
    });
    private final int layoutId = ivi.I1;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "fileType", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialogListener;", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialogListener;)V", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShareTrackDialog extends CommonDialog<DialogParams> {

        @NotNull
        private final String fileType;

        @Nullable
        private final ShareTrackDialogListener listener;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialogListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialogListener;)Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "fileType", "Ljava/lang/String;", "Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialogListener;", "<init>", "(Ljava/lang/String;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public static final class Builder extends CommonDialog.c {

            @NotNull
            private final String fileType;

            @Nullable
            private ShareTrackDialogListener listener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Builder(@NotNull String fileType) {
                super("dialog_share_track_select");
                Intrinsics.checkNotNullParameter(fileType, "fileType");
                this.fileType = fileType;
                setCustomLayoutId(ivi.l);
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
            @NotNull
            public CommonDialog<DialogParams> internalCreate() {
                return new ShareTrackDialog(this.fileType, this.listener);
            }

            @NotNull
            public final Builder setListener(@NotNull ShareTrackDialogListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                this.listener = listener;
                return this;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public ShareTrackDialog(@NotNull String fileType) {
            this(fileType, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(fileType, "fileType");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initCustomView$lambda$0(ShareTrackDialog this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ShareTrackDialogListener shareTrackDialogListener = this$0.listener;
            if (shareTrackDialogListener != null) {
                shareTrackDialogListener.onDownloadClicked(this$0.fileType);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initCustomView$lambda$1(ShareTrackDialog this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ShareTrackDialogListener shareTrackDialogListener = this$0.listener;
            if (shareTrackDialogListener != null) {
                shareTrackDialogListener.onShareWxSessionClicked(this$0.fileType);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initCustomView$lambda$2(ShareTrackDialog this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ShareTrackDialogListener shareTrackDialogListener = this$0.listener;
            if (shareTrackDialogListener != null) {
                shareTrackDialogListener.onMoreClicked(this$0.fileType);
            }
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
        public void initCustomView(@Nullable View rootView) {
            RelativeLayout relativeLayout;
            RelativeLayout relativeLayout2;
            RelativeLayout relativeLayout3;
            if (rootView != null && (relativeLayout3 = (RelativeLayout) rootView.findViewById(bsi.E5)) != null) {
                relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: tj8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ExportTrackActivity.ShareTrackDialog.initCustomView$lambda$0(this.f34758a, view);
                    }
                });
            }
            if (rootView != null && (relativeLayout2 = (RelativeLayout) rootView.findViewById(bsi.L5)) != null) {
                relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: uj8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ExportTrackActivity.ShareTrackDialog.initCustomView$lambda$1(this.f35813a, view);
                    }
                });
            }
            if (rootView == null || (relativeLayout = (RelativeLayout) rootView.findViewById(bsi.O5)) == null) {
                return;
            }
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: vj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ExportTrackActivity.ShareTrackDialog.initCustomView$lambda$2(this.f36944a, view);
                }
            });
        }

        public /* synthetic */ ShareTrackDialog(String str, ShareTrackDialogListener shareTrackDialogListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : shareTrackDialogListener);
        }

        @JvmOverloads
        public ShareTrackDialog(@NotNull String fileType, @Nullable ShareTrackDialogListener shareTrackDialogListener) {
            Intrinsics.checkNotNullParameter(fileType, "fileType");
            this.fileType = fileType;
            this.listener = shareTrackDialogListener;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/track/ExportTrackActivity$ShareTrackDialogListener;", "", "onDownloadClicked", "", "fileType", "", "onShareWxSessionClicked", "onMoreClicked", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ShareTrackDialogListener {
        void onDownloadClicked(@NotNull String fileType);

        void onMoreClicked(@NotNull String fileType);

        void onShareWxSessionClicked(@NotNull String fileType);
    }

    public static final /* synthetic */ skp access$getMBinding(ExportTrackActivity exportTrackActivity) {
        return exportTrackActivity.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExportTrackAdapter adapter_delegate$lambda$0(ExportTrackActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new ExportTrackAdapter(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissShareTrackDialog() {
        CommonDialog<?> commonDialog = this.mShareTrackDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exportTrackDataDownload(String fileType) {
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        String strValueOf = this.trackName;
        if (strValueOf == null) {
            strValueOf = String.valueOf(System.currentTimeMillis() * ((long) 1000));
        }
        ArrayList<CommonTrackData> arrayList = this.receivedTracks;
        Intrinsics.checkNotNull(arrayList);
        String strConvertTrackToFile = parserHelper.convertTrackToFile(fileType, strValueOf, arrayList, this.mBasicReport);
        if (strConvertTrackToFile.length() > 0) {
            new CommonDialog.c("export track success").setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(j1j.V0, strConvertTrackToFile))).setNegativeText(j1j.common_known).create().showIfNeed(getSupportFragmentManager());
        } else {
            FitnessLogUtils.i(BaseBindingActivity.TAG, "exportTrackDataDownload filepath is empty");
            ToastUtil.INSTANCE.showToast(j1j.U0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String exportTrackDataDownloadForShare(String fileType) {
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        String strValueOf = this.trackName;
        if (strValueOf == null) {
            strValueOf = String.valueOf(System.currentTimeMillis() * ((long) 1000));
        }
        ArrayList<CommonTrackData> arrayList = this.receivedTracks;
        Intrinsics.checkNotNull(arrayList);
        String strConvertTrackToFile = parserHelper.convertTrackToFile(fileType, strValueOf, arrayList, this.mBasicReport);
        return strConvertTrackToFile.length() == 0 ? "" : strConvertTrackToFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExportTrackAdapter getAdapter() {
        return (ExportTrackAdapter) this.adapter.getValue();
    }

    private final void setListener() {
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: rj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportTrackActivity.setListener$lambda$3(this.f32598a, view);
            }
        });
        getAdapter().setOnCheckedChangeListener(new ExportTrackAdapter.OnCheckedChangeListener() { // from class: com.xiaomi.fitness.track.ExportTrackActivity.setListener.2
            @Override // com.xiaomi.fitness.track.ExportTrackAdapter.OnCheckedChangeListener
            public void onCheckedChange(ExportTrackSupportTypeData currentItem) {
                ExportTrackActivity.this.currentSelectItem = currentItem;
                ExportTrackActivity.access$getMBinding(ExportTrackActivity.this).B.setEnabled(ExportTrackActivity.this.getAdapter().isAnyItemSelected());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(ExportTrackActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExportTrackSupportTypeData exportTrackSupportTypeData = this$0.currentSelectItem;
        String fileType = exportTrackSupportTypeData != null ? exportTrackSupportTypeData.getFileType() : null;
        FitnessLogUtils.d(BaseBindingActivity.TAG, "fileType : " + fileType);
        if (fileType != null && fileType.length() > 0) {
            this$0.showShareTrackDialog(fileType);
        } else {
            FitnessLogUtils.i(BaseBindingActivity.TAG, "setListener filepath is error");
            ToastUtil.INSTANCE.showToast(j1j.U0);
        }
    }

    private final void showShareTrackDialog(String fileType) {
        CommonDialog<?> commonDialogCreate = new ShareTrackDialog.Builder(fileType).setListener(new ShareTrackDialogListener() { // from class: com.xiaomi.fitness.track.ExportTrackActivity.showShareTrackDialog.1
            @Override // com.xiaomi.fitness.track.ExportTrackActivity.ShareTrackDialogListener
            public void onDownloadClicked(String fileType2) {
                Intrinsics.checkNotNullParameter(fileType2, "fileType");
                ExportTrackActivity.this.exportTrackDataDownload(fileType2);
                ExportTrackActivity.this.dismissShareTrackDialog();
            }

            @Override // com.xiaomi.fitness.track.ExportTrackActivity.ShareTrackDialogListener
            public void onMoreClicked(String fileType2) {
                Intrinsics.checkNotNullParameter(fileType2, "fileType");
                ExportTrackActivity.this.dismissShareTrackDialog();
                String strExportTrackDataDownloadForShare = ExportTrackActivity.this.exportTrackDataDownloadForShare(fileType2);
                if (strExportTrackDataDownloadForShare.length() != 0 && new File(strExportTrackDataDownloadForShare).isFile()) {
                    FileNativeShareUtil.INSTANCE.shareFileViaMore(new WeakReference<>(ExportTrackActivity.this), strExportTrackDataDownloadForShare);
                } else {
                    FitnessLogUtils.i(BaseBindingActivity.TAG, "onMoreClicked filepath is error");
                    ToastUtil.INSTANCE.showToast(j1j.U0);
                }
            }

            @Override // com.xiaomi.fitness.track.ExportTrackActivity.ShareTrackDialogListener
            public void onShareWxSessionClicked(String fileType2) {
                Intrinsics.checkNotNullParameter(fileType2, "fileType");
                ExportTrackActivity.this.dismissShareTrackDialog();
                String strExportTrackDataDownloadForShare = ExportTrackActivity.this.exportTrackDataDownloadForShare(fileType2);
                if (strExportTrackDataDownloadForShare.length() != 0 && new File(strExportTrackDataDownloadForShare).isFile()) {
                    o3r.i().w(strExportTrackDataDownloadForShare, ExportTrackActivity.this.getString(j1j.f22328a), ExportTrackActivity.this.getString(j1j.p2), o3r.j());
                } else {
                    FitnessLogUtils.i(BaseBindingActivity.TAG, "onShareWxSessionClicked filepath is error");
                    ToastUtil.INSTANCE.showToast(j1j.U0);
                }
            }
        }).setDialogTitle(j1j.l).setNegativeText(j1j.f22329b).create();
        this.mShareTrackDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate);
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return qv1.f31871a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(j1j.f22330k);
        TrackDataHolder trackDataHolder = TrackDataHolder.INSTANCE;
        this.receivedTracks = trackDataHolder.getTracks();
        trackDataHolder.setTracks(null);
        if (this.receivedTracks == null) {
            this.receivedTracks = new ArrayList<>();
            ArrayList<TrackData> trackList = SportRecordApiKt.getTrackList();
            if (trackList != null) {
                for (TrackData trackData : trackList) {
                    ArrayList<CommonTrackData> arrayList = this.receivedTracks;
                    Intrinsics.checkNotNull(arrayList);
                    arrayList.add(new CommonTrackData(trackData.getLatitude(), trackData.getLongitude(), trackData.getElevation(), trackData.getTime(), false, 16, null));
                }
            }
        }
        getIntent();
        this.trackName = getIntent().getStringExtra(ExportTrackActivityKt.TRACKS_NAME);
        this.mBasicReport = (SportBasicReport) getIntent().getSerializableExtra("sport_report");
        this.hasGps = getIntent().getBooleanExtra(ExportTrackActivityKt.TRACKS_HAS_GPS, false);
        if (this.mBasicReport == null) {
            FitnessLogUtils.i(BaseBindingActivity.TAG, "BasicReport get error");
            ToastUtil.INSTANCE.showToast(j1j.U0);
            finish();
        }
        List<ExportTrackSupportTypeData> fileTypeList = ExportTrackSupportTypeDataKt.getFileTypeList();
        Intrinsics.checkNotNull(fileTypeList, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.track.ExportTrackSupportTypeData>");
        this.list = (ArrayList) fileTypeList;
        Object fileTypeList2 = this.hasGps ? ExportTrackSupportTypeDataKt.getFileTypeList() : ExportTrackSupportTypeDataKt.getFileTypeListWithoutGps();
        ExportTrackAdapter adapter = getAdapter();
        Intrinsics.checkNotNull(fileTypeList2, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.track.ExportTrackSupportTypeData>");
        ArrayList<ExportTrackSupportTypeData> arrayList2 = (ArrayList) fileTypeList2;
        adapter.setData(arrayList2);
        getMBinding().A.setAdapter(getAdapter());
        getMBinding().B.setEnabled(true);
        this.currentSelectItem = arrayList2.get(0);
        setListener();
    }
}
