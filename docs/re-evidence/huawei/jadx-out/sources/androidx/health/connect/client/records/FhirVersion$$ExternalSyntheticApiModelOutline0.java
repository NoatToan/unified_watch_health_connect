package androidx.health.connect.client.records;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsRequest;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.CreateMedicalDataSourceRequest;
import android.health.connect.DeleteMedicalResourcesRequest;
import android.health.connect.GetMedicalDataSourcesRequest;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.ReadMedicalResourcesInitialRequest;
import android.health.connect.ReadMedicalResourcesPageRequest;
import android.health.connect.ReadMedicalResourcesRequest;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.health.connect.UpsertMedicalResourceRequest;
import android.health.connect.changelog.ChangeLogTokenRequest;
import android.health.connect.datatypes.AggregationType;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import android.net.Uri;
import android.os.SharedMemory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FhirVersion$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ AggregateRecordsRequest.Builder m(TimeRangeFilter timeRangeFilter) {
        return new AggregateRecordsRequest.Builder(timeRangeFilter);
    }

    public static /* synthetic */ CreateMedicalDataSourceRequest.Builder m(Uri uri, String str, android.health.connect.datatypes.FhirVersion fhirVersion) {
        return new CreateMedicalDataSourceRequest.Builder(uri, str, fhirVersion);
    }

    public static /* bridge */ /* synthetic */ CreateMedicalDataSourceRequest m(Object obj) {
        return (CreateMedicalDataSourceRequest) obj;
    }

    public static /* synthetic */ DeleteMedicalResourcesRequest.Builder m() {
        return new DeleteMedicalResourcesRequest.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteMedicalResourcesRequest m414m(Object obj) {
        return (DeleteMedicalResourcesRequest) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetMedicalDataSourcesRequest.Builder m415m() {
        return new GetMedicalDataSourcesRequest.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetMedicalDataSourcesRequest m416m(Object obj) {
        return (GetMedicalDataSourcesRequest) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ LocalTimeRangeFilter.Builder m417m() {
        return new LocalTimeRangeFilter.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.health.connect.MedicalResourceId m418m(Object obj) {
        return (android.health.connect.MedicalResourceId) obj;
    }

    public static /* synthetic */ android.health.connect.MedicalResourceId m(String str, int i, String str2) {
        return new android.health.connect.MedicalResourceId(str, i, str2);
    }

    public static /* synthetic */ ReadMedicalResourcesInitialRequest.Builder m(int i) {
        return new ReadMedicalResourcesInitialRequest.Builder(i);
    }

    public static /* synthetic */ ReadMedicalResourcesPageRequest.Builder m(String str) {
        return new ReadMedicalResourcesPageRequest.Builder(str);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ReadMedicalResourcesRequest m419m(Object obj) {
        return (ReadMedicalResourcesRequest) obj;
    }

    public static /* synthetic */ ReadRecordsRequestUsingFilters.Builder m(Class cls) {
        return new ReadRecordsRequestUsingFilters.Builder(cls);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TimeInstantRangeFilter.Builder m420m() {
        return new TimeInstantRangeFilter.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TimeRangeFilter m421m(Object obj) {
        return (TimeRangeFilter) obj;
    }

    public static /* synthetic */ UpsertMedicalResourceRequest.Builder m(String str, android.health.connect.datatypes.FhirVersion fhirVersion, String str2) {
        return new UpsertMedicalResourceRequest.Builder(str, fhirVersion, str2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ UpsertMedicalResourceRequest m422m(Object obj) {
        return (UpsertMedicalResourceRequest) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ ChangeLogTokenRequest.Builder m423m() {
        return new ChangeLogTokenRequest.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AggregationType m424m(Object obj) {
        return (AggregationType) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DataOrigin m425m(Object obj) {
        return (DataOrigin) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.health.connect.datatypes.ExerciseRoute m426m(Object obj) {
        return (android.health.connect.datatypes.ExerciseRoute) obj;
    }

    public static /* synthetic */ android.health.connect.datatypes.FhirResource.Builder m(int i, String str, String str2) {
        return new android.health.connect.datatypes.FhirResource.Builder(i, str, str2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.health.connect.datatypes.FhirResource m427m(Object obj) {
        return (android.health.connect.datatypes.FhirResource) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.health.connect.datatypes.FhirVersion m428m(Object obj) {
        return (android.health.connect.datatypes.FhirVersion) obj;
    }

    public static /* synthetic */ android.health.connect.datatypes.MedicalDataSource.Builder m(String str, String str2, Uri uri, String str3, android.health.connect.datatypes.FhirVersion fhirVersion) {
        return new android.health.connect.datatypes.MedicalDataSource.Builder(str, str2, uri, str3, fhirVersion);
    }

    public static /* synthetic */ android.health.connect.datatypes.MedicalResource.Builder m(int i, String str, android.health.connect.datatypes.FhirVersion fhirVersion, android.health.connect.datatypes.FhirResource fhirResource) {
        return new android.health.connect.datatypes.MedicalResource.Builder(i, str, fhirVersion, fhirResource);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Energy m430m(Object obj) {
        return (Energy) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Length m431m(Object obj) {
        return (Length) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Mass m432m(Object obj) {
        return (Mass) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Power m433m(Object obj) {
        return (Power) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Pressure m434m(Object obj) {
        return (Pressure) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TemperatureDelta m435m(Object obj) {
        return (TemperatureDelta) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Velocity m436m(Object obj) {
        return (Velocity) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Volume m437m(Object obj) {
        return (Volume) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SharedMemory m439m(Object obj) {
        return (SharedMemory) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m440m() {
        return AggregateRecordsResponse.class;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m445m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AggregateRecordsGroupedByDurationResponse.class;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m446m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return AggregateRecordsGroupedByPeriodResponse.class;
    }

    /* JADX INFO: renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m447m$2() {
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return android.health.connect.datatypes.ExerciseRoute.class;
    }

    /* JADX INFO: renamed from: m$3, reason: collision with other method in class */
    public static /* synthetic */ void m448m$3() {
    }

    public static /* synthetic */ void m$4() {
    }

    public static /* synthetic */ void m$5() {
    }

    public static /* synthetic */ void m$6() {
    }

    public static /* synthetic */ void m$7() {
    }

    public static /* synthetic */ void m$8() {
    }

    public static /* synthetic */ void m$9() {
    }
}
