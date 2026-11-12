package com.huami.assistant.dataexchange.actions;

import com.huami.assistant.dataexchange.Actions;
import com.huami.assistant.model.bean.Pin;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.transport.DataBundle;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class PinAction extends Action {
    private static final String f = "PinInfo";
    public Pin pin;
    public String pinInfo;

    public PinAction() {
    }

    public PinAction pin(String info) {
        this.pinInfo = info;
        return this;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String target() {
        return Actions.PIN;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String toString() {
        return SearchCriteria.LT + super.toString() + ", " + this.pinInfo + ", Pin : " + this.pin + SearchCriteria.GT;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public DataBundle toWatchData() {
        DataBundle watchData = super.toWatchData();
        watchData.putString(f, this.pinInfo);
        return watchData;
    }

    public PinAction(DataBundle data) {
        super(data);
        this.pinInfo = data.getString(f);
    }

    public PinAction pin(Pin pin) {
        this.pin = pin;
        return this;
    }
}
