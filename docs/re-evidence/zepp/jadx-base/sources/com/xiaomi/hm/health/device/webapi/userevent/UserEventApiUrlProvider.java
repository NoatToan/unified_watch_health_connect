package com.xiaomi.hm.health.device.webapi.userevent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J/\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/userevent/UserEventApiUrlProvider;", "", "Lkotlin/Function0;", "", "component1", "Lkotlin/Function1;", "component2", "eventsUrl", "eventUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/jvm/functions/Function0;", "getEventsUrl", "()Lkotlin/jvm/functions/Function0;", "b", "Lkotlin/jvm/functions/Function1;", "getEventUrl", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserEventApiUrlProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<String> eventsUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function1<String, String> eventUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public UserEventApiUrlProvider(@NotNull Function0<String> function0, @NotNull Function1<? super String, String> function1) {
        this.eventsUrl = function0;
        this.eventUrl = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEventApiUrlProvider copy$default(UserEventApiUrlProvider userEventApiUrlProvider, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = userEventApiUrlProvider.eventsUrl;
        }
        if ((i & 2) != 0) {
            function1 = userEventApiUrlProvider.eventUrl;
        }
        return userEventApiUrlProvider.copy(function0, function1);
    }

    @NotNull
    public final Function0<String> component1() {
        return this.eventsUrl;
    }

    @NotNull
    public final Function1<String, String> component2() {
        return this.eventUrl;
    }

    @NotNull
    public final UserEventApiUrlProvider copy(@NotNull Function0<String> eventsUrl, @NotNull Function1<? super String, String> eventUrl) {
        return new UserEventApiUrlProvider(eventsUrl, eventUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventApiUrlProvider)) {
            return false;
        }
        UserEventApiUrlProvider userEventApiUrlProvider = (UserEventApiUrlProvider) other;
        return Intrinsics.areEqual(this.eventsUrl, userEventApiUrlProvider.eventsUrl) && Intrinsics.areEqual(this.eventUrl, userEventApiUrlProvider.eventUrl);
    }

    @NotNull
    public final Function1<String, String> getEventUrl() {
        return this.eventUrl;
    }

    @NotNull
    public final Function0<String> getEventsUrl() {
        return this.eventsUrl;
    }

    public int hashCode() {
        return (this.eventsUrl.hashCode() * 31) + this.eventUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserEventApiUrlProvider(eventsUrl=" + this.eventsUrl + ", eventUrl=" + this.eventUrl + ")";
    }
}
