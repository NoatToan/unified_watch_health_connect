package com.beaglebuddy.mpeg.pojo;

import com.beaglebuddy.mpeg.enums.GainOriginator;
import com.beaglebuddy.mpeg.enums.GainType;
import com.beaglebuddy.util.Utility;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes2.dex */
public class ReplayGain {
    private GainType a;
    private GainOriginator b;
    private boolean c;
    private int d;

    public ReplayGain(GainType gainType, GainOriginator gainOriginator, boolean z, int i) {
        this.a = gainType;
        this.b = gainOriginator;
        this.c = z;
        this.d = i;
    }

    public int getGain() {
        return this.d;
    }

    public GainOriginator getOriginator() {
        return this.b;
    }

    public GainType getType() {
        return this.a;
    }

    public boolean isDecrease() {
        return !this.c;
    }

    public boolean isIncrease() {
        return this.c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("type......: " + this.a + "\n");
        stringBuffer.append(Utility.pad(35) + "originator: " + this.b + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append(Utility.pad(35));
        sb.append("direction.: ");
        sb.append(this.c ? Argument.IN : "de");
        sb.append("crease\n");
        stringBuffer.append(sb.toString());
        stringBuffer.append(Utility.pad(35) + "gain......: " + this.d);
        return stringBuffer.toString();
    }
}
