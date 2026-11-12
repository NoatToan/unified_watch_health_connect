package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes4.dex */
public final class GeoParsedResult extends ParsedResult {
    private final double b;
    private final double c;
    private final double d;
    private final String e;

    public GeoParsedResult(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = str;
    }

    public double getAltitude() {
        return this.d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        if (this.d > 0.0d) {
            sb.append(", ");
            sb.append(this.d);
            sb.append('m');
        }
        if (this.e != null) {
            sb.append(" (");
            sb.append(this.e);
            sb.append(')');
        }
        return sb.toString();
    }

    public String getGeoURI() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        if (this.d > 0.0d) {
            sb.append(',');
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append('?');
            sb.append(this.e);
        }
        return sb.toString();
    }

    public double getLatitude() {
        return this.b;
    }

    public double getLongitude() {
        return this.c;
    }

    public String getQuery() {
        return this.e;
    }
}
