package com.huami.account.service.lifecycle;

import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/account/service/lifecycle/AccountLifecycle;", "", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "getCurrentState", "Lcom/huami/account/service/lifecycle/AccountLifecycleObserver;", "observer", "", "addObserver", "removeObserver", TrainingAnalytics.ParamKey.STATE, "service_release"}, k = 1, mv = {1, 5, 1})
public interface AccountLifecycle {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "", "<init>", "()V", "LoggedIn", "Logout", "NewUser", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State$Logout;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State$NewUser;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State$LoggedIn;", "service_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class State {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/service/lifecycle/AccountLifecycle$State$LoggedIn;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "Lcom/huami/account/service/lifecycle/LoginStateType;", "a", "Lcom/huami/account/service/lifecycle/LoginStateType;", "getType", "()Lcom/huami/account/service/lifecycle/LoginStateType;", "type", "<init>", "(Lcom/huami/account/service/lifecycle/LoginStateType;)V", "service_release"}, k = 1, mv = {1, 5, 1})
        public static final class LoggedIn extends State {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final LoginStateType type;

            public LoggedIn(@NotNull LoginStateType loginStateType) {
                super(null);
                this.type = loginStateType;
            }

            @NotNull
            public final LoginStateType getType() {
                return this.type;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/service/lifecycle/AccountLifecycle$State$Logout;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "Lcom/huami/account/service/lifecycle/LogoutStateType;", "a", "Lcom/huami/account/service/lifecycle/LogoutStateType;", "getType", "()Lcom/huami/account/service/lifecycle/LogoutStateType;", "type", "<init>", "(Lcom/huami/account/service/lifecycle/LogoutStateType;)V", "service_release"}, k = 1, mv = {1, 5, 1})
        public static final class Logout extends State {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final LogoutStateType type;

            public Logout(@NotNull LogoutStateType logoutStateType) {
                super(null);
                this.type = logoutStateType;
            }

            @NotNull
            public final LogoutStateType getType() {
                return this.type;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/account/service/lifecycle/AccountLifecycle$State$NewUser;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State;", "", "a", "Z", "isFromBoot", "()Z", "<init>", "(Z)V", "service_release"}, k = 1, mv = {1, 5, 1})
        public static final class NewUser extends State {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isFromBoot;

            public NewUser(boolean z) {
                super(null);
                this.isFromBoot = z;
            }

            /* JADX INFO: renamed from: isFromBoot, reason: from getter */
            public final boolean getIsFromBoot() {
                return this.isFromBoot;
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void addObserver(@NotNull AccountLifecycleObserver observer);

    @NotNull
    State getCurrentState();

    void removeObserver(@NotNull AccountLifecycleObserver observer);
}
