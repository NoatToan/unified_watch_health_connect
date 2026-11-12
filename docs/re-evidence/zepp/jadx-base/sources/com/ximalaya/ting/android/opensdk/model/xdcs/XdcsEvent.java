package com.ximalaya.ting.android.opensdk.model.xdcs;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class XdcsEvent extends BaseEvent {
    public Map<String, String> props = new HashMap();

    public Map<String, String> getProps() {
        return this.props;
    }

    public void setProps(Map<String, String> map) {
        this.props = map;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.xdcs.BaseEvent
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("XdcsEvent { ");
        for (Map.Entry<String, String> entry : this.props.entrySet()) {
            sb.append(entry.getKey() + " : " + entry.getValue() + " ");
        }
        sb.append(" } ");
        return sb.toString();
    }
}
