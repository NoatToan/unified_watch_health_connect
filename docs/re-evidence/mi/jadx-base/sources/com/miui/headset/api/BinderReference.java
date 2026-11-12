package com.miui.headset.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/miui/headset/api/BinderReference;", "Proxy", "Landroid/os/IInterface;", "", "()V", "bound", "", "proxy", "getProxy", "()Landroid/os/IInterface;", "setProxy", "(Landroid/os/IInterface;)V", "Landroid/os/IInterface;", "serviceConnection", "com/miui/headset/api/BinderReference$serviceConnection$1", "Lcom/miui/headset/api/BinderReference$serviceConnection$1;", "tag", "", "getTag", "()Ljava/lang/String;", "connectService", "context", "Landroid/content/Context;", "createProxy", "service", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)Landroid/os/IInterface;", "disconnectService", "", "makeIntent", "Landroid/content/Intent;", "onBinderConnected", "onBinderDied", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeadsetClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadsetClient.kt\ncom/miui/headset/api/BinderReference\n+ 2 Kit.kt\ncom/miui/headset/api/KitKt\n*L\n1#1,578:1\n64#2:579\n62#2,4:580\n57#2:584\n33#2:585\n27#2:586\n58#2,11:587\n49#2:598\n33#2:599\n27#2:600\n50#2:601\n49#2:602\n33#2:603\n27#2:604\n50#2:605\n64#2:606\n62#2,4:607\n57#2:611\n33#2:612\n27#2:613\n58#2,11:614\n49#2:625\n33#2:626\n27#2:627\n50#2:628\n49#2:629\n33#2:630\n27#2:631\n50#2:632\n*S KotlinDebug\n*F\n+ 1 HeadsetClient.kt\ncom/miui/headset/api/BinderReference\n*L\n40#1:579\n40#1:580,4\n40#1:584\n40#1:585\n40#1:586\n40#1:587,11\n43#1:598\n43#1:599\n43#1:600\n43#1:601\n48#1:602\n48#1:603\n48#1:604\n48#1:605\n50#1:606\n50#1:607,4\n50#1:611\n50#1:612\n50#1:613\n50#1:614,11\n63#1:625\n63#1:626\n63#1:627\n63#1:628\n67#1:629\n67#1:630\n67#1:631\n67#1:632\n*E\n"})
public abstract class BinderReference<Proxy extends IInterface> {
    private volatile boolean bound;

    @Nullable
    private volatile Proxy proxy;

    @NotNull
    private final BinderReference$serviceConnection$1 serviceConnection = new ServiceConnection(this) { // from class: com.miui.headset.api.BinderReference$serviceConnection$1
        final /* synthetic */ BinderReference<Proxy> this$0;

        {
            this.this$0 = this;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            Object objM886constructorimpl;
            if (service != null) {
                BinderReference<Proxy> binderReference = this.this$0;
                try {
                    Result.Companion companion = Result.Companion;
                    binderReference.setProxy(binderReference.createProxy(service));
                    binderReference.onBinderConnected();
                    objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                if (thM889exceptionOrNullimpl != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                    sb.append("onServiceConnected");
                    sb.append(' ');
                    sb.append((Object) thM889exceptionOrNullimpl.toString());
                    thM889exceptionOrNullimpl.printStackTrace();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            String tag = this.this$0.getTag();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(tag);
            sb.append(' ');
            sb.append((Object) ("onServiceDisconnected, name= " + name));
            this.this$0.onBinderDied();
        }
    };

    public final boolean connectService(@NotNull Context context) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intentMakeIntent = makeIntent();
        try {
            Result.Companion companion = Result.Companion;
            this.bound = context.getApplicationContext().bindService(intentMakeIntent, this.serviceConnection, 1);
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append("bindService");
            sb.append(' ');
            sb.append((Object) thM889exceptionOrNullimpl.toString());
            thM889exceptionOrNullimpl.printStackTrace();
        }
        String tag = getTag();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb2.append(tag);
        sb2.append(' ');
        sb2.append((Object) ("connectService bound= " + this.bound));
        return this.bound;
    }

    @NotNull
    public abstract Proxy createProxy(@NotNull IBinder service);

    public final void disconnectService(@NotNull Context context) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        String tag = getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) ("disconnectService bound= " + this.bound));
        if (this.bound) {
            try {
                Result.Companion companion = Result.Companion;
                context.getApplicationContext().unbindService(this.serviceConnection);
                objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
                sb2.append("unbindService");
                sb2.append(' ');
                sb2.append((Object) thM889exceptionOrNullimpl.toString());
                thM889exceptionOrNullimpl.printStackTrace();
            }
            this.bound = false;
            this.proxy = null;
        }
    }

    @Nullable
    public final Proxy getProxy() {
        return this.proxy;
    }

    @NotNull
    public abstract String getTag();

    @NotNull
    public abstract Intent makeIntent();

    public void onBinderConnected() {
        String tag = getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) "onBinderConnected");
    }

    public void onBinderDied() {
        String tag = getTag();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append((Object) "onBinderDied");
    }

    public final void setProxy(@Nullable Proxy proxy) {
        this.proxy = proxy;
    }
}
