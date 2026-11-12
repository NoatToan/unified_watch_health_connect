package com.xiaomi.fitness.electronic.scale.model;

import android.graphics.Path;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class FatAnalysisBean implements Serializable {
    private float fillAlpha;
    private String fillColor;
    private String fillType;
    private String name;
    private Path path;
    private float strokeAlpha;
    private String strokeColor;
    private String strokeLineCap;
    private String strokeLineJoin;
    private float strokeWidth;

    public FatAnalysisBean() {
    }

    public float getFillAlpha() {
        return this.fillAlpha;
    }

    public String getFillColor() {
        return this.fillColor;
    }

    public String getFillType() {
        return this.fillType;
    }

    public String getName() {
        return this.name;
    }

    public Path getPath() {
        return this.path;
    }

    public float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    public String getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public void setFillAlpha(float f) {
        this.fillAlpha = f;
    }

    public void setFillColor(String str) {
        this.fillColor = str;
    }

    public void setFillType(String str) {
        this.fillType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public void setStrokeAlpha(float f) {
        this.strokeAlpha = f;
    }

    public void setStrokeColor(String str) {
        this.strokeColor = str;
    }

    public void setStrokeWidth(float f) {
        this.strokeWidth = f;
    }

    public FatAnalysisBean(Path path, float f, String str, float f2, String str2, String str3, String str4, String str5, float f3, String str6) {
        this.path = path;
        this.strokeLineJoin = str;
        this.strokeLineCap = str3;
        this.strokeAlpha = f;
        this.strokeWidth = f2;
        this.strokeColor = str2;
        this.fillColor = str4;
        this.fillType = str5;
        this.fillAlpha = f3;
        this.name = str6;
        if (path != null) {
            if ("evenOdd".equals(str5)) {
                this.path.setFillType(Path.FillType.EVEN_ODD);
            } else {
                this.path.setFillType(Path.FillType.WINDING);
            }
        }
    }
}
