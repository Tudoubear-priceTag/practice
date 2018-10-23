package com.nsb.practice.excel;

import java.util.List;

/**
 * for the append strategy
 * @author Dorae
 *
 * @param <T>
 */
public abstract class AbstractDataSupplier<T> {
	
	public abstract Pair<List<T>, Boolean> getDatas();

}
