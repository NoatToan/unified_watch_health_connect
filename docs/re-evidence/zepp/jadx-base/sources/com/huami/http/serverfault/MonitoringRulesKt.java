package com.huami.http.serverfault;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\"\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005¨\u0006\r"}, d2 = {"", "Lcom/huami/http/serverfault/MonitoringRules;", "a", "Ljava/util/List;", "getHomeUrlRules", "()Ljava/util/List;", "homeUrlRules", "b", "getAccountUrlRules", "accountUrlRules", "c", "getLogoutUrlRules", "logoutUrlRules", "serverfault_release"}, k = 2, mv = {1, 4, 0})
public final class MonitoringRulesKt {

    @NotNull
    private static final List<MonitoringRules> a = CollectionsKt__CollectionsKt.listOf((Object[]) new MonitoringRules[]{new MonitoringRules("/users/{userId}/devices", new Regex("[^\\s]+/users/[0-9]+/devices[^\\s]*")), new MonitoringRules("/users/{userId}/deviceTypes/{deviceType}/data", new Regex("[^\\s]+/users/[0-9]+/deviceTypes/[\\w]+/data[^\\s]*")), new MonitoringRules("/v1/device/binds.json", new Regex("[^\\s]+/v1/device/binds.json[^\\s]*")), new MonitoringRules("/v1/watch/binds.json", new Regex("[^\\s]+/v1/watch/binds.json[^\\s]*")), new MonitoringRules("/v1/device/lists.json", new Regex("[^\\s]+/v1/device/lists.json[^\\s]*")), new MonitoringRules("/v1/data/band_data.json", new Regex("[^\\s]+/v1/data/band_data.json[^\\s]*")), new MonitoringRules("users/{userid}/properties", new Regex("[^\\s]+users/[0-9]+/properties[^\\s]*"))});

    @NotNull
    private static final List<MonitoringRules> b = CollectionsKt__CollectionsKt.listOf((Object[]) new MonitoringRules[]{new MonitoringRules("v2/client/login", new Regex("[^\\s]+v2/client/login[^\\s]*")), new MonitoringRules("huami.health.getUserInfo.json", new Regex("[^\\s]+huami.health.getUserInfo.json[^\\s]*")), new MonitoringRules("v1/device/lists.json", new Regex("[^\\s]+v1/device/lists.json[^\\s]*")), new MonitoringRules("users/{userid}/properties", new Regex("[^\\s]+users/[0-9]+/properties[^\\s]*")), new MonitoringRules("v1/client/list_accounts", new Regex("[^\\s]+v1/client/list_accounts[^\\s]*")), new MonitoringRules("registrations/{phone}/sms/binding", new Regex("[^\\s]+registrations/[^\\s]+/sms/binding[^\\s]*")), new MonitoringRules("registrations/{phoneOrEmail}", new Regex("[^\\s]+registrations/[^/]+")), new MonitoringRules("v1/client/bind_account", new Regex("[^\\s]+v1/client/bind_account[^\\s]*")), new MonitoringRules("huami.health.bindProfile.json", new Regex("[^\\s]+huami.health.bindProfile.json[^\\s]*")), new MonitoringRules("v1/client/register", new Regex("[^\\s]+v1/client/register[^\\s]*")), new MonitoringRules("registrations/{phoneOrEmail}/tokens", new Regex("[^\\s]+registrations/[^\\s]+/tokens[^\\s]*")), new MonitoringRules("registrations/{phone}/{area}/verify", new Regex("[^\\s]+registrations/[^\\s]+/[^\\s]+/verify[^\\s]*"))});

    @NotNull
    private static final List<MonitoringRules> c = CollectionsKt__CollectionsKt.listOf((Object[]) new MonitoringRules[]{new MonitoringRules("/huami.health.bindProfile.json", new Regex("[^\\s]+/huami.health.bindProfile.json[^\\s]*")), new MonitoringRules("/huami.health.scale.familymember.save.json", new Regex("[^\\s]+/huami.health.scale.familymember.save.json[^\\s]*")), new MonitoringRules("/users/{userId}/latestEffectiveUpdateTime", new Regex("[^\\s]+/users/[0-9]+/latestEffectiveUpdateTime[^\\s]*")), new MonitoringRules("/users/{userId}/heartRate", new Regex("[^\\s]+/users/[0-9]+/heartRate[^\\s]*")), new MonitoringRules("/v1/sport/run/history.json", new Regex("[^\\s]+/v1/sport/run/history.json[^\\s]*")), new MonitoringRules("/watch/users/{userId}/WatchSportStatistics/VO2_MAX", new Regex("[^\\s]+/watch/users/[0-9]+/WatchSportStatistics/VO2_MAX[^\\s]*")), new MonitoringRules("/watch/users/{userId}/WatchSportStatistics/SPORT_LOAD", new Regex("[^\\s]+/watch/users/[0-9]+/WatchSportStatistics/SPORT_LOAD[^\\s]*")), new MonitoringRules("/user/{userId}/sortedValues", new Regex("[^\\s]+/user/[0-9]+/sortedValues[^\\s]*")), new MonitoringRules("/users/{userId}", new Regex("[^\\s]+/users/[0-9]+$"))});

    @NotNull
    public static final List<MonitoringRules> getAccountUrlRules() {
        return b;
    }

    @NotNull
    public static final List<MonitoringRules> getHomeUrlRules() {
        return a;
    }

    @NotNull
    public static final List<MonitoringRules> getLogoutUrlRules() {
        return c;
    }
}
