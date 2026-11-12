package com.xiaomi.hm.health.watermarkcamera.utils;

/* JADX INFO: loaded from: classes22.dex */
public class MeasurementAdapterFactory {

    public interface ILengthMeasurementAdapter {
        Measurement getLength(double d);

        Measurement getPace(double d);

        Measurement getShortLength(double d);

        Measurement getSpeed(double d);

        MeasurementStandard getStandard();
    }

    public static class Measurement {
        public double mMeasure;
        public Unit mUnit;

        public Measurement(double d, Unit unit) {
            this.mMeasure = 0.0d;
            this.mUnit = Unit.Unknown;
            this.mMeasure = d;
            this.mUnit = unit;
        }
    }

    public enum MeasurementStandard {
        Metric,
        British,
        Chinese
    }

    public enum Unit {
        Foot,
        Jin,
        KG,
        Kilometer,
        Meter,
        Mile,
        Pound,
        Unknown,
        MinPerKm,
        MinPerMile,
        KmPerHour,
        MilePerHour
    }

    public static final class a implements ILengthMeasurementAdapter {
        private a() {
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getLength(double d) {
            return new Measurement(d / 1.609344d, Unit.Mile);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getPace(double d) {
            return new Measurement(d * 1.609344d, Unit.MinPerMile);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getShortLength(double d) {
            return new Measurement(d * 3.2808399200439453d, Unit.Foot);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getSpeed(double d) {
            return new Measurement(d / 1.609344d, Unit.MilePerHour);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public MeasurementStandard getStandard() {
            return MeasurementStandard.British;
        }
    }

    public static final class b implements ILengthMeasurementAdapter {
        private b() {
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getLength(double d) {
            return new Measurement(d, Unit.Kilometer);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getPace(double d) {
            return new Measurement(d, Unit.MinPerKm);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getShortLength(double d) {
            return new Measurement(d, Unit.Meter);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public Measurement getSpeed(double d) {
            return new Measurement(d, Unit.KmPerHour);
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.MeasurementAdapterFactory.ILengthMeasurementAdapter
        public MeasurementStandard getStandard() {
            return MeasurementStandard.Metric;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ILengthMeasurementAdapter createLengthMeasurementAdapter(boolean z) {
        return z ? new b() : new a();
    }
}
