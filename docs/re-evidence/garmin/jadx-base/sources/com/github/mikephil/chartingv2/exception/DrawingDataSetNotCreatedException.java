package com.github.mikephil.chartingv2.exception;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class DrawingDataSetNotCreatedException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public DrawingDataSetNotCreatedException() {
        super("Have to create a new drawing set first. Call ChartData's createNewDrawingDataSet() method");
    }
}
