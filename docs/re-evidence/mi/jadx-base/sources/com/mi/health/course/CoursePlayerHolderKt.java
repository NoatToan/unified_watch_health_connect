package com.mi.health.course;

import com.google.android.exoplayer2.upstream.cache.c;
import com.mi.health.course.CoursePlayerHolderKt;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.im9;
import defpackage.mh8;
import defpackage.vee;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "CACHE_SIZE", "J", "", "TAG", "Ljava/lang/String;", "Lcom/google/android/exoplayer2/upstream/cache/c;", "cache$delegate", "Lkotlin/Lazy;", "getCache", "()Lcom/google/android/exoplayer2/upstream/cache/c;", DatabaseConstants.TABLE_CACHE, "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class CoursePlayerHolderKt {
    private static final long CACHE_SIZE = 1073741824;

    @NotNull
    private static final String TAG = "PlayerHolder";

    @NotNull
    private static final Lazy cache$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yv4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoursePlayerHolderKt.cache_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final c cache_delegate$lambda$0() {
        return new c(new File(im9.M()), new vee(CACHE_SIZE), new mh8(ApplicationExtKt.getApplication()), null, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getCache() {
        return (c) cache$delegate.getValue();
    }
}
