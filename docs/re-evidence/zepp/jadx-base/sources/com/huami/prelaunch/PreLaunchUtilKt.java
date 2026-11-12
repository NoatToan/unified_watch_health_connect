package com.huami.prelaunch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.prelaunch.elements.Entry;
import com.huami.prelaunch.elements.Picture;
import com.huami.prelaunch.elements.Text;
import com.huami.tools.log.HMLog;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a5\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\rH\u0007\u001a5\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\rH\u0007\u001a5\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\rH\u0007\u001a\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0018\u001a\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\b\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0019"}, d2 = {"Landroid/widget/TextView;", "textView", "Lcom/huami/prelaunch/elements/Text;", "text", "", "setText", "Landroid/widget/ImageView;", "imageView", "Lcom/huami/prelaunch/elements/Picture;", SportAnalytics.ParamKey.PIC, "setImage", "Lcom/huami/prelaunch/elements/Entry;", "entry", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "state", "callback", "getEntryState", "", "url", "getPicture", "getText", "(Lcom/huami/prelaunch/elements/Entry;)Ljava/lang/Boolean;", "prelaunch_release"}, k = 2, mv = {1, 4, 0})
public final class PreLaunchUtilKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 0})
    public static final class a<V, T> implements Callable<T> {
        public final /* synthetic */ Entry a;

        public a(Entry entry) {
            this.a = entry;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean call() {
            return PreLaunchUtilKt.getEntryState(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 0})
    public static final class b<T> implements Consumer<Boolean> {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@Nullable Boolean bool) {
            this.a.invoke(bool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 4, 0})
    public static final class c<T> implements Consumer<Throwable> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "";
            }
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            HMLog.warn$default(null, th, a.a, 1, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 4, 0})
    public static final class d<V, T> implements Callable<T> {
        public final /* synthetic */ Picture a;

        public d(Picture picture) {
            this.a = picture;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String call() {
            return PreLaunchUtilKt.getPicture(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 4, 0})
    public static final class e<T> implements Consumer<String> {
        public final /* synthetic */ Function1 a;

        public e(Function1 function1) {
            this.a = function1;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@Nullable String str) {
            this.a.invoke(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 4, 0})
    public static final class f<T> implements Consumer<Throwable> {
        public static final f a = new f();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "";
            }
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            HMLog.warn$default(null, th, a.a, 1, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 4, 0})
    public static final class g<V, T> implements Callable<T> {
        public final /* synthetic */ Text a;

        public g(Text text) {
            this.a = text;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String call() {
            return PreLaunchUtilKt.getText(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 4, 0})
    public static final class h<T> implements Consumer<String> {
        public final /* synthetic */ Function1 a;

        public h(Function1 function1) {
            this.a = function1;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@Nullable String str) {
            this.a.invoke(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 4, 0})
    public static final class i<T> implements Consumer<Throwable> {
        public static final i a = new i();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "";
            }
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            HMLog.warn$default(null, th, a.a, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class j extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ ImageView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ImageView imageView) {
            super(1);
            this.a = imageView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            PreLaunchApi.Companion companion = PreLaunchApi.INSTANCE;
            companion.getIPreLaunch().loadImage(companion.getSContext(), this.a, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class k extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ TextView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextView textView) {
            super(1);
            this.a = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            this.a.setText(str);
        }
    }

    @SuppressLint({"CheckResult"})
    public static final void getEntryState(@NotNull Entry entry, @NotNull Function1<? super Boolean, Unit> function1) {
        Observable.fromCallable(new a(entry)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(function1), c.a);
    }

    @SuppressLint({"CheckResult"})
    public static final void getPicture(@NotNull Picture picture, @NotNull Function1<? super String, Unit> function1) {
        Observable.fromCallable(new d(picture)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new e(function1), f.a);
    }

    @SuppressLint({"CheckResult"})
    public static final void getText(@NotNull Text text, @NotNull Function1<? super String, Unit> function1) {
        Observable.fromCallable(new g(text)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new h(function1), i.a);
    }

    public static final void setImage(@NotNull ImageView imageView, @NotNull Picture picture) {
        PreLaunchCache preLaunchCache = PreLaunchCache.INSTANCE;
        String picture2 = preLaunchCache.getPicture(picture);
        if (picture2 == null || picture2.length() == 0) {
            imageView.setImageResource(picture.getDefaultPic());
        } else {
            PreLaunchApi.Companion companion = PreLaunchApi.INSTANCE;
            IPreLaunch iPreLaunch = companion.getIPreLaunch();
            Context sContext = companion.getSContext();
            String picture3 = preLaunchCache.getPicture(picture);
            if (picture3 == null) {
                Intrinsics.throwNpe();
            }
            iPreLaunch.loadImage(sContext, imageView, picture3);
        }
        getPicture(picture, new j(imageView));
    }

    public static final void setText(@NotNull TextView textView, @NotNull Text text) {
        String text2 = PreLaunchCache.getText(text);
        if (!(text2 == null || text2.length() == 0)) {
            textView.setText(PreLaunchCache.getText(text));
        }
        getText(text, new k(textView));
    }

    @Nullable
    public static final Boolean getEntryState(@NotNull Entry entry) {
        PreLaunchItem preLaunchItem = PreLaunchApi.INSTANCE.getPreLaunch(entry.getConfigName()).get(entry.getElementName());
        Boolean boolValueOf = preLaunchItem != null ? Boolean.valueOf(preLaunchItem.isOn()) : null;
        if (boolValueOf != null) {
            PreLaunchCache.setEntryState(entry, boolValueOf.booleanValue());
        }
        return boolValueOf;
    }

    @Nullable
    public static final String getPicture(@NotNull Picture picture) {
        PreLaunchItem preLaunchItem = PreLaunchApi.INSTANCE.getPreLaunch(picture.getConfigName()).get(picture.getElementName());
        String value = preLaunchItem != null ? preLaunchItem.getValue() : null;
        Log.i("coderJay", "url: " + value);
        if (value instanceof String) {
            PreLaunchCache.setPicture(picture, value);
        }
        return value;
    }

    @Nullable
    public static final String getText(@NotNull Text text) {
        PreLaunchItem preLaunchItem = PreLaunchApi.INSTANCE.getPreLaunch(text.getConfigName()).get(text.getElementName());
        String desc = preLaunchItem != null ? preLaunchItem.getDesc() : null;
        Log.i("coderJay", "text: " + desc);
        if (desc instanceof String) {
            PreLaunchCache.setText(text, desc);
        }
        if (preLaunchItem != null) {
            return preLaunchItem.getDesc();
        }
        return null;
    }
}
