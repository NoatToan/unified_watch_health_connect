package com.huami.applet.jslog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.databinding.AppletFragmentJsLogConsoleBinding;
import com.huami.applet.jslog.AppLogFragment;
import com.huami.tools.log.HMLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/huami/applet/jslog/AppLogFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/applet/databinding/AppletFragmentJsLogConsoleBinding;", "a", "Lcom/huami/applet/databinding/AppletFragmentJsLogConsoleBinding;", "binding", "Landroid/widget/ListView;", "b", "Landroid/widget/ListView;", "listView", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "loadingPb", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "noDataLayout", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppLogFragment extends Fragment {

    @NotNull
    private static final String e = "JsLogConsoleActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AppletFragmentJsLogConsoleBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ListView listView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ProgressBar loadingPb;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RelativeLayout noDataLayout;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.AppLogFragment$readLog$2", f = "AppLogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<String>>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.applet.jslog.AppLogFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0288a extends Lambda implements Function0<String> {
            public static final C0288a a = new C0288a();

            public C0288a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Start read js app log";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Js log: Read log but file does not exist.";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<String, Unit> {
            public final /* synthetic */ ArrayList<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ArrayList<String> arrayList) {
                super(1);
                this.a = arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                ArrayList<String> arrayList = this.a;
                String string = StringsKt__StringsKt.trimStart(str).toString();
                Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
                arrayList.add(StringsKt__StringsKt.trimEnd(string).toString());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ IOException a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(IOException iOException) {
                super(0);
                this.a = iOException;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("Js log: Read log from file exception : ", this.a);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ArrayList<String>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.debug(AppLogFragment.e, C0288a.a);
            try {
                String logFileDir = JsLog.getLogFileDir();
                if (logFileDir == null) {
                    return null;
                }
                File file = new File(logFileDir);
                if (!file.exists()) {
                    HMLog.info(AppLogFragment.e, b.a);
                    return null;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                Reader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("utf-8"));
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                ArrayList arrayList = new ArrayList();
                TextStreamsKt.forEachLine(bufferedReader, new c(arrayList));
                fileInputStream.close();
                bufferedReader.close();
                return arrayList;
            } catch (IOException e) {
                HMLog.error$default(AppLogFragment.e, null, null, new d(e), 6, null);
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.applet.jslog.AppLogFragment$readLogFile$1", f = "AppLogFragment.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(AppLogFragment appLogFragment, List list) {
            ListView listView = appLogFragment.listView;
            Objects.requireNonNull(listView);
            listView.setSelection(list.size() - 1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AppLogFragment.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppLogFragment appLogFragment = AppLogFragment.this;
                this.a = 1;
                obj = appLogFragment.c(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final List list = (List) obj;
            if (list == null || !(!list.isEmpty())) {
                ProgressBar progressBar = AppLogFragment.this.loadingPb;
                Objects.requireNonNull(progressBar);
                progressBar.setVisibility(8);
                RelativeLayout relativeLayout = AppLogFragment.this.noDataLayout;
                Objects.requireNonNull(relativeLayout);
                relativeLayout.setVisibility(0);
            } else {
                ListView listView = AppLogFragment.this.listView;
                Objects.requireNonNull(listView);
                listView.setAdapter((ListAdapter) new ListViewAdapter(AppLogFragment.this.requireActivity(), list));
                RelativeLayout relativeLayout2 = AppLogFragment.this.noDataLayout;
                Objects.requireNonNull(relativeLayout2);
                relativeLayout2.setVisibility(8);
                ListView listView2 = AppLogFragment.this.listView;
                Objects.requireNonNull(listView2);
                final AppLogFragment appLogFragment2 = AppLogFragment.this;
                listView2.post(new Runnable() { // from class: com.huami.applet.jslog.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLogFragment.b.b(appLogFragment2, list);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AppLogFragment appLogFragment, View view) {
        JsLog.cleanJsLog();
        ListView listView = appLogFragment.listView;
        Objects.requireNonNull(listView);
        listView.setAdapter((ListAdapter) null);
        ProgressBar progressBar = appLogFragment.loadingPb;
        Objects.requireNonNull(progressBar);
        progressBar.setVisibility(8);
        RelativeLayout relativeLayout = appLogFragment.noDataLayout;
        Objects.requireNonNull(relativeLayout);
        relativeLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Continuation<? super List<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(null), continuation);
    }

    private final void d() {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AppletFragmentJsLogConsoleBinding appletFragmentJsLogConsoleBindingInflate = AppletFragmentJsLogConsoleBinding.inflate(inflater);
        this.binding = appletFragmentJsLogConsoleBindingInflate;
        Objects.requireNonNull(appletFragmentJsLogConsoleBindingInflate);
        return appletFragmentJsLogConsoleBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AppletFragmentJsLogConsoleBinding appletFragmentJsLogConsoleBinding = this.binding;
        Objects.requireNonNull(appletFragmentJsLogConsoleBinding);
        this.listView = appletFragmentJsLogConsoleBinding.appletJsLogListView;
        AppletFragmentJsLogConsoleBinding appletFragmentJsLogConsoleBinding2 = this.binding;
        Objects.requireNonNull(appletFragmentJsLogConsoleBinding2);
        this.loadingPb = appletFragmentJsLogConsoleBinding2.appletJsLogProgress;
        AppletFragmentJsLogConsoleBinding appletFragmentJsLogConsoleBinding3 = this.binding;
        Objects.requireNonNull(appletFragmentJsLogConsoleBinding3);
        this.noDataLayout = appletFragmentJsLogConsoleBinding3.appletNoDataLayout;
        AppletFragmentJsLogConsoleBinding appletFragmentJsLogConsoleBinding4 = this.binding;
        Objects.requireNonNull(appletFragmentJsLogConsoleBinding4);
        appletFragmentJsLogConsoleBinding4.appletClearLog.setOnClickListener(new View.OnClickListener() { // from class: eh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AppLogFragment.b(this.a, view2);
            }
        });
        d();
    }
}
