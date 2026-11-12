package com.huawei.hms.framework.network.restclient.hwhttp.dns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DnsResult {
    public static final int INVALID = 2;
    public static final String KEY_ADDRESSLIST = "addressList";
    public static final String KEY_ATN_CODE = "atnCode";
    public static final String KEY_CREATE_TIME = "createTime";
    public static final String KEY_TTL = "ttl";
    public static final String KEY_TYPE = "type";
    public static final String KEY_VALUE = "value";
    public static final int NEED_UPDATE = 1;
    public static final long TIME_TO_LIVE = 600000;
    public static final long TIME_TO_UPDATE = 86400000;
    public static final String TYPE_A = "A";
    public static final String TYPE_AAAA = "AAAA";
    public static final String TYPE_ALL = "ALL";
    public static final String TYPE_CNAME = "CNAME";
    public static final int VALID = 0;
    private int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13387a = "A";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Address> f13388b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13389c = System.currentTimeMillis();
    private int e = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("DnsResult{type='");
        sb.append(this.f13387a);
        sb.append('\'');
        sb.append(isEmpty() ? ", addressList isEmpty" : ", addressList is not Empty");
        sb.append(", createTime=");
        sb.append(this.f13389c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", cache=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }

    public void setType(String str) {
        this.f13387a = str;
    }

    public void setSource(int i) {
        this.d = i;
    }

    public void setCreateTime(long j) {
        this.f13389c = j;
    }

    public void setCache(int i) {
        this.e = i;
    }

    public void setAddressList(List<Address> list) {
        if (list == null) {
            this.f13388b = new ArrayList();
        } else {
            this.f13388b = list;
        }
    }

    public boolean isEmpty() {
        return this.f13388b.isEmpty();
    }

    public static class Address {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f13392c;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f13393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f13394b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f13395c = 2147483647L;

            public Builder value(String str) {
                this.f13394b = str;
                return this;
            }

            public Builder type(String str) {
                this.f13393a = str;
                return this;
            }

            public Builder ttl(long j) {
                this.f13395c = j;
                return this;
            }

            public Address build() {
                return new Address(this);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Address{type='");
            sb.append(this.f13390a);
            sb.append("', value is null='");
            sb.append(this.f13391b == null);
            sb.append("', ttl=");
            sb.append(this.f13392c);
            sb.append('}');
            return sb.toString();
        }

        public String getValue() {
            return this.f13391b;
        }

        public String getType() {
            return this.f13390a;
        }

        public long getTtl() {
            return this.f13392c;
        }

        private Address(Builder builder) {
            this.f13390a = builder.f13393a;
            this.f13391b = builder.f13394b;
            this.f13392c = builder.f13395c;
        }
    }

    public String getType() {
        return this.f13387a;
    }

    public int getStatus() {
        long jAbs = Math.abs(System.currentTimeMillis() - this.f13389c);
        if (jAbs < 600000) {
            return 0;
        }
        return jAbs < 86400000 ? 1 : 2;
    }

    public int getSource() {
        return this.d;
    }

    public List<String> getIpList() {
        ArrayList arrayList = new ArrayList(this.f13388b.size());
        Iterator<Address> it = this.f13388b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public long getCreateTime() {
        return this.f13389c;
    }

    public int getCache() {
        return this.e;
    }

    public List<Address> getAddressList() {
        return this.f13388b;
    }

    public void addAddress(List<Address> list) {
        this.f13388b.addAll(list);
    }

    public void addAddress(Address address) {
        this.f13388b.add(address);
    }
}
