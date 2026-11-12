package com.xiaomi.infra.galaxy.fds.model;

import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.Action;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public class NotificationEvent {
    private String a;
    private String b;
    private Action c;
    private String d;
    private String e;
    private Long f;
    private Long g;
    private Integer h;
    private List<AccessControlList.Grant> i;
    private Map<String, String> j;

    public NotificationEvent(String str, String str2, Action action) {
        this.d = UUID.randomUUID().toString();
        this.a = str;
        this.b = str2;
        this.c = action;
    }

    public static NotificationEvent fromJson(String str) {
        return (NotificationEvent) new Gson().fromJson(str, NotificationEvent.class);
    }

    public Action getAction() {
        return this.c;
    }

    public String getBucketName() {
        return this.a;
    }

    public List<AccessControlList.Grant> getGrants() {
        return this.i;
    }

    public Map<String, String> getMetadata() {
        return this.j;
    }

    public Integer getObjectIncrement() {
        return this.h;
    }

    public String getObjectName() {
        return this.b;
    }

    public Long getSpaceIncrement() {
        return this.g;
    }

    public Long getTimestamp() {
        return this.f;
    }

    public String getUuid() {
        return this.d;
    }

    public String getVersionId() {
        return this.e;
    }

    public void setAction(Action action) {
        this.c = action;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setGrants(List<AccessControlList.Grant> list) {
        this.i = list;
    }

    public void setMetadata(Map<String, String> map) {
        this.j = map;
    }

    public void setObjectIncrement(Integer num) {
        this.h = num;
    }

    public void setObjectName(String str) {
        this.b = str;
    }

    public void setSpaceIncrement(Long l) {
        this.g = l;
    }

    public void setTimestamp(Long l) {
        this.f = l;
    }

    public void setUuid(String str) {
        this.d = str;
    }

    public void setVersionId(String str) {
        this.e = str;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }

    public NotificationEvent(String str, String str2, Action action, Long l, Long l2, Integer num) {
        this(str, str2, action);
        this.f = l;
        this.g = l2;
        this.h = num;
    }

    public NotificationEvent(String str, String str2, Action action, Long l, Long l2, Integer num, List<AccessControlList.Grant> list, Map<String, String> map) {
        this(str, str2, action, l, l2, num);
        this.i = list;
        this.j = map;
    }
}
