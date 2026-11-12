package com.xiaomi.hm.health.bt.scan;

import com.xiaomi.hm.health.bt.scan.filter.DeviceFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
public class BleScanOption {
    public static final int SCAN_ALWAYS = -1;
    private int a;
    private List<UUID> b;
    private List<String> c;
    private List<String> d;
    private DeviceFilter e;
    private IBleScanCallback f;
    private boolean g;

    public static class Builder {
        private DeviceFilter e;
        private int a = -1;
        private List<UUID> b = new ArrayList();
        private List<String> c = new ArrayList();
        private List<String> d = new ArrayList();
        private IBleScanCallback f = null;
        private boolean g = false;

        public BleScanOption build() {
            return new BleScanOption(this);
        }

        public Builder callback(IBleScanCallback sr) {
            this.f = sr;
            return this;
        }

        public Builder filterAddress(String address) {
            this.d.add(address);
            return this;
        }

        public Builder filterName(String name) {
            this.c.add(name);
            return this;
        }

        public Builder filterNames(List<String> names) {
            this.c.addAll(names);
            return this;
        }

        public Builder filterUUID(UUID uuid) {
            this.b.add(uuid);
            return this;
        }

        public Builder needConnectedDevices(boolean need) {
            this.g = need;
            return this;
        }

        public Builder scanTimeout(int timeout) {
            this.a = timeout;
            return this;
        }

        public Builder setFilter(DeviceFilter filter) {
            this.e = filter;
            return this;
        }
    }

    public IBleScanCallback getCallback() {
        return this.f;
    }

    public DeviceFilter getFilter() {
        return this.e;
    }

    public List<String> getFilterAddress() {
        return this.d;
    }

    public List<String> getFilterNames() {
        return this.c;
    }

    public List<UUID> getFilterUUIDs() {
        return this.b;
    }

    public boolean getNeedConnectedDevice() {
        return this.g;
    }

    public int getTimeout() {
        return this.a;
    }

    public String toString() {
        return "timeout:" + this.a + ",filterUuid size:" + this.b.size() + ",filterAddress:" + this.d + ",needConnectedDevice:" + this.g;
    }

    private BleScanOption(Builder builder) {
        this.a = -1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
        this.g = false;
        this.a = builder.a;
        this.b = builder.b;
        this.d = builder.d;
        this.c = builder.c;
        this.f = builder.f;
        this.e = builder.e;
        this.g = builder.g;
    }
}
